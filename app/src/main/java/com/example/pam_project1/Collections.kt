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

    // Menambahkan data ke dalam list mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    // Mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun main() {
    contohList()
}