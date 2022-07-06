package com.h1alexbel.categories

import com.h1alexbel.oop.Employee

@Category(Employee.class)
class DefaultEmployeeMethods {

    def testStr() { // this method will be static in the byte code
        println "$firstName"
        println "$lastName"
    }
}