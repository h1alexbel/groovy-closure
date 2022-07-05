package com.h1alexbel.io.exception

class IORunner {

    static void main(String[] args) {

        def file = new File("build.gradle")
        println file.text

        file.each { line -> println line }
        // all exceptions are unchecked

        //write
        def fileToWrite = new File("text.txt")
        fileToWrite.text = "Some text" // creates file called "text.txt" then write text "Some text"
        fileToWrite << "new Line" << System.lineSeparator()
    }
}