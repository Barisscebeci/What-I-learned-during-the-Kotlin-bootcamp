package com.barisscebeci.kotlin_project

fun main() {
    //1.Compile error
    val sayi = 100
    //sayi = 300
    //2.Exception (Runtime Error)
    val x = 10
    val y = 0



    try {
        println("Sonuç : ${x/y}")
        println("İşlem Tamam")
    }catch (e:Exception){
        println("Sayi 0 a bölünemez")
    }
}