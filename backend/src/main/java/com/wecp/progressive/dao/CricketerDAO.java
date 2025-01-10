package com.wecp.progressive.dao;
<<<<<<< HEAD
 
import com.wecp.progressive.entity.Cricketer;
import java.sql.SQLException;
import java.util.List;
 
public interface CricketerDAO {
 
    int addCricketer(Cricketer cricketer) throws SQLException;
 
    Cricketer getCricketerById(int cricketerId) throws SQLException;
 
    void updateCricketer(Cricketer cricketer) throws SQLException;
 
    void deleteCricketer(int cricketerId) throws SQLException;
 
=======

import com.wecp.progressive.entity.Cricketer;

import java.sql.SQLException;
import java.util.List;

public interface CricketerDAO {
    int addCricketer(Cricketer cricketer) throws SQLException;
    Cricketer getCricketerById(int cricketerId) throws SQLException;
    void updateCricketer (Cricketer cricketer) throws SQLException;
    void deleteCricketer (int cricketerId) throws SQLException;
>>>>>>> 0016f57f3a81d23e2fd0915e1ebecdaa088f69ea
    List<Cricketer> getAllCricketers() throws SQLException;
}