package com.mjd.spring5.bean;

/**
 * @author xiaohaoke
 */
public class Dept {

    private String dname;
    public void setDname(String dname) {
        this.dname=dname;
    }

    public String getDname() {
        return dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
