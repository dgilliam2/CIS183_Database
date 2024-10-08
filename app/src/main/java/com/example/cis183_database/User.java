package com.example.cis183_database;

public class User
{
    private int user_id;
    private String fname;
    private String lname;
    private String email;

    public User()
    {

    }
    public User(int i, String f, String l, String e)
    {
        user_id = i;
        fname = f;
        lname = l;
        email = e;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
