DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       platform VARCHAR(255) NOT NULL,
<<<<<<< HEAD
                       priceoriginal double(255) NOT NULL
=======
                       priceoriginal NUMERIC NOT NULL,
>>>>>>> 89355364bb989cb79c958eb0251fe1e57d4380ce
                       photo VARCHAR(64) NOT NULL
);