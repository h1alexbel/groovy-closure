package com.h1alexbel.closure

import com.h1alexbel.oop.Employee

class Closure2Runner {

    static void main(String[] args) {
        Closure closure = {
            firstName = "John"
        }
        closure.thisObject // Closure2Runner
        closure.owner // Closure2Runner
        closure.delegate // owner

        def employee = new Employee(firstName: "")
        println employee

        closure.delegate = employee
        closure()
        println employee

//        closure.resolveStrategy = 1
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
        employee.with {

        }
    }
}