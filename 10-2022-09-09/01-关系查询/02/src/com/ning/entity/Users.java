package com.ning.entity;

import java.util.List;

/**
 * @Author 寜
 * @Date 2022-09-07
 * @Time 下午 09:03
 */
public class Users {
    private Integer id;
    private String name;
    private Integer sex;
    private String type;
    private Types types;
    private List<Types> typesList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public List<Types> getTypesList() {
        return typesList;
    }

    public void setTypesList(List<Types> typesList) {
        this.typesList = typesList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", type='" + type + '\'' +
                ", types=" + types +
                ", typesList=" + typesList +
                '}';
    }
}
