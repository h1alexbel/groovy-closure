package com.h1alexbel.conditions

int n = 12
switch (n) {
    case String: //isInstance
        print 0
        break
    case 0: //equals
        print 1
        break
    case ~/d+/:
        print 2
        break
    case { it & 5 == 0 }:
        print 3
        break
    case [1, 3, 5, 8, 9]: // list.isCase(12)
        print 4
        break
    default:
        print 'default'
        break

    if (n in [1, 2, 3, 4]) { // list.isCase(12)
        println n
    }
}