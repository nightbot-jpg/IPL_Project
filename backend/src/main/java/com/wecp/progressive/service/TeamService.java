package com.wecp.progressive.service;

import com.wecp.progressive.entity.Team;
<<<<<<< HEAD
import com.wecp.progressive.exception.TeamAlreadyExistsException;
=======
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea

import java.sql.SQLException;
import java.util.List;

public interface TeamService {

    List<Team> getAllTeams() throws SQLException;

    int addTeam(Team team) throws SQLException;

    List<Team> getAllTeamsSortedByName() throws SQLException;

    default void emptyArrayList() {
    }

    //Do not implement these methods in TeamServiceImplArrayList.java class
    default Team getTeamById(int teamId) throws SQLException {
        return null;
    }

    default void updateTeam(Team team) throws SQLException {}

    default void deleteTeam(int teamId) throws SQLException {}

<<<<<<< HEAD
}
=======
}
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
