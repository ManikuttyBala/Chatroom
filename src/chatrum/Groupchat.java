/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrum;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Groupchat extends javax.swing.JFrame {
String msghis="",msgcon,msguser;
String msgdoc;
    /**
     * Creates new form Groupchat
     */
 String logedusername = "";
     public Groupchat(String logeduser) {
         logedusername = logeduser;
        initComponents();
        show_msg();
    }
    public Groupchat() {
        initComponents();
       show_msg();
    }
 public void show_msg(){
     msghis="";
        DataBaseConnection obj=new DataBaseConnection();
        String qry="select *from groupchattb";
        ResultSet rs;
        rs=obj.selectmthd(qry);
        try {
         while(rs.next())
            {
               
                msguser=(rs.getString("sendername"));
                msgcon=(rs.getString("msg"));
                 msgdoc=(rs.getString("doc"));
                 if (msgdoc == null){
                 msghis = msghis+ "\n" + msguser + ":"+msgcon;
                 }
                 else {
                 msghis = msghis+ "\n" + msguser + ":"+msgcon +"\n"+msgdoc;
                 
                 }
                  msgarea.setText(msghis);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgarea = new javax.swing.JTextArea();
        msgsend = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgtext = new javax.swing.JTextArea();
        fileupl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel1.setText("Company");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(10, 30, 370, 30);

        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(265, 10, 110, 23);

        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(10, 10, 90, 23);

        msgarea.setEditable(false);
        msgarea.setColumns(20);
        msgarea.setRows(5);
        jScrollPane1.setViewportView(msgarea);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 390, 180);

        msgsend.setText("Send");
        msgsend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msgsendMouseClicked(evt);
            }
        });
        jLayeredPane1.add(msgsend);
        msgsend.setBounds(310, 280, 80, 23);

        jButton4.setText("Attach");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jButton4);
        jButton4.setBounds(310, 250, 80, 23);

        msgtext.setColumns(20);
        msgtext.setRows(5);
        jScrollPane2.setViewportView(msgtext);

        jLayeredPane1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 246, 290, 50);

        fileupl.setText("No File selected to upload");
        jLayeredPane1.add(fileupl);
        fileupl.setBounds(10, 300, 290, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
                        Indexpage obj=new Indexpage();
                      this.setVisible(false);
                      obj.setVisible(true);   
                      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
             Chatselector obj=new Chatselector(logedusername);
                      this.setVisible(false);
                      obj.setVisible(true);   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void msgsendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgsendMouseClicked
        String msg;
        msg = msgtext.getText();
        if ((msgtext.getText().equals("")))

        {
  
}
else 
            {
           
          
           DataBaseConnection   ok=new DataBaseConnection();
              
String qry="insert into groupchattb(sendername,msg,doc)"
                      + "values('"+logedusername+"',"
                      + "'"+msg+"',"
                      +"'"+"')";
               ok.insertmthd(qry);
             
        qry="select max(msgid) as cnt from groupchattb";
        ResultSet rs;
        
        rs=ok.selectmthd(qry);
        int i=0;
        try {
            
            while(rs.next())
            {
               i=rs.getInt("cnt");
            }
        } catch (SQLException ex) {
            Logger.getLogger(newuser.class.getName()).log(Level.SEVERE, null, ex);
        }
        msgarea.setText(null);
        show_msg();
       msgtext.setText("");
       
            }
       
        
// TODO add your handling code here:
    }//GEN-LAST:event_msgsendMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File("user.dir"));
            int a= file.showSaveDialog(null);
            if(a==JFileChooser.APPROVE_OPTION)
            {
               
            fileupl.setText(file.getSelectedFile().getAbsolutePath());
            String fileonn = file.getSelectedFile().getAbsolutePath();
              DataBaseConnection   ok=new DataBaseConnection();
              
String qry="insert into groupchattb(sendername,msg,doc)"
                      + "values('"+logedusername+"',"
                      + "'" +"',"
                      +"'"+fileonn+"')";
               ok.insertmthd(qry);
             
        qry="select max(msgid) as cnt from groupchattb";
        ResultSet rs;
        
        rs=ok.selectmthd(qry);
        int i=0;
        try {
            
            while(rs.next())
            {
               i=rs.getInt("cnt");
            }
        } catch (SQLException ex) {
            Logger.getLogger(newuser.class.getName()).log(Level.SEVERE, null, ex);
        }
        msgarea.setText(null);
        show_msg();
            }
            

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Groupchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Groupchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Groupchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Groupchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Groupchat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fileupl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea msgarea;
    private javax.swing.JButton msgsend;
    private javax.swing.JTextArea msgtext;
    // End of variables declaration//GEN-END:variables
}
