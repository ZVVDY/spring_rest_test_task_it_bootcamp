CREATE TABLE user
(
    id          bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    surname     varchar(40) DEFAULT NULL,
    first_name  varchar(20) DEFAULT NULL,
    middle_name varchar(40) DEFAULT NULL,
    email       varchar(50) DEFAULT NULL
);

CREATE TABLE user_roles
(
    user_id bigint NOT NULL PRIMARY KEY,
    roles   varchar(50) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user (id)
);











