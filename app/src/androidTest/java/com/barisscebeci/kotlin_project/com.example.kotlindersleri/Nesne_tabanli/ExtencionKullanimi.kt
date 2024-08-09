package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

fun main() {
    val sonuc = 10 carp 5
    println("Sonuç : $sonuc")
}

infix fun Int.carp(sayi: Int): Int {
    return this * sayi
    //this = Int'in kendisini temsil ediyor. (extension yapısı
}

//infix = daha kullanuıslı bir yazım şekli