package com.example.MySQLTestLab.service;

import com.example.MySQLTestLab.entity.VideoGame;
import com.example.MySQLTestLab.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoGameService {

    @Autowired
    VideoGameRepository videoGameRepository;


    public VideoGame createGame(VideoGame videoGame) {
        return this.videoGameRepository.save(videoGame);
    }


    public VideoGame getGameById(Long videoGameID) {
        return this.videoGameRepository.findById(videoGameID).get();
    }

    public List<VideoGame> getGames() {
        return this.videoGameRepository.findAll();
    }


}
