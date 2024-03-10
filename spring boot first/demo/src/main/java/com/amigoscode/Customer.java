package com.amigoscode;

import java.util.Objects;

public class Customer {
    private Integer Id;
    private String name;
    private String eMail;
    private Integer Age;

    public Customer(Integer id, String name, String eMail, Integer age) {
        Id = id;
        this.name = name;
        this.eMail = eMail;
        Age = age;
    }

    public Customer() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(Id, customer.Id) && Objects.equals(name, customer.name) && Objects.equals(eMail, customer.eMail) && Objects.equals(Age, customer.Age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, eMail, Age);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", Age=" + Age +
                '}';
    }
}
