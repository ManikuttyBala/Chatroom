
package chatrum;


class Admin1 {
    private int adminid;
    private String AdminName,Pass;
    public Admin1(int adminid,String AdminName,String Pass)
    {
    this.adminid=adminid;
    this.AdminName= AdminName;
    this.Pass=Pass;
    }

    Admin1(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getadminid(){
        return adminid;
    }
    public String getAdminName(){
        return AdminName;
    }
    public String getPass(){
        return Pass;
    }
}
