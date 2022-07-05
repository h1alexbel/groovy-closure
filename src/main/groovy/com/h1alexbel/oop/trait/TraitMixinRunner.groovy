package com.h1alexbel.oop.trait

class TraitMixinRunner {

    static void main(String[] args) {
        String.mixin(TraitMixinRunner.class) // all methods in this class now available for String
        "Test".printStr()
    }

    static def printStr(String self) { // whe change string -> self : String as first param!
        // not working with the scripts!
        println "Mixin for $self"
    }
}