package com.h1alexbel.oop

def employee = new Employee() // no args constructor by default

employee.firstName = "Ivan" // setFirstName
employee.firstName // getFirstName
employee['firstName']
employee.'firstName'
employee.@firstName // not recommended

def peter = new Employee(firstName: "Peter", lastName: "Petrov")
// all args constructor by default represented by Map!
println peter

Employee violetta = ["Violetta", "Ivanova"] // Coercion needs @TupleConstructor
println violetta

// Multiple assignment
def (fn, ln) = violetta // calls def getAt(Integer i) - field index (starts from 0)
println fn
println ln

[peter, violetta].collect { it.firstName }

// Spread operator
[peter, violetta]*.firstName