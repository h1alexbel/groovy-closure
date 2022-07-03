package com.h1alexbel.closure

import java.util.stream.Stream

Closure closure = it -> it + it

Stream.of(1, 2, 3, 4)
        .map(closure)
        .map(String.&valueOf) // we can refer to String.valueOf method using :: or .& syntax
        .forEach(System.out::println)

closure(5) // calls 5 + 5 = 10. Equals to closure.call(5)
Closure closure2 = {
    it + it
}

Closure closureNoArgs = { ->

}

closureNoArgs() //closure no args defines with "->"

Closure closureWithDefaultParams = {
    value = 78 ->
        value + value
}

println closureWithDefaultParams()

int n = 10;
check(n > 0, { print n })

static def check(boolean condition, Closure closure) {
    if (condition) {
        closure()
    }
}