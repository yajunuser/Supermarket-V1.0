package com.javasoso.supermarket;

import java.util.HashSet;

public class tset {
    public static void main(String[] args) {
      HashSet<Integer> s =  PeopleInformation.getMemberId();
        System.out.println(s);
        System.out.println(s.contains(1900));
        if(s.contains(1900)){
            System.out.println("存在！");
        }else{
            System.out.println("不存在");
        }
    }
}
