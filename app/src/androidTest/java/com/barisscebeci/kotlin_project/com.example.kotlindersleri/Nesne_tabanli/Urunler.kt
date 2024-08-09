package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

class Urunler(var id: Int, var ad: String, var fiyat: Int) {

    init {   //Constructor
        println("Nesne oluşturuldu")    //Bu sınıftan nesne oluşturulduğunda çalışır.
    }

    fun bilgiAl() {
        println("Id       : ${id}")
        println("ad       : ${ad}")
        println("fiyat       : ${fiyat}")
    }
}