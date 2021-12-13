package pers.donovan.cloudfactory.beans;

public class User {
    private String pkUseraccount;
    private String password;

    public String getPkUseraccount() {
        return pkUseraccount;
    }

    public void setPkUseraccount(String pkUseraccount) {
        this.pkUseraccount = pkUseraccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String pkUseraccount, String password) {
        this.pkUseraccount = pkUseraccount;
        this.password = password;
    }

    public User() {
    }
}
