package com.h1alexbel.closure

class Task2 {

    static void main(String[] args) {
        Integer.metaClass {
            getCm = {
                delegate * 10
            }

            getMm() {
                delegate
            }

            getM() {
                delegate.cm * 100
            }
        }
        def result = 3.cm + 1.m - 25.mm
        assert result == 1005
    }

    private static Object firstOption() {
        use(IntegerMethods) {
            def result = 3.cm + 1.m - 25.mm
            assert result == 1005
        }
    }
}