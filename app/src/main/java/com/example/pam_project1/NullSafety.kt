package com.example.pam_project1

fun nullSafety() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a nul here"

    // This is OK
    nullable = null
}