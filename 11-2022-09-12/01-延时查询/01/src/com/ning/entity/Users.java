package com.ning.entity;

/**
 * @Author 寜
 * @Date 2022-09-09
 * @Time 上午 08:52
 */
public class Users {
    private Integer id;
    private String name;
    private Integer sex;
    private String type;
    private Types types;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", type='" + type + '\'' +
                ", types=" + types +
                '}';
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

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
}
