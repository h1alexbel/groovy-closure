package com.h1alexbel.collections.ranges

def range = 2..8 //from 2 to 8
//def range = 2..<8 // not include value "8"
assert range.getClass() == IntRange
assert range.get(3) == 5
assert range.contains(8)
range.each { print it }

('a'..'d').each { println it }
(WeekDay.MONDAY..WeekDay.FRIDAY).each { println it }
// range must implement methods next() and previous()!
enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}