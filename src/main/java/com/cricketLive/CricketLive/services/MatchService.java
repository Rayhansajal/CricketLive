package com.cricketLive.CricketLive.services;

import com.cricketLive.CricketLive.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    // get all matches
    List<Match> getAllMatches();
    // get live matches
    List<Match> getLiveMatches();
    // get wordldcup2024
    List<List<String>> getPointTable();
}
