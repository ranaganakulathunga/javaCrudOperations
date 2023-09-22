package com.mycompany.sms.database;

import com.mycompany.sms.model.Course;
import com.mycompany.sms.model.Student;
import com.mycompany.sms.model.User;
import java.sql.ResultSet;

public class QueryManager {
    private DatabaseConnection dbConnection;
    
    public QueryManager(){
        dbConnection = new DatabaseConnection();
    }
    
    public ResultSet userValidate(User user){
        return dbConnection.getData("SELECT * FROM user WHERE user_name='"+user.getUserName()+"' AND password='"+user.getPassword()+"'");

    }
    
    public void saveCourse(Course course){
        dbConnection.dataProcess("INSERT INTO course VALUES ('"+course.getCourseCode()+"', '"+course.getCourseName()+"', '"+course.getCredit()+"')");
    }
    
    public ResultSet selectAllCourse(){
        return dbConnection.getData("SELECT * FROM course");
    }
    
    public void deleteCourse(String courseCode){
        dbConnection.dataProcess("DELETE FROM course WHERE course_code = '"+courseCode+"'");
    }
    
    public boolean updateCourse(Course course){
        return dbConnection.dataProcess("UPDATE course SET course_code='"+course.getCourseCode()+
                "', course_name='"+course.getCourseName()+"', credit='"+course.getCredit()+"' WHERE course_code='"+course.getCourseCode()+"'");
    }
    
    public boolean insertStudent(Student student){
        return dbConnection.dataProcess("INSERT INTO student VALUES('"+student.getStudentId()+"', '"+student.getStudentName()+"' ,'"+student.getCourse()+"')");
        
    }
    
    public ResultSet selectAllStudent(){
        return dbConnection.getData("SELECT * FROM student");
    }
    
}
