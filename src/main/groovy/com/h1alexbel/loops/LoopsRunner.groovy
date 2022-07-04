package com.h1alexbel.loops

def list = [1, 2, 3, 4]
for (i in 0..<list.size()) { //creates Range
    println i
}

for (value in list) { // "in" LOOPS and "in" IF are not equal!
    println value
}

0.upto(list.size()) { print it }

list.size().downto(0) { println it }

list.size().times { println it } // from 4 to 0 not including

0.step(5, 2) {
    print it //to 5 step by 2
}