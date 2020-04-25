CREATE TABLE T_USER
(
    id    number(20)  NOT NULL,
    name  VARCHAR(30) NULL,
    age   number(11)  NULL,
    email VARCHAR(50),
    PRIMARY KEY (id)
);

INSERT INTO T_USER (id, name, age, email)
VALUES (1, 'Jone', 18, 'test1@baomidou.com');
INSERT INTO T_USER (id, name, age, email)
VALUES (2, 'Jack', 20, 'test2@baomidou.com');
INSERT INTO T_USER (id, name, age, email)
VALUES (3, 'Tom', 28, 'test3@baomidou.com');
INSERT INTO T_USER (id, name, age, email)
VALUES (4, 'Sandy', 21, 'test4@baomidou.com');
INSERT INTO T_USER (id, name, age, email)
VALUES (5, 'Billie', 24, 'test5@baomidou.com');

COMMIT;
