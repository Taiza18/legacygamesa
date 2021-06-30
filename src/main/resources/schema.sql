DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       platform VARCHAR(255) NOT NULL
                       priceoriginal NUMERIC NOT NULL,
                       category VACHAR(255) NOT NULL,
                       photo VARCHAR(64) NOT NULL
);