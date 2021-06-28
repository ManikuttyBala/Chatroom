
package chatrum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DataBaseConnection {
     ResultSet rs;
    Statement smt;
    Connection con;
    DataBaseConnection(){
    try{
        
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chatrumdb","root","");
            smt = con.createStatement();
        
           
            System.out.println("connected");
          
}
     catch(Exception e){
            System.out.println(e);
}
    
    }
    public  ResultSet selectmthd(String qry)
    {
         System.out.println(qry);
        try{
         
      
         rs=smt.executeQuery(qry);
        
        }
        catch(Exception e){
            System.out.println(e);
        }
       
       return rs; 
    }  
    public void insertmthd(String qry)
    {
        System.out.println("insert qry");
         System.out.println(qry);
      try{
         smt.executeUpdate(qry);
        
        }
        catch(Exception e){
            System.out.println(e);
        }  
    }
    public void deletemthd(String qry)
    {
        System.out.println("delete qry");
        
      try{
         smt.execute(qry);
         System.out.println(qry);
        }
        catch(Exception e){
            System.out.println(e);
        }  
    }  
 public void updatemthd(String qry)
    {
        System.out.println("update qry");
         System.out.println(qry);
      try{
         smt.executeUpdate(qry);
         System.out.println(qry);
        }
        catch(Exception e){
            System.out.println(e);
        }  
    }
}
