/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sms.dao;

import com.mycompany.sms.model.Student;
import java.util.List;

/**
 *
 * @author hp
 */
public interface StudentDAO {
    public boolean register(Student student);
    public boolean editStudent(Student student);
    public boolean getStudent(String studentId);
    public List<Student> getAllStudent();
    public void delectCourse(String studentId);
    
}

