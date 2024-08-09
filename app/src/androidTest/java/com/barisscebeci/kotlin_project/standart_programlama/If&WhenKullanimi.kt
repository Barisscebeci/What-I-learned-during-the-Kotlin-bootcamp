package com.barisscebeci.kotlin_project.standart_programlama

fun main() {
    val yas = 22
    val isim = "Barış"

    if (yas >= 18) {
        println("Sayın $isim, Reşitsiniz")
    } else {
        println("Sayın $isim, Reşit Değilsiniz")
    }

    val ka = "admin"
    val s = 123456

    if (ka == "admin" && s == 123456) {
        println("Hoşgeldiniz")
    } else {
        println("Hatalı Giriş")
    }

    val sayi = 11
    if (sayi == 10 || sayi == 20) {
        println("Sayı 10 veya 20")
    } else {
        println("Sayı 10 veya 20 değil")
    }

    //Switch
    val numara = 1
    when (numara) {
        1-> println("Sayi    : 1")
        2-> println("Sayi    : 2")
        3-> println("Sayi    : 3")
        else -> println("Bilinmeyen sayi")

    }
}

