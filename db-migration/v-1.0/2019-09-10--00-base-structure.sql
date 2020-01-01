--liquibase formatted sql logicalFilePath:2019-09-10--00-base-structure.sql


--changeset lepa-id:base-structure
create table system_user
(
	id serial not null,
	login text not null,
	password text not null
);

create unique index system_user_id_uindex
	on system_user (id);

create unique index system_user_login_uindex
    on system_user (login);

alter table system_user
	add constraint system_user_pk
		primary key (login);
--rollback drop table system_user;


--changeset lepa-id:RoomWebSocket
create table rooms
(
     room_id serial not null,
     theme_room text not null,
     anti_theme_room text not null
);

alter table rooms
    add constraint rooms_pk
        primary key (room_id);
--rollback drop table rooms