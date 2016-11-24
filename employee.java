
package com.example.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class employee {

    public employee(String firstname, String lasttname, int id, Date dob, Float salary) {
        this.firstname = firstname;
        this.lasttname = lasttname;
        this.id = id;
        this.dob = dob;
        this.salary = salary;
    }
    public String firstname;
    public String lasttname;
    public int id;
    public Date dob;
    public float salary;
    SimpleDateFormat sdf =new SimpleDateFormat("dd.mm.yyyy");
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
   


public String toString(){
return( "firstname is :"+firstname+"\\n"+"lasttname is :"+lasttname+"\\n"+"id is :"+id+"\\n"+"Date of birth is"+sdf.format(dob)+"Salary is : "+salary);
}
}