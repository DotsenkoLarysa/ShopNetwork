package com.itstep.dos.model;

import javax.persistence.*;

@Entity
@Table(name="seller", schema = "shopnetwork")
public class Seller {
    @Id
    @Column(name="idseller")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idseller;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="birthday")
    private String birthday;

    @Column(name="salary")
    private float salary;

    @ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name="departmentId", nullable=false)
    private Department department;

    public Seller() {
    }

    public Seller(Long idseller, String firstname, String lastname, String birthday,
                  float salary, Department department) {
        this.idseller = idseller;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.salary = salary;
        this.department = department;
    }

    public Long getIdseller() {
        return idseller;
    }

    public void setIdseller(Long idseller) {
        this.idseller = idseller;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "idseller=" + idseller +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", salary=" + salary +
                ", department=" + department.getName_department() +
                ", shop=" + department.getShop().getNameShop() +
                ", city=" + department.getShop().getCity() +
                '}';
    }
}
