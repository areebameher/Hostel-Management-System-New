
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfhome1 = new javax.swing.JButton();
        tfhome2 = new javax.swing.JButton();
        tfhome3 = new javax.swing.JButton();
        tfhome4 = new javax.swing.JButton();
        tfhome5 = new javax.swing.JButton();
        tfhome6 = new javax.swing.JButton();
        tfhome7 = new javax.swing.JButton();
        tfhome8 = new javax.swing.JButton();
        tfhome9 = new javax.swing.JButton();
        tfhome10 = new javax.swing.JButton();
        tfhome11 = new javax.swing.JButton();
        logoutb2 = new javax.swing.JButton();
        closeb2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfhome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/room.png"))); // NOI18N
        tfhome1.setText("ManageRoom");
        tfhome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome1ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 249, -1));

        tfhome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new student.png"))); // NOI18N
        tfhome2.setText("New Student");
        tfhome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome2ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 249, -1));

        tfhome3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update & Delete Student.png"))); // NOI18N
        tfhome3.setText("Update And Delete Students");
        tfhome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome3ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 249, -1));

        tfhome4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fees.png"))); // NOI18N
        tfhome4.setText("Student Fees");
        tfhome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome4ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 249, -1));

        tfhome5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all student living.png"))); // NOI18N
        tfhome5.setText("Current Student");
        tfhome5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome5ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 249, -1));

        tfhome6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Leaved students.png"))); // NOI18N
        tfhome6.setText("Past Students");
        tfhome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome6ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 249, -1));

        tfhome7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new student.png"))); // NOI18N
        tfhome7.setText("New Employee");
        tfhome7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome7ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 249, -1));

        tfhome8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update & Delete Student.png"))); // NOI18N
        tfhome8.setText("Update And Delete Employee");
        tfhome8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome8ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 250, -1));

        tfhome9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fees.png"))); // NOI18N
        tfhome9.setText("Employee Payment");
        tfhome9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome9ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 249, -1));

        tfhome10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all student living.png"))); // NOI18N
        tfhome10.setText("Current Employees");
        tfhome10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome10ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 249, -1));

        tfhome11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfhome11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Leaved students.png"))); // NOI18N
        tfhome11.setText("Past Employee");
        tfhome11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhome11ActionPerformed(evt);
            }
        });
        getContentPane().add(tfhome11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 249, -1));

        logoutb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logoutb2.setText("Log Out");
        logoutb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutb2ActionPerformed(evt);
            }
        });
        getContentPane().add(logoutb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 150, 59));

        closeb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        closeb2.setText("Exit");
        closeb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeb2ActionPerformed(evt);
            }
        });
        getContentPane().add(closeb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 120, 59));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home background.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfhome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome2ActionPerformed
        // TODO add your handling code here:
        
        
        tfhome2.setForeground(Color.red);
        tfhome2.setBackground(new Color(255,255,255));
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_tfhome2ActionPerformed
    
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        tfhome1.setForeground(new JButton().getForeground());
        tfhome1.setBackground(new JButton().getBackground());
        
        tfhome2.setForeground(new JButton().getForeground());
        tfhome2.setBackground(new JButton().getBackground());
        
        tfhome3.setForeground(new JButton().getForeground());
        tfhome3.setBackground(new JButton().getBackground());
        
        tfhome4.setForeground(new JButton().getForeground());
        tfhome4.setBackground(new JButton().getBackground());
        
        tfhome5.setForeground(new JButton().getForeground());
        tfhome5.setBackground(new JButton().getBackground());
        
        tfhome6.setForeground(new JButton().getForeground());
        tfhome6.setBackground(new JButton().getBackground()); 
        
        tfhome7.setForeground(new JButton().getForeground());
        tfhome7.setBackground(new JButton().getBackground());
        
        tfhome8.setForeground(new JButton().getForeground());
        tfhome8.setBackground(new JButton().getBackground());
        
        tfhome9.setForeground(new JButton().getForeground());
        tfhome9.setBackground(new JButton().getBackground());
        
        tfhome10.setForeground(new JButton().getForeground());
        tfhome10.setBackground(new JButton().getBackground());
        
        tfhome11.setForeground(new JButton().getForeground());
        tfhome11.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_formWindowGainedFocus

    private void logoutb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutb2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new LoginPage().setVisible(true);
                    
        }
    }//GEN-LAST:event_logoutb2ActionPerformed

    private void closeb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeb2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
           System.exit(0);
    }//GEN-LAST:event_closeb2ActionPerformed
    }
    private void tfhome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome1ActionPerformed
        // TODO add your handling code here:
        tfhome1.setForeground(Color.red);
        tfhome1.setBackground(new Color(255,255,255));
        new ManageRoom().setVisible(true);
    }//GEN-LAST:event_tfhome1ActionPerformed

    private void tfhome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome3ActionPerformed
        // TODO add your handling code here:
        tfhome3.setForeground(Color.red);
        tfhome3.setBackground(new Color(255,255,255));
        new UpdateAndDeleteStudents().setVisible(true);
                                        
    }//GEN-LAST:event_tfhome3ActionPerformed

    private void tfhome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome4ActionPerformed
        // TODO add your handling code here:
        tfhome4.setForeground(Color.red);
        tfhome4.setBackground(new Color(255,255,255));
        new StudentFees().setVisible(true);
                                     
    }//GEN-LAST:event_tfhome4ActionPerformed

    private void tfhome5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome5ActionPerformed
        // TODO add your handling code here:
         tfhome5.setForeground(Color.red);
        tfhome5.setBackground(new Color(255,255,255));
        new currentStudents().setVisible(true);
    }//GEN-LAST:event_tfhome5ActionPerformed

    private void tfhome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome6ActionPerformed
        // TODO add your handling code here:
         tfhome6.setForeground(Color.red);
        tfhome6.setBackground(new Color(255,255,255));
        new PastStudents().setVisible(true);
    }//GEN-LAST:event_tfhome6ActionPerformed

    private void tfhome7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome7ActionPerformed
        // TODO add your handling code here:
         tfhome7.setForeground(Color.red);
        tfhome7.setBackground(new Color(255,255,255));
        new NewEmployee().setVisible(true);
    }//GEN-LAST:event_tfhome7ActionPerformed

    private void tfhome8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome8ActionPerformed
        // TODO add your handling code here:
         tfhome8.setForeground(Color.red);
        tfhome8.setBackground(new Color(255,255,255));
        new UpdateAndDeleteEmployee().setVisible(true);
    }//GEN-LAST:event_tfhome8ActionPerformed

    private void tfhome9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome9ActionPerformed
        // TODO add your handling code here:
         tfhome9.setForeground(Color.red);
        tfhome9.setBackground(new Color(255,255,255));
        new EmployeePayment().setVisible(true);
    }//GEN-LAST:event_tfhome9ActionPerformed

    private void tfhome10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome10ActionPerformed
        // TODO add your handling code here:
         tfhome10.setForeground(Color.red);
        tfhome10.setBackground(new Color(255,255,255));
        new currentEmployees().setVisible(true);
    }//GEN-LAST:event_tfhome10ActionPerformed

    private void tfhome11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhome11ActionPerformed
        // TODO add your handling code here:
         tfhome11.setForeground(Color.red);
        tfhome11.setBackground(new Color(255,255,255));
        new PastEmployee().setVisible(true);
    }//GEN-LAST:event_tfhome11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutb2;
    private javax.swing.JButton tfhome1;
    private javax.swing.JButton tfhome10;
    private javax.swing.JButton tfhome11;
    private javax.swing.JButton tfhome2;
    private javax.swing.JButton tfhome3;
    private javax.swing.JButton tfhome4;
    private javax.swing.JButton tfhome5;
    private javax.swing.JButton tfhome6;
    private javax.swing.JButton tfhome7;
    private javax.swing.JButton tfhome8;
    private javax.swing.JButton tfhome9;
    // End of variables declaration//GEN-END:variables
}
