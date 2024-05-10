package com.example.cricinformarbackend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cricinformarbackend.entities.Match;
import com.example.cricinformarbackend.services.MatchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/match")
public class Cricket {
    @Autowired
    public MatchService matchService;

    @GetMapping("/live")
 
    public ResponseEntity<List<Match>> getLiveMatchScores(){
        return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
       }


       @GetMapping("/allmatches")
 
       public ResponseEntity<List<Match>> getAllMatches(){
           return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
          }
          @GetMapping("/pointtable")
 
          public ResponseEntity <?>  getCWC2023PointTable(){
              return new ResponseEntity<>(this.matchService.getCWC2023PointTable(), HttpStatus.OK);
             }

    
}
