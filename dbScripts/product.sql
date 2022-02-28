USE mydb;

CREATE TABLE product
(
    id          INT auto_increment PRIMARY KEY,
    name        VARCHAR(20),
    description VARCHAR(100),
    price       DECIMAL(8, 3)
);

SELECT * FROM product;