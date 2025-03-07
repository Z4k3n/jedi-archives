CREATE DATABASE jedi_archives;

USE jedi_archives;

CREATE TABLE planets (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    region VARCHAR(100),
    sector VARCHAR(100),
    system VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE force_users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    rank VARCHAR(50),
    lightsaber_color VARCHAR(50),
    homeworld VARCHAR(100),
    age INT,
    power_level TINYINT CHECK (power_level BETWEEN 1 AND 5),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT fk_homeworld FOREIGN KEY (homeworld) REFERENCES planets(name)
);

CREATE TABLE jedis (
    id BIGINT PRIMARY KEY,
    master VARCHAR(100),
    padawan VARCHAR(100),
    CONSTRAINT fk_jedi FOREIGN KEY (id) REFERENCES force_users(id)
);

CREATE TABLE siths (
    id BIGINT PRIMARY KEY,
    master VARCHAR(100),
    apprentice VARCHAR(100),
    CONSTRAINT fk_sith FOREIGN KEY (id) REFERENCES force_users(id)
);