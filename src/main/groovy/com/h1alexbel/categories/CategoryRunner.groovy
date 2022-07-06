package com.h1alexbel.categories

import com.h1alexbel.oop.Employee

class CategoryRunner {

    static void main(String[] args) {
        def employee = new Employee(firstName: "Ivan", lastName: "Ivanov")
        use(DefaultEmployeeMethods.class) {
            employee.testStr()
        }
        // employee.testStr() method will be removed
        // This Method will be removed from MetaClass after closure execution
    }
}