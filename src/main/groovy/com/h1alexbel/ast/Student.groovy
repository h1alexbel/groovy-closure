package com.h1alexbel.ast

import groovy.transform.Canonical
import groovy.transform.builder.Builder

//@ToString
//@TupleConstructor
//@EqualsAndHashCode
@Canonical
@Builder
//@Immutable
//@Slf4j for logging
class Student {

    Long id
    String name
}