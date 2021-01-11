package com.example.MySQLTestLab.repository;

import com.example.MySQLTestLab.entity.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameRepository extends JpaRepository<VideoGame,Long> {


}
