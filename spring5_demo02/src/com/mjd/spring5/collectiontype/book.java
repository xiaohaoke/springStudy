package com.mjd.spring5.collectiontype;

import java.util.List;

public class book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }


    public void test()
    {
        System.out.println(list+"::");
    }
}
