package com.h1alexbel.oop

import com.h1alexbel.oop.trait.WithId
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
//@Mixin(WithId.class) // Mixins are outdated. value = class or interface
// for all field combinations
class Employee implements WithId {

    String firstName
    String lastName
    Integer id

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def methodMissing(String name, Object args) {
        println "missing method $name is invoked: $args"
        def field = name - "findBy"
        println "select * from Employee where $field = ${args[0]}"
    }

    def propertyMissing(String name) {
        println "missing property $name"
        "default value for this property"
    }
}