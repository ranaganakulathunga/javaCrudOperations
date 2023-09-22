package com.mycompany.sms.daoimpl;

import com.mycompany.sms.dao.CourseDOA;
import com.mycompany.sms.database.QueryManager;
import com.mycompany.sms.model.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDOAImpl implements CourseDOA {
    private QueryManager queryManager;
    
    public CourseDOAImpl(){
        queryManager = new QueryManager();
    }

    @Override
    public void insertCourse(Course course) {
        queryManager.saveCourse(course);
    }

    @Override
    public boolean editCourse(Course course) {
        return queryManager.updateCourse(course);
    }

    @Override
    public boolean getCousre(String courseCode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteCourse(String courseCode) {
        queryManager.deleteCourse(courseCode);
    }

    @Override
    public List<Course> getAllCourse() {
        List<Course> listCourse = new ArrayList<Course>();
        ResultSet result = queryManager.selectAllCourse();
        try {
            while(result.next()){
                Course course = new Course();
                course.setCourseCode(result.getString("course_code"));
                course.setCourseName(result.getString("course_name"));
                course.setCredit(result.getString("credit"));
                listCourse.add(course);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listCourse;
    }
    
}
