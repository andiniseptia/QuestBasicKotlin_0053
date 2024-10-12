package com.example.pam_project1

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya yang dimasukkan akan memiliki posisi sesuai urutan.
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah.
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun contohList() {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)
}

fun main() {
    contohList()
}