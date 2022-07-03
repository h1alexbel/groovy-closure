package com.h1alexbel.conditions

def customer = new Customer(1L)

//if (customer != null) {
//    // some logic
//}

customer?.getId()?.toInteger() // equals to null check, but more elegant

def value = 123
def result = value?:1