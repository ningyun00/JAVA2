package com.ning.entity;

/**
 * @author 寜
 * @date 2022-08-29
 * @time 下午 04:23
 */
public class MyTest {
    private Integer id;//编号
    private String name;//姓名
    private String type;//类型
    private Float price;//价格

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public MyTest() {
    }

    @Override
    public String toString() {
        return "MyTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
