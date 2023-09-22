/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sms.daoimpl;

import com.mycompany.sms.dao.StudentDAO;
import com.mycompany.sms.database.QueryManager;
import com.mycompany.sms.model.Student;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class StudentDAOImpl implements StudentDAO {
    
    private QueryManager querymanager;
    private int st_id;
    private int name;
    private int course_code;
    
    public StudentDAOImpl(){
      querymanager =new QueryManager();
        
    }
            

    @Override
    public boolean register(Student student) {
        
       return querymanager.insertStudent(student);
    }
   

    @Override
    public boolean editStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean getStudent(String studentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> getAllStudent() {
         List<Student> listStudent = new ArrayList<Student>();
        ResultSet result = querymanager.selectAllStudent();
        try {
            while(result.next()){
                Student student=new Student();
                student.setStudentId(result.getString("st_id"));
                student.setStudentName(result.getString("name"));
                student.setCourse(result.getString("course_code"));
                listStudent.add(student);
                
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listStudent;
    }

    @Override
    public void delectCourse(String studentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
