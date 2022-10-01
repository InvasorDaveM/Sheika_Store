CREATE TABLE game(
	reference_game INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name_game VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price DOUBLE NOT NULL,
    description_game TEXT NOT NULL,
    image_path VARCHAR(100) NOT NULL,
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
    "Kirbo",
    "Pipi",
    60.00,
    "Kirbo mata a gente",
    "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174055/tumblr_ort0kfbk9t1s43f3wo1_500.png",
    "Nintendon't"
),(
    "Zelda",
    "Popo",
    65.00,
    "Link osuno",
    "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174242/tumblr_orfzm2LkyE1s43f3wo1_500.png",
    "Nintendon't"
),(
    "Mario",
    "Pepe",
    80.00,
    "Mario osito ricolino",
    "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05173944/tumblr_or3k7qhsoF1s43f3wo1_500.png",
    "Nintendon't"
),(
    "Luigo",
    "Papa",
    40.00,
    "Mario verde osito ricolino",
    "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174300/tumblr_orjqwmDPjP1s43f3wo1_500-1.png",
    "Nintendon't"
),(
    "DK",
    "Pupu",
    30.00,
    "Furro ricolino",
    "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174020/tumblr_orahi14rP11s43f3wo1_500.png",
    "Nintendon't"
),(
    "Fost",
    "Papi",
    20.00,
    "Furro espacial ricolino",
    "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174130/tumblr_os0iai8p2W1s43f3wo1_500.png",
    "Nintendon't"
),(
    "Yigli",
    "Popu",
    80.00,
    "Globo asexual",
    "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174224/tumblr_osde8sRnN21s43f3wo1_500-1.png",
    "Nintendon't"
),(
    "Captain Falcon",
    "Pipe",
    80.00,
    "Man menos rico que Snake pero igual rico",
    "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174036/tumblr_orninkB0WW1s43f3wo1_500.png",
    "Nintendon't"
);