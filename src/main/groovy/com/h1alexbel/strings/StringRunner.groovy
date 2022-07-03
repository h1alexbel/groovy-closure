package com.h1alexbel.strings

def stringValue = 'Hi!'

def value = "Aliaksei $stringValue"

def slashString = /value/

def dollarString = $/dollarValue/$

def tripleString = '''triple value'''

def tripleDoubleString = """triple double value"""

print value

def name = "Ivan"

char letterH = 'H'

def query = """
SELECT *
FROM
table
WHERE name = ${getNameWithPrefix(name)}
"""

def getNameWithPrefix(String name) {
    "prefix-" + name
}

print query
print query[1..2]