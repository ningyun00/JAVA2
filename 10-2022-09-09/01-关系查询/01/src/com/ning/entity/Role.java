package com.ning.entity;

/**
 * @Author 寜
 * @Date 2022-09-06
 * @Time 下午 11:08
 */
public class Role {
    private Integer rid;//rid
    private String rName;//rName
    private String rDesc;//rDesc

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rName='" + rName + '\'' +
                ", rDesc='" + rDesc + '\'' +
                '}';
    }
}
