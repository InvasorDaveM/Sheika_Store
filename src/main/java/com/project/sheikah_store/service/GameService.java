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

}
