/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.lfjdbc.dao.impl;

import com.leapfrog.lfjdbc.dao.CourseDAO;
import com.leapfrog.lfjdbc.dbutil.DbConnection;
import com.leapfrog.lfjdbc.entity.course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author onesoft
 */
public class CourseDaoImpl implements CourseDAO {

     private DbConnection db = new DbConnection();
    
    @Override
    public int insert(course cs) throws ClassNotFoundException, SQLException {
      
          db.open();
            String sql = "INSERT INTO tbl_course(course_name,course_desc,fees) "
                    + "VALUES(?,?,?)";
            PreparedStatement stmt = db.initStatement(sql);
            stmt.setString(1, cs.getCourse_name());
            stmt.setString(2, cs.getCourse_desc());
            stmt.setInt(3, cs.getFees());

            int result = db.update();
            
            db.close();
            return result;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<course> getAll() throws ClassNotFoundException, SQLException{
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<course> courseList = new ArrayList<>();
        db.open();
        String sql = "select * from tbl_course";
        db.initStatement(sql);
        ResultSet rs = db.query();
        while(rs.next()){
            course cs = new course();
            cs.setId(rs.getInt("course_id"));
            cs.setCourse_name(rs.getString("course_name"));
            cs.setCourse_desc(rs.getString("course_desc"));
            cs.setFees(rs.getInt("fees"));
            
            
            courseList.add(cs);
        }
        db.close();
        return courseList;
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         db.open();
            String sql = "delete from tbl_course where course_id = ?";
            PreparedStatement stmt = db.initStatement(sql);
            stmt.setInt(1, id);
            int result = db.update();
            
            db.close();
            return result;
    }

    @Override
    public int update(String courseName, int id) throws ClassNotFoundException, SQLException {
       db.open();
            String sql = "update tbl_course set course_name =? where course_id=?";
            PreparedStatement stmt = db.initStatement(sql);
            stmt.setString(1, courseName);
            stmt.setInt(2, id);

            int result = db.update();
            
            db.close();
            return result;
    }
    
}
