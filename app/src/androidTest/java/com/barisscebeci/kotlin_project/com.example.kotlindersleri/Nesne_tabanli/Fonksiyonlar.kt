package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

class Fonksiyonlar {

    var mesaj:String? = null

    //bunu daha sonra tanımlayacağım demek lateinit
    lateinit var yazi:String

    //void: geri dönüş değeri olmayan
    fun selamla1() {
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
        yazi = "Merhaba eda"
    }

    //return: geri dönüş değeri olan
    fun selamla2(): String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //parametre
    fun selamla3(isim: String) {
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //overloading fonksiyonların aynı adda olması
    fun carp(sayi1: Int, sayi2: Int) {
        println("Çarpma: ${sayi1 * sayi2}")

    }

    fun carp(sayi1: Int, sayi2: Int, isim: String) {
        println("Çarpma: ${sayi1 * sayi2} - işlem yapan : $isim")

    }


}