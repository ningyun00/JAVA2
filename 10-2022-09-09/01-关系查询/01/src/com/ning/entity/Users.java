package com.ning.entity;


import java.util.Date;
import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-06
 * @Time 下午 11:08
 */
public class Users {
    private Integer id;//编号
    private String username;//用户名称
    private String sex;//性别
    private Date birthday;//生日
    private String address;//地址
    private List<Orders> orders;
    private List<Role> roles;
    public List<Orders> getOrders() {
        return orders;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", orders=" + orders +
                ", roles=" + roles +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
