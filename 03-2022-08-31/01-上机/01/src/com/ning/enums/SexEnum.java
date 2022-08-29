package com.ning.enums;

public enum SexEnum {
    male("男"), female("女");

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    SexEnum(String sexs) {
        this.sex = sexs;
    }

    public void showSex() {
        System.out.println("sex：" + sex);
    }
}
