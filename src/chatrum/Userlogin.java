
package chatrum;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Userlogin extends javax.swing.JFrame {

    
    public Userlogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Employee Login");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(140, 10, 156, 39);

        jLabel1.setText("User Name");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(30, 90, 90, 30);

        jLabel4.setText("Password");
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(30, 130, 80, 50);

        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(180, 200, 110, 40);
        jLayeredPane1.add(Username);
        Username.setBounds(170, 100, 130, 20);
        jLayeredPane1.add(Pass);
        Pass.setBounds(170, 150, 130, 20);

        jLabel3.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel3.setPreferredSize(new java.awt.Dimension(400, 300));
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if((Username.getText().equals(""))||(Pass.getText().equals("")))
        {
            JOptionPane.showMessageDialog(rootPane,"plz Enter all fields");
        }
         DataBaseConnection objDB=new DataBaseConnection();
                   String qry="select count(Userpass) as cnt  from usertb where BINARY Username='"+Username.getText()+"' and BINARY Userpass='"+Pass.getText()+"' ";
                   System.out.println(qry);
                    ResultSet rs=objDB.selectmthd(qry);
                   int cnmt=0;
                   try {
                       while(rs.next())
                       {
                           cnmt=rs.getInt("cnt");
                       }
                   } catch (SQLException ex) {
                       Logger.getLogger(Userlogin.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
                  if(cnmt==0) 
                  {
                     JOptionPane.showMessageDialog(rootPane, "Invalid username and password");
                  }
                  else
                  {
                      Chatselector ol=new Chatselector(Username.getText());
                      this.setVisible(false);
                      ol.setVisible(true);
                  }   
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
