package com.example.cricinformarbackend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cricinformarbackend.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    Optional<Match> findByteamHeading(String teamHeading);
}
