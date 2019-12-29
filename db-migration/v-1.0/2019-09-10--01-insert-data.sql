--liquibase formatted sql logicalFilePath:2019-09-10--00-base-structure.sql


--changeset lepa_id:insert_data1
INSERT INTO dictionary_role(id, role_name) VALUES (1, 'СТУДЕНТ')
--changeset lepa_id:insert_data2
INSERT INTO dictionary_role(id, role_name) VALUES (2, 'ПРЕПОДАВАТЕЛЬ')
--changeset lepa_id:insert_data3
INSERT INTO system_user (id, login, first_name, last_name) VALUES (1, 'Ivan', 'Иван', 'Иванов')
--changeset lepa_id:insert_data4
INSERT INTO system_user (id, login, first_name, last_name) VALUES (2, 'Pyotr', 'Петр', 'Ольшанский')
--changeset lepa_id:insert_data5
INSERT INTO system_user (id, login, first_name, last_name) VALUES (3, 'Vasiliy', 'Василий', 'Петров')
--changeset lepa_id:insert_data6
INSERT INTO system_user (id, login, first_name, last_name) VALUES (4, 'Tanya', 'Таня', 'Бойко')
--changeset lepa_id:insert_data7
INSERT INTO system_user (id, login, first_name, last_name) VALUES (5, 'Anna', 'Анна', 'Евгеньевна')

--changeset lepa_id:insert_data8
INSERT INTO user_role (user_id, role_id) VALUES (1, 1)
--changeset lepa_id:insert_data9
INSERT INTO user_role (user_id, role_id) VALUES (2, 1)
--changeset lepa_id:insert_data10
INSERT INTO user_role (user_id, role_id) VALUES (3, 1)
--changeset lepa_id:insert_data11
INSERT INTO user_role (user_id, role_id) VALUES (4, 2)
--changeset lepa_id:insert_data12
INSERT INTO user_role (user_id, role_id) VALUES (5, 1)

--changeset lepa_id:insert_data13
INSERT INTO lesson_table (lesson_id, lesson_title) VALUES (1, 'Английский язык')
--changeset lepa_id:insert_data14
INSERT INTO lesson_table (lesson_id, lesson_title) VALUES (2, 'Математика')
--changeset lepa_id:insert_data15
INSERT INTO lesson_table (lesson_id, lesson_title) VALUES (3, 'Русский язык')
--changeset lepa_id:insert_data16
INSERT INTO lesson_table (lesson_id, lesson_title) VALUES (4, 'Литература')

--changeset lepa_id:insert_data17
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (1, 1, '2019-09-10 17:59:12.000000', 3)
--changeset lepa_id:insert_data18
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (2, 2, '2019-09-10 17:59:13.000000', 3)
--changeset lepa_id:insert_data19
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (3, 3, '2019-09-10 17:59:14.000000', 5)
--changeset lepa_id:insert_data20
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (5, 4, '2019-09-10 17:59:15.000000', 4)
--changeset lepa_id:insert_data21
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (1, 1, '2019-09-10 17:59:16.000000', 3)
--changeset lepa_id:insert_data22
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (2, 2, '2019-09-10 17:59:17.000000', 5)
--changeset lepa_id:insert_data23
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (2, 3, '2019-09-10 17:59:18.000000', 4)
--changeset lepa_id:insert_data24
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (3, 4, '2019-09-10 17:59:19.000000', 4)
--changeset lepa_id:insert_data25
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (5, 1, '2019-09-10 17:59:20.000000', 5)
--changeset lepa_id:insert_data26
INSERT INTO lesson_user (user_id, lesson_id, date_of_mark, mark) VALUES (1, 2, '2019-09-10 17:59:21.000000', 3)
