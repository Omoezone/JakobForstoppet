DROP DATABASE IF EXISTS productsDB;
CREATE DATABASE productsDB;
USE productsDB;

DROP TABLE IF EXISTS products;
CREATE TABLE products(
product_id INT NOT NULL UNIQUE PRIMARY KEY,
product_name VARCHAR(45) NOT NULL,
product_desc VARCHAR(45) NOT NULL,
product_price DOUBLE NOT NULL
);