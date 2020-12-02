package com.itstep.dos.model;

import javax.persistence.*;

@Entity
@Table(name="shop", schema = "shopnetwork")
public class Shop {
    @Id
    @Column(name="idshop")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idShop;

    @Column(name="nameshop")
    private String nameShop;

    @Column(name="typeshop")
    private String typeShop;

    @Column(name="city")
    private String city;

    public Shop() {
    }

    public int getIdShop() {
        return idShop;
    }

    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getTypeShop() {
        return typeShop;
    }

    public void setTypeShop(String typeShop) {
        this.typeShop = typeShop;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "idShop=" + idShop +
                ", nameShop='" + nameShop + '\'' +
                ", typeShop='" + typeShop + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
