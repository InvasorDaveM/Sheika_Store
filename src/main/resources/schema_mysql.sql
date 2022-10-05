CREATE TABLE game(
	reference_game INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name_game VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price DOUBLE NOT NULL,
    description_game TEXT NOT NULL,
    image_path VARCHAR(50) NOT NULL,
    producer VARCHAR(50) NOT NULL
);

INSERT INTO game(
    name_game,
    category,
    price,
    description_game,
    image_path,
    producer
)
VALUES(
    "Gof of War",
    "Hack 'n' Slash",
    19.99,
    "Kratos is a father again. As mentor and protector to Atreus, a son determined to earn his respect, he is forced to deal with and control the rage that has long defined him while out in a very dangerous world with his son.

His vengeance against the Gods of Olympus behind him, Kratos now lives in the realm of Norse deities and monsters.

It’s in this harsh, unforgiving world that he must fight to survive, and not only teach his son to do the same… but also prevent him from repeating the Ghost of Sparta’s bloodstained mistakes.

This staggering reimagining of God of War combines all the hallmarks of the iconic series – brutal combat, epic boss fights, and breathtaking scale – and fuses them with a powerful and moving narrative that re-establishes Kratos’ world. ",
    "img/products/God of War.png",
    "Sony Interactive Entertainment"
)