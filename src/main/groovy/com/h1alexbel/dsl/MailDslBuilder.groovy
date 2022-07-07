package com.h1alexbel.dsl

class MailDslBuilder {

    static MailSpecification mail(@DelegatesTo(MailSpecification) Closure closure) {
        def mailSpecification = new MailSpecification()
//        closure.delegate = mailSpecification
//        closure.resolveStrategy = Closure.DELEGATE_ONLY
//        closure()

        // more elegant way
        mailSpecification.with closure
        mailSpecification
    }
}