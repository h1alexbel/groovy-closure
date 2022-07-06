package com.h1alexbel.closure

@Category(Integer)
class IntegerMethods {

    def getCm() {
        this * 10
    }

    def getMm() {
        this
    }

    def getM() {
        getCm() * 100
    }
}