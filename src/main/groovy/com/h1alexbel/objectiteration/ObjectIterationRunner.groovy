package com.h1alexbel.objectiteration

assert [1, 4, 7, 9].any { it % 2 == 0 }
assert [1, 4, 7, 9].find { it % 2 == 0 } == 4
assert [1, 4, 7, 9].findAll { it % 2 != 0 } == [1, 7, 9]

["asg", "sga", "12", "645", "212f"].grep(~/\d+/) // isCase() called