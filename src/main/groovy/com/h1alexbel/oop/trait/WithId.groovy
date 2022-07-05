package com.h1alexbel.oop.trait

trait WithId {

    Integer id

    boolean validateId(Integer id) {
        id > 0
    }
}