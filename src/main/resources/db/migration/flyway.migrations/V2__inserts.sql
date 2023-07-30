INSERT INTO user (id, surname, first_name, middle_name, email)
VALUES (1, 'Titov', 'Andrey', 'Ivanovich', 'a.titov@gmail.com'),
       (2, 'Tolstoy', 'Ivan', 'Viktorovich', 't.tolstoy@gmail.com'),
       (3, 'Saroka', 'Tatiana', 'Sergeevna', 's.saroka@gmail.com'),
       (4, 'Zayats', 'Yaroslan', 'Vladimirovich', 'y.zayats@gmail.com'),
       (5, 'Savich', 'Sergei', 'Alexandrovich', 's.savich@gmail.com'),
       (6, 'Straxov', 'Vladimir', 'Vasilievich', 'v.straxov@gmail.com'),
       (7, 'Grib', 'Mariya', 'Vasilievna', 'm.grib@gmail.com'),
       (8, 'Akulenets', 'Artem', 'Denisovich', 'a.akulenets@gmail.com'),
       (9, 'Yanova', 'Irina', 'Petrovovna', 'i.yanova@gmail.com'),
       (10, 'Bober', 'Dmitriy', 'Andreevich', 'b.bober@gmail.com');

INSERT INTO user_roles (user_id, roles)
VALUES (1, 'ROLE_ADMINISTRATOR'),
       (2, 'ROLE_SALE_USER'),
       (3, 'ROLE_CUSTOMER_USER'),
       (4, 'ROLE_ADMINISTRATOR'),
       (5, 'ROLE_SALE_USER'),
       (6, 'ROLE_CUSTOMER_USER'),
       (7, 'ROLE_CUSTOMER_USER'),
       (8, 'ROLE_SALE_USER'),
       (9, 'ROLE_SALE_USER'),
       (10, 'ROLE_SALE_USER');