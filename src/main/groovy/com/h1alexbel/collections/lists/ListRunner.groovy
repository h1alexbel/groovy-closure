package com.h1alexbel.collections.lists

def list = [1, 2, 3, 4, 5, 6]
assert list.getClass() == ArrayList

// read
assert list[2] == 3
assert list.get(2) == 3
assert list[-1] == 6 //list.get(list.size() - 1)
assert list[1..3] == [2, 3, 4] // 1..3 - Ranges
assert list[10] == null //vs IndexOutOfBoundException in Java

//write
list += 9 // adds 9 in the end of list
list << 11 << 13 //adds 11 than 13 in the end of list

//methods from queue
list.push(999)
list.pop()
list.head()
list.tail()
list.last()

// flatten, reverse, intersect, disjoint
assert [1, 2, [4, 6, 7], 9].flatten() == [1, 2, 4, 6, 7, 9]
assert [1, 2, 3].reverse() == [3, 2, 1]
assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
assert [1, 2, 3].disjoint([5, 6, 7])// disjoint() returns true if no intersection with input collection
assert ![1, 2, 3].disjoint([4, 2, 1])

// new operators

// multiple assignment
def (a, b, c) = [1, 2, 3, 4, 6]
assert a == 1
assert b == 2
assert c == 3

//spread operator
func(*[1, 2])

static def func(def a, def b) {
    println a
    println b
}