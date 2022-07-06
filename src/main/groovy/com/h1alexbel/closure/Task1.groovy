package com.h1alexbel.closure

import com.h1alexbel.oop.Employee

class Task1 {

    static void main(String[] args) {
//       new HashSet<>([1, 2, 3, 4, 4])
        Class.metaClass.make = { Object[] values ->
            delegate.metaClass.invokeConstructor(values)
        }
        def set = HashSet.make([1, 2, 3, 4, 4])
        def employee = Employee.make("John", "Doe")
        def empty = Employee.make()

        println set
        println employee
        println empty
    }
}