package com.example.MySQLTestLab.controller;


import com.example.MySQLTestLab.entity.VideoGame;
import com.example.MySQLTestLab.service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/gameinventory")
public class VideoGameController {

    @Autowired
    private VideoGameService videoGameService;


    @PostMapping(value = "/add")
    @ResponseBody
    public VideoGame createGame(@RequestBody VideoGame videoGame) {
        return videoGameService.createGame(videoGame);
    }


    @GetMapping(value = "/game/{id}")
    @ResponseBody
    public VideoGame getVideoGameById(@PathVariable("id") Long videoGameID) {
        return videoGameService.getGameById(videoGameID);
    }

    @GetMapping(value = "/gamelist")
    @ResponseBody
    public List<VideoGame> getGames() {
        return videoGameService.getGames();
    }


}
