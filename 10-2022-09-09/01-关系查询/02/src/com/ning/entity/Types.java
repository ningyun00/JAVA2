package com.ning.entity;

/**
 * @Author 寜
 * @Date 2022-09-07
 * @Time 下午 09:04
 */
public class Types {
    private Integer id;
    private Integer uId;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id=" + id +
                ", uId=" + uId +
                ", type='" + type + '\'' +
                '}';
    }
}
