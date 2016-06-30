/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.lfjdbc;

import com.leapfrog.lfjdbc.dao.CourseDAO;
import com.leapfrog.lfjdbc.dao.impl.CourseDaoImpl;
import com.leapfrog.lfjdbc.entity.course;
import java.sql.SQLException;

/**
 *
 * @author onesoft
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
try{
        CourseDAO courseDao = new CourseDaoImpl();
    
      //  int result = courseDao.insert(new course(0,2000,"Oracle","Oracler Desc"));
        //System.out.println(result);
       // courseDao.getAll().forEach(cs -> {
         //   System.out.println(cs.toString());
        //});
      //  int result = courseDao.delete(2);
        //System.out.println(result);
        
       int result = courseDao.update("C#",3);
       System.out.println(result);
        
   } catch(ClassNotFoundException | SQLException ce){
         System.out.println(ce.getMessage());
   }
    }

}
