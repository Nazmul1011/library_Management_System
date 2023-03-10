
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Students_and_Teachers_Management extends javax.swing.JFrame {

    /**
     * Creates new form Students_and_Teachers_Management
     */
    
     
            
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public Students_and_Teachers_Management() {
        initComponents();
        
                
        conn=javaconnect.connerDb();
        CurrentDate();
    }
    
    
        
    public void CurrentDate() 
    {

        
        Thread clock=new Thread()
        {
            public void run()
            {
                for(;;)
                    
                {
                
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
        date_txt.setText(day+"/"+(month+1)+"/"+(year));
        
        
        
        int second=cal.get(Calendar.SECOND); 
        int mint=cal.get(Calendar.MINUTE);
        int hour=cal.get(Calendar.HOUR);
        txt_time.setText(hour+":"+(mint)+":"+(second));  
        

                    
                    try {
                        sleep(1000);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Students_and_Teachers_Management.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        
        
        
        clock.start();
        
                
    }
    
        
    public  void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txt_teacher_management = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_teachers = new javax.swing.JButton();
        txt_students = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        date_txt = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_Employee = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_student_management = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("All Information");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 433));
        setResizable(false);

        txt_teacher_management.setBackground(new java.awt.Color(0, 204, 204));
        txt_teacher_management.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_teacher_management.setForeground(new java.awt.Color(0, 0, 255));
        txt_teacher_management.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book-icon.png"))); // NOI18N
        txt_teacher_management.setText("Books");
        txt_teacher_management.setToolTipText("Tearcher Management Option-1");
        txt_teacher_management.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_teacher_managementAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Library Management System");

        jLabel4.setText("NB: By Click to choice  one");
        jLabel4.setToolTipText("NB: By Click to choice  one");

        txt_teachers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_teachers.setForeground(new java.awt.Color(0, 51, 51));
        txt_teachers.setText("Books");
        txt_teachers.setToolTipText("Teachers Data Entry Option");
        txt_teachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_teachersActionPerformed(evt);
            }
        });

        txt_students.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_students.setForeground(new java.awt.Color(0, 51, 51));
        txt_students.setText("Students");
        txt_students.setToolTipText("Students Data Entry Option");
        txt_students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_studentsActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        date_txt.setText("Current Date:");

        txt_time.setText("Time:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("Current date:");
        jButton2.setToolTipText("Current date");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("Time:");
        jButton3.setToolTipText("Time");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("Close");
        jButton4.setToolTipText("Close The Window");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txt_Employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Employee.setForeground(new java.awt.Color(51, 51, 51));
        txt_Employee.setText("Employees");
        txt_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmployeeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee111.png"))); // NOI18N
        jLabel2.setText("Employees");
        jLabel2.setToolTipText("Employee Management Option-3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        txt_student_management.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_student_management.setForeground(new java.awt.Color(51, 51, 255));
        txt_student_management.setIcon(new javax.swing.ImageIcon("C:\\Users\\nazmu\\Desktop\\School Management system in java\\src\\images\\student_icon.png")); // NOI18N
        txt_student_management.setText("Student");
        txt_student_management.setToolTipText("Srudent Management Option-2");
        txt_student_management.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_student_managementAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_time))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(txt_teacher_management)
                        .addGap(92, 92, 92)
                        .addComponent(txt_student_management)
                        .addGap(65, 65, 65)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(txt_teachers)
                        .addGap(160, 160, 160)
                        .addComponent(txt_students)
                        .addGap(177, 177, 177)
                        .addComponent(txt_Employee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_txt)
                    .addComponent(txt_time)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txt_student_management)
                            .addGap(8, 8, 8)))
                    .addComponent(txt_teacher_management))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Employee)
                    .addComponent(txt_students)
                    .addComponent(txt_teachers, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_teacher_managementAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_teacher_managementAncestorAdded
        // TODO add your handling code here:

        
    }//GEN-LAST:event_txt_teacher_managementAncestorAdded

    private void txt_student_managementAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txt_student_managementAncestorAdded
        // TODO add your handling code here:

        
        
        
    }//GEN-LAST:event_txt_student_managementAncestorAdded

    private void txt_teachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_teachersActionPerformed
        // TODO add your handling code here:
        

                Teachers_Information_System t = new Teachers_Information_System();
                t.setVisible(true);
                close();
    }//GEN-LAST:event_txt_teachersActionPerformed

    private void txt_studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_studentsActionPerformed
        // TODO add your handling code here:
        
                 Students_Infromation_System s = new Students_Infromation_System();
                 s.setVisible(true);
                 close();
    }//GEN-LAST:event_txt_studentsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmployeeActionPerformed
        // TODO add your handling code here:
        
                
                 Employees_Infromation_System s = new Employees_Infromation_System();
                 s.setVisible(true);
                 close();
        
    }//GEN-LAST:event_txt_EmployeeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton txt_Employee;
    private javax.swing.JLabel txt_student_management;
    private javax.swing.JButton txt_students;
    private javax.swing.JLabel txt_teacher_management;
    private javax.swing.JButton txt_teachers;
    private javax.swing.JLabel txt_time;
    // End of variables declaration//GEN-END:variables
}
