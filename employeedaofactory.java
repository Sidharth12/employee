
package com.example.dao;

public class employeedaofactory {
    public employeedao createemployeedao(){
        return new employeedaomemoryimpl();
    }
}
