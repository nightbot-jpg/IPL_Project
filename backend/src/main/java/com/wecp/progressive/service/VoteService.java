package com.wecp.progressive.service;

import com.wecp.progressive.entity.Vote;

import java.util.List;
import java.util.Map;

public interface VoteService {

    List<Vote> getAllVotes();

    int createVote(Vote vote);

    // Each key (k) represents a category (categories - “Team”, “Batsman”, “Bowler”, “All-rounder” and “Wicketkeeper”)
    // and each value (v) represents the total number of votes for that category.
    Map<String, Long> getVotesCountOfAllCategories();

<<<<<<< HEAD
}
=======
}
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
