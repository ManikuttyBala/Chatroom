
package chatrum;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


public class indchat extends javax.swing.JFrame {
String msghis="",msgcon,msguser,msgdoc;
    
    String logedusername = "",receiverind="";
    public indchat(String logeduser,String reciv) {
          logedusername = logeduser;
          receiverind = reciv;
        initComponents();
        winopen();
        
    }
    public indchat() {
        initComponents();
     
    }
public void winopen(){
    Reciver.setText(receiverind);
    show_msg();
}
 public void show_msg(){
     msghis="";
        DataBaseConnection obj=new DataBaseConnection();
        String qry="select *from indchat where sender = '"+logedusername+"'and receiver ='"+receiverind+"' or sender = '"+receiverind+"'and receiver ='"+logedusername+"'";
        ResultSet rs;
        rs=obj.selectmthd(qry);
        try {
         while(rs.next())
            {
               
                msguser=(rs.getString("sender"));
                msgcon=(rs.getString("msg"));
                 msgdoc=(rs.getString("documents"));
               if (msgcon != null)
                 {
                 msghis = msghis+ "\n" + msguser + ":"+msgcon;
                 }
                  if (msgdoc != null) {
                   
                 msghis = msghis+ "\n" + msguser + ":"+"\n"+msgdoc;
                 
                 }
                  msgarea.setText(msghis);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Groupchat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Reciver = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgarea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgtext = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fileupl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(400, 300));

        Reciver.setText("receiver");
        jLayeredPane1.add(Reciver);
        Reciver.setBounds(10, 0, 260, 40);

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(290, 10, 100, 23);

        msgarea.setEditable(false);
        msgarea.setColumns(20);
        msgarea.setRows(5);
        jScrollPane1.setViewportView(msgarea);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 360, 180);

        msgtext.setColumns(20);
        msgtext.setRows(5);
        jScrollPane2.setViewportView(msgtext);

        jLayeredPane1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 236, 280, 60);

        jButton2.setText("Send");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(300, 270, 90, 23);

        jButton3.setText("Attach");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(300, 240, 90, 23);

        fileupl.setText("No File selected to upload");
        jLayeredPane1.add(fileupl);
        fileupl.setBounds(10, 310, 270, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Chatselector obj=new Chatselector(logedusername);
                      this.setVisible(false);
                      obj.setVisible(true); 

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
String msg;
        msg = msgtext.getText();
        if ((msgtext.getText().equals("")))

        {
  
}
else 
            {
           
          
           DataBaseConnection   ok=new DataBaseConnection();
              
String qry="insert into indchat(sender,receiver,msg,documents)"
                      + "values('"+logedusername+"',"
        + "'"+receiverind+"',"
                      + "'"+msg+"',"
                      +"'"+"')";
               ok.insertmthd(qry);
             
        qry="select max(msgid) as cnt from indchat";
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


        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
 JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File("user.dir"));
            int a= file.showSaveDialog(null);
            if(a==JFileChooser.APPROVE_OPTION)
            {
               
            fileupl.setText(file.getSelectedFile().getAbsolutePath());
            String fileonn = file.getSelectedFile().getAbsolutePath();
              DataBaseConnection   ok=new DataBaseConnection();
              
String qry="insert into indchat(sender,receiver,msg,documents)"
                      + "values('"+logedusername+"',"
                        + "'"+receiverind+"',"
                      + "'" +"',"
                      +"'"+fileonn+"')";
               ok.insertmthd(qry);
             
        qry="select max(msgid) as cnt from indchat";
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
            
    }//GEN-LAST:event_jButton3MouseClicked

    
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
            java.util.logging.Logger.getLogger(indchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new indchat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Reciver;
    private javax.swing.JLabel fileupl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea msgarea;
    private javax.swing.JTextArea msgtext;
    // End of variables declaration//GEN-END:variables
}
