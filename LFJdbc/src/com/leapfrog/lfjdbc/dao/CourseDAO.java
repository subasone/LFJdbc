/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.lfjdbc.dao;

import com.leapfrog.lfjdbc.entity.course;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author onesoft
 */
public interface CourseDAO {
    int insert(course cs) throws ClassNotFoundException, SQLException;
    List<course> getAll() throws ClassNotFoundException, SQLException;
    int delete(int id) throws ClassNotFoundException, SQLException;
    int update(String corseName, int id) throws ClassNotFoundException, SQLException;
}
