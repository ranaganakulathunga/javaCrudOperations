package com.mycompany.sms.dao;

import com.mycompany.sms.model.Course;
import java.util.List;

public interface CourseDOA {
    public void insertCourse(Course course);
    public boolean editCourse(Course course);
    public boolean getCousre(String courseCode);
    public List<Course> getAllCourse();
    public void deleteCourse(String courseCode);
}
