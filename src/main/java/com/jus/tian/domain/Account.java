package com.jus.tian.domain;

import java.io.Serializable;

/**
 * @Auther: JusChui
 * @Date: 2020/11/5 15:12
 * @Description:
 */
public class Account implements Serializable {

    private String id;
    private String name;
    private float money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
