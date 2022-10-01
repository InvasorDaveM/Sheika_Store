package com.project.sheikah_store.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sheikah_store.model.Game;
import com.project.sheikah_store.repository.IGameRepository;

@Service
public class GameService implements IGameService {

        private IGameRepository iGameRepository;

        public GameService(IGameRepository iGameRepository) {
                this.iGameRepository = iGameRepository;
        }

        @Override
        public List<Game> getAllGames() {
                return iGameRepository.findAllGames();
        }

        /*
         * public List<Game> gameList() {
         * List<Game> list = new ArrayList<>();
         * 
         * Game game = new Game();
         * game.setName("Kirbo");
         * game.setCategory("Pipi");
         * game.setPrice(60.00);
         * game.setDescription("Kirbo mata a gente");
         * game.setImagePath(
         * "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174055/tumblr_ort0kfbk9t1s43f3wo1_500.png"
         * );
         * game.setProducer("Nintendon't");
         * 
         * 
         * game = new Game();
         * game.setName("Zelda");
         * game.setCategory("Popo");
         * game.setPrice(65.00);
         * game.setDescription("Link se trasviste");
         * game.setImagePath(
         * "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174242/tumblr_orfzm2LkyE1s43f3wo1_500.png"
         * );
         * game.setProducer("Nintendon't");
         * 
         * game = new Game();
         * game.setName("Mario");
         * game.setCategory("Pepe");
         * game.setPrice(80.00);
         * game.setDescription("Mario osito ricolino");
         * game.setImagePath(
         * "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05173944/tumblr_or3k7qhsoF1s43f3wo1_500.png"
         * );
         * game.setProducer("Nintendon't");
         * 
         * game = new Game();
         * game.setName("Luigo");
         * game.setCategory("Papa");
         * game.setPrice(40.00);
         * game.setDescription("Mario verde osito ricolino");
         * game.setImagePath(
         * "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174300/tumblr_orjqwmDPjP1s43f3wo1_500-1.png"
         * );
         * game.setProducer("Nintendon't");
         * 
         * game = new Game();
         * game.setName("DK");
         * game.setCategory("Pupu");
         * game.setPrice(30.00);
         * game.setDescription("Furro ricolino");
         * game.setImagePath(
         * "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174020/tumblr_orahi14rP11s43f3wo1_500.png"
         * );
         * game.setProducer("Nintendon't");
         * 
         * game = new Game();
         * game.setName("Fost");
         * game.setCategory("Papi");
         * game.setPrice(20.00);
         * game.setDescription("Furro espacial ricolino");
         * game.setImagePath(
         * "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174130/tumblr_os0iai8p2W1s43f3wo1_500.png"
         * );
         * game.setProducer("Nintendon't");
         * 
         * game = new Game();
         * game.setName("Yigli");
         * game.setCategory("Popu");
         * game.setPrice(80.00);
         * game.setDescription("Globo asexual");
         * game.setImagePath(
         * "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174224/tumblr_osde8sRnN21s43f3wo1_500-1.png"
         * );
         * game.setProducer("Nintendon't");
         * 
         * game = new Game();
         * game.setName("Captain Falcon");
         * game.setCategory("Pipe");
         * game.setPrice(80.00);
         * game.setDescription("Man menos rico que Snake pero igual rico");
         * game.setImagePath(
         * "https://d3u63wyfuci0ch.cloudfront.net/wp-content/uploads/2017/07/05174036/tumblr_orninkB0WW1s43f3wo1_500.png"
         * );
         * game.setProducer("Nintendon't");
         * 
         * return list;
         * }
         */
}
