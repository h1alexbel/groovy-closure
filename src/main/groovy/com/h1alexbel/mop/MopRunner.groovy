package com.h1alexbel.mop

import com.h1alexbel.oop.Employee
import org.codehaus.groovy.runtime.DefaultGroovyMethods

class MopRunner {

    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass()
        // println method in DefaultGroovyMethods
        def method = DefaultGroovyMethods.class
                .getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)
        def employee = new Employee()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(employee, employee, "Meta class test")

        // MetaClass
        println employee.metaClass

        // ExpandoMetaClass
        employee.metaClass.abc = "Property"
        employee.metaClass.test = {
            println "new method"
        }
        employee.test()
        println employee.metaClass // ExpandoMetaClass

        employee.class.metaClass.newMethod = { int value ->
            println "new Methods in class Employee, $value"
        }

        // employee.newMethod(20) MethodMissing
        // This method available only in new Employee objects

        new Employee().newMethod(20)

        // ProxyMetaClass - interceptors
    }
}