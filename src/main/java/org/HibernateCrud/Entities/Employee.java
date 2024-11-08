package org.HibernateCrud.Entities;

import javax.persistence.*;

@Table
@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int id;

    @Column
    String name;

    @Column
    String Dept;

    @Column
    String email;

    //Defoult cons
    public Employee(){

    }

    //Parameteraized cons
    public Employee(String name,String Dept, String email) {
        this.name = name;
        this.Dept = Dept;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

}
