package com.wecp.progressive.repository;

<<<<<<< HEAD
import com.wecp.progressive.entity.Team;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    Team findByTeamId(int teamId);
    Team findByTeamName(String teamName);
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
}