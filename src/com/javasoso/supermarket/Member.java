package com.javasoso.supermarket;

import java.util.ArrayList;

public class Member {
    private int id;
    private String day;
    private int jifen;

    public Member() {
    }

    public Member(int id, String day, int jifen) {
        this.id = id;
        this.day = day;
        this.jifen = jifen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getJifen() {
        return jifen;
    }

    public void setJifen(int jifen) {
        this.jifen = jifen;
    }


    public static void main(String[] args) {
        ArrayList<Member> list = PeopleInformation.getMember();
        System.out.println(list.get(0).getJifen());
        list.get(0).setJifen(123456789);

        ArrayList<Member> xxx = PeopleInformation.getMember();
        System.out.println(xxx.get(0).getJifen());

    }
}
