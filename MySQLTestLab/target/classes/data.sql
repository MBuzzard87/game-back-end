DROP TABLE IF EXISTS video_game;

CREATE TABLE  video_game
(
    id        int AUTO_INCREMENT PRIMARY KEY,
    title     VARCHAR(250)   NOT NULL,
    console   VARCHAR(250)   NOT NULL,
    year      int            NOT NULL,
    developer VARCHAR(250)   NOT NULL,
    price     Decimal(12, 2) NOT NULL,
    stock     int            NOT NULL
);

INSERT INTO video_game (title, console, year, developer, price, stock) VALUES
('Little Samson', 'NES', '1992', 'Takeru', '850.00', '1'),
('Super Castlevania IV', 'SNES', '1991', 'Konami', '30.00', '2'),
('Super Metroid', 'SNES', '1994', 'Nintendo', '60.00', '1'),
('Mega Man 2', 'NES', '1988', 'Capcom', '50.00', '1'),
('Sonic the Hedgehog', 'Genesis', '1991', 'Sega', '10.00', '3'),
('Crusader of Centy', 'Genesis', '1994', 'Nex Entertainment', '100.00', '1'),
('Castlevania: Symphony of the Night', 'Playstation 1', '1997', 'Konami', '20.00', '1');

