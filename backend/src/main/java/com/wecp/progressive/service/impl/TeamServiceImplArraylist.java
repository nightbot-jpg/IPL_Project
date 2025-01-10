package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
@Service
=======
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
public class TeamServiceImplArraylist implements TeamService {

    private List<Team> teamList = new ArrayList<>();

   @Override 
   public List<Team> getAllTeams() 
   { 
    return teamList;
   }
    @Override
    public int addTeam(Team team) {
      teamList.add(team);
    return teamList.size();  }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        List<Team> sortedTeamList = teamList;
        sortedTeamList.sort(Comparator.comparing(Team :: getTeamName));
        return sortedTeamList;
    }

}