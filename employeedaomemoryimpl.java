
package com.example.dao;

import com.example.model.employee;
import java.util.ArrayList;
import java.util.List;


public class employeedaomemoryimpl implements employeedao{

    public static employee[] employeearr=new employee[10];
    
    public void add(employee emp){
        employeearr[emp.getId()]=emp;
    }
    
    public void update(employee emp){
        employeearr[emp.getId()]=emp;
    }
    
    public void delete(int id){
        employeearr[id]=null;
    }

   public employee findbyid(int id){
       return employeearr[id];
   }
   
   
   public employee[] getallemployees(){
   List<employee> emps=new ArrayList<>();
   for(employee e:employeearr){
   if(e!=null){
   emps.add(e);
   }
   }
   return emps.toArray(new employee[0]);
   }
}
