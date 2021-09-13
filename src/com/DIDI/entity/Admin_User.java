package com.DIDI.entity;

public class Admin_User {
    private String name;
    private String passwd;

    public Admin_User(String NAME, String PASSWD) {
        super();
        name=NAME;
        passwd=PASSWD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
