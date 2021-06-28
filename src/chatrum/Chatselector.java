
package chatrum;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Chatselector extends javax.swing.JFrame {

   
    String logedusername = "";
     public Chatselector(String logeduser) {
         logedusername = logeduser;
        
        initComponents();
          winopen();
    }

    public Chatselector() {
        initComponents();
       
    }
public void winopen(){
    DataBaseConnection obj=new DataBaseConnection();
        String qry="select *from usertb";
        ResultSet rs;
        rs=obj.selectmthd(qry);
       String userlist;
        try {
         while(rs.next())
            {
              userlist = rs.getString("Username");
              if(userlist.equals(logedusername)){
              
              }
              else
              {
              usercombo.addItem(userlist);
              }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Adminhome.class.getName()).log(Level.SEVERE, null, ex);
        }
uname.setText(logedusername);
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
        uname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        usercombo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel1.setText("Welcome to the Messenger");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(80, 10, 150, 40);

        uname.setText("username");
        jLayeredPane1.add(uname);
        uname.setBounds(10, 70, 120, 14);

        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(285, 10, 100, 23);

        jButton2.setText("Group Chat");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(283, 40, 100, 23);

        usercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        jLayeredPane1.add(usercombo);
        usercombo.setBounds(80, 150, 130, 20);

        jButton3.setText("Find Chat");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(220, 150, 110, 23);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select your friend to search chats");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(80, 120, 250, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
                      Indexpage obj=new Indexpage();
                      this.setVisible(false);
                      obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Groupchat obj=new Groupchat(logedusername);
                      this.setVisible(false);
                      obj.setVisible(true);        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String reciv= usercombo.getSelectedItem().toString();
        if (reciv == "select"){}
        else{
        indchat obj=new indchat(logedusername, reciv);
                      this.setVisible(false);
                      obj.setVisible(true);   
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Chatselector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chatselector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chatselector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chatselector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chatselector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel uname;
    private javax.swing.JComboBox<String> usercombo;
    // End of variables declaration//GEN-END:variables

}