/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.lfjdbc.entity;

/**
 *
 * @author onesoft
 */
public class course {
    private int id, fees;
    private String course_name, course_desc;

    public course() {
    }

    public course(int id, int fees, String course_name, String course_desc) {
        this.id = id;
        this.fees = fees;
        this.course_name = course_name;
        this.course_desc = course_desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_desc() {
        return course_desc;
    }

    public void setCourse_desc(String course_desc) {
        this.course_desc = course_desc;
    }

    @Override
    public String toString() {
        return "course{" + "id=" + id + ", fees=" + fees + ", course_name=" + course_name + ", course_desc=" + course_desc + '}';
    }
   
    
    
}
