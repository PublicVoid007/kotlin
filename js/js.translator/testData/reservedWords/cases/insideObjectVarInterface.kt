package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

object TestObject {
    var `interface`: Int = 0

    fun test() {
        testNotRenamed("interface", { `interface` })
    }
}

fun box(): String {
    TestObject.test()

    return "OK"
}