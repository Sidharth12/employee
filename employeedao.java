
package com.example.dao;

import com.example.model.employee;
import static java.lang.reflect.Array.get;

public interface employeedao {
    public void add(employee emp);
    public void update(employee emp);
    public void delete(int id);
    public employee findbyid(int id);
    public employee[] getallemployees();
}
