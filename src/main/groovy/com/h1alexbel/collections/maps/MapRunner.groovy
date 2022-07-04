package com.h1alexbel.collections.maps

def map = ['one': 1, 'two': 2] //creates LinkedHashMap
def emptyMap = [:]
assert map.getClass() == LinkedHashMap

// read
assert map.get('one') == 1
assert map['one'] == 1
assert map.'one' == 1
assert map.one == 1 // if not exists -> propertyMissing from MetaClass
assert map.get('no', 10) == 10

// write
map.one = 111

// new method
assert map.subMap('one', 'two') == [one: 111, 'two': 2]

// new operator
def newMap = ['q': 22, 'rt': 99, *: map]
// all values from "map" been added to "newMap"