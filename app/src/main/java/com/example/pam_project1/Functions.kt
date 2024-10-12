package com.example.pam_project1

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}


fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

// Named Argument
// Named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String = "Indra", age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}