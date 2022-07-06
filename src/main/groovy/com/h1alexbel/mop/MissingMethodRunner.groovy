package com.h1alexbel.mop

import com.h1alexbel.oop.Employee

class MissingMethodRunner {

    static void main(String[] args) {
        def employee = new Employee()
//        employee.test()
        employee.abc

        def map = ["1": 11, "2": 22, "abc": 13]
        println map."1" // MOP -> map.get(1) using property missing

        // spring-data, EmployeeRepository
        employee.findByFirstName("John")
    }
}