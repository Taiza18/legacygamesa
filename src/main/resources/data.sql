insert into categories(id, name)
values (0,'Shooter'),
       (1,'Racing'),
       (2,'Platforms'),
       (3,'Sports');

INSERT INTO games(platform, title, priceoriginal,category_id, photo)
VALUES ('Wii', 'Wii Sports', '19.99', 3, default ),
       ('Super Mario Brothers', 'NES', '14.99', 2, default),
       ('Mario Kart Wii', 'Wii', '9.99', 1, default);
