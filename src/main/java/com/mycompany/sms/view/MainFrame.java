package com.mycompany.sms.view;

import com.mycompany.sms.daoimpl.CourseDOAImpl;
import com.mycompany.sms.daoimpl.StudentDAOImpl;
import com.mycompany.sms.model.Course;
import com.mycompany.sms.model.Student;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {
    private DefaultTableModel mdlCourseTable;
    private DefaultTableModel mdlStudentTable;
    private CourseDOAImpl courseService;
    private StudentDAOImpl studentDAOImpl;

    public MainFrame() {
        courseService = new CourseDOAImpl();
        studentDAOImpl = new StudentDAOImpl();
        initComponents();
        mdlCourseTable = new DefaultTableModel();
        mdlCourseTable.addColumn("Course Code");
        mdlCourseTable.addColumn("Course Name");
        mdlCourseTable.addColumn("Course Credit");
        tblCourse.setModel(mdlCourseTable);
        fillCourseData();
        
        
        mdlStudentTable=new DefaultTableModel();
        mdlStudentTable.addColumn("Student ID");
        mdlStudentTable.addColumn("Student Name");
        mdlStudentTable.addColumn("Course");
        tblStudent.setModel(mdlStudentTable);
        fillStudenteData();
        
        
    }
    
    public void fillStudenteData(){
        mdlStudentTable.setRowCount(0);
        List<Student> listStudent=studentDAOImpl.getAllStudent();
        for(int i=0;i<listStudent.size();i++){
            Student student=listStudent.get(i);
            String[] dataRow={student.getStudentId(),student.getStudentName(),student.getCourse()};
            mdlStudentTable.insertRow(i, dataRow);
        }
    }
    
    public void fillCourseData(){
        mdlCourseTable.setRowCount(0);
        List<Course> listCourse = courseService.getAllCourse();
        for(int i = 0; i < listCourse.size(); i++){
            Course course = listCourse.get(i);
            String[] dataRow = {course.getCourseCode(), course.getCourseName(), course.getCredit()};
            mdlCourseTable.insertRow(i, dataRow);
        }
    }
    
    public void deleteCourse(){
        String courseCode = (String) mdlCourseTable.getValueAt(tblCourse.getSelectedRow(), 0);
        courseService.deleteCourse(courseCode);
        mdlCourseTable.removeRow(tblCourse.getSelectedRow());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtCourseCode = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCredit = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnCourseSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        btnCourseDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        cmbCourse = new javax.swing.JComboBox<>();
        btnStydentSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Registration"));

        jLabel1.setText("Course Code");

        jLabel2.setText("Course Name");

        cmbCredit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit 01", "Credit 02", "Credit 03" }));

        jLabel3.setText("Credit");

        btnCourseSave.setText("Save");
        btnCourseSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCourseSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCredit, 0, 102, Short.MAX_VALUE)
                            .addComponent(txtCourseName))))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnCourseSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate))
        );

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Code", "Cousre Name", "Credit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        btnCourseDelete.setText("Delete");
        btnCourseDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCourseDelete)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnCourseDelete)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Course", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Registration"));

        jLabel4.setText("Sudent ID");

        jLabel5.setText("Name");

        jLabel6.setText("Course");

        txtStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameActionPerformed(evt);
            }
        });

        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnStydentSave.setText("Save");
        btnStydentSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStydentSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cmbCourse, 0, 109, Short.MAX_VALUE))
                            .addComponent(txtStudentName)
                            .addComponent(txtStudentId)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnStydentSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnStydentSave)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Course"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblStudent);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseSaveActionPerformed
        saveCourse();
    }//GEN-LAST:event_btnCourseSaveActionPerformed

    private void btnCourseDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseDeleteActionPerformed
        deleteCourse();
    }//GEN-LAST:event_btnCourseDeleteActionPerformed

    private void tblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCourseMouseClicked
        fillValues();
    }//GEN-LAST:event_tblCourseMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateCourse();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameActionPerformed

    private void btnStydentSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStydentSaveActionPerformed
        saveStudent();
    }//GEN-LAST:event_btnStydentSaveActionPerformed
    
    public void saveStudent(){
        Student student=new Student();
        student.setStudentId(txtStudentId.getText());
        student.setStudentName(txtStudentName.getText());
        student.setCourse(cmbCourse.getSelectedItem().toString());
        studentDAOImpl.register(student);
        
        
    }
    
    public void updateCourse(){
        Course course = new Course();
        course.setCourseCode(txtCourseCode.getText());
        course.setCourseName(txtCourseName.getText());
        course.setCredit(cmbCredit.getSelectedItem().toString());
        boolean status = courseService.editCourse(course);
        fillCourseData();
        if(status){
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }
    
    public void fillValues(){
        int rowId = tblCourse.getSelectedRow();
        txtCourseCode.setText(mdlCourseTable.getValueAt(rowId, 0).toString());
        txtCourseName.setText(mdlCourseTable.getValueAt(rowId, 1).toString());
        String credit = mdlCourseTable.getValueAt(rowId, 2).toString();
        int index = 0;
        if(credit.equals("Credit 01")){
            index = 0;
        }else if(credit.equals("Credit 02")){
            index = 1;
        }else{
            index = 2;
        }
        cmbCredit.setSelectedIndex(index);
    }
    
    public void saveCourse(){
        Course course = new Course();
        course.setCourseCode(txtCourseCode.getText());
        course.setCourseName(txtCourseName.getText());
        course.setCredit(cmbCredit.getSelectedItem().toString());
        courseService.insertCourse(course);
        String[] dataRow = {course.getCourseCode(), course.getCourseName(), course.getCredit()};
        mdlCourseTable.insertRow(0, dataRow);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourseDelete;
    private javax.swing.JButton btnCourseSave;
    private javax.swing.JButton btnStydentSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCourse;
    private javax.swing.JComboBox<String> cmbCredit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtCourseCode;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}
