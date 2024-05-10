package com.example.cricinformarbackend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cricinformarbackend.entities.Match;

@Service
public interface MatchService {

    //  get all match
    List<Match> getAllMatches();

    //get live matches
    List<Match> getLiveMatchScores();

    //get cwc2024 point table
    List<List<String>> getCWC2023PointTable();
    
}
