package com.itstep.dos.model;

import javax.persistence.*;

@Entity
@Table(name="department", schema = "shopnetwork")
public class Department {
    @Id
    @Column(name="id_department")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_department;

    @Column(name="name_department")
    private String name_department;

    @Column(name="type_department")
    private String type_department;

    @ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name="shopId", nullable=false)
    private Shop shop;

    public Department() {
    }

    public Department(int id_department, String name_department, String type_department, Shop shop) {
        this.id_department = id_department;
        this.name_department = name_department;
        this.type_department = type_department;
        this.shop = shop;
    }

    public int getId_department() {
        return id_department;
    }

    public void setId_department(int id_department) {
        this.id_department = id_department;
    }

    public String getName_department() {
        return name_department;
    }

    public void setName_department(String name_department) {
        this.name_department = name_department;
    }

    public String getType_department() {
        return type_department;
    }

    public void setType_department(String type_department) {
        this.type_department = type_department;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id_department=" + id_department +
                ", nameShop='" + name_department + '\'' +
                ", typeShop='" + type_department + '\'' +
                ", shop=" + shop.getNameShop() +
                ", city=" + shop.getCity() +
                '}';
    }
}
