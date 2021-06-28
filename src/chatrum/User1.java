/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrum;

/**
 *
 * @author USER
 */
public class User1 {
    
     private int Userid;
    private String Username,Email,Userpass;
    public User1(int Userid,String Username,String Email,String Userpass)
    {
    this.Userid=Userid;
    this.Username= Username;
    this.Userpass=Userpass;
    }

    User1(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    User1(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getUserid(){
        return Userid;
    }
    public String getUsername(){
        return Username;
    }
     public String getEmail(){
        return Email;
    }
    public String getUserpass(){
        return Userpass;
    }
    
}
