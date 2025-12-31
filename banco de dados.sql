CREATE DATABASE vision_moderna;
USE vision_moderna;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) UNIQUE,
  password VARCHAR(100),
  role ENUM('FUNDADOR','STAFF')
);

CREATE TABLE logs (
  id INT AUTO_INCREMENT PRIMARY KEY,
  player VARCHAR(100),
  punishment VARCHAR(50),
  staff VARCHAR(50),
  link TEXT,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO users (username, password, role)
VALUES ('fundador', 'fundador123', 'FUNDADOR');
