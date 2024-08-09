package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

class nesne_taban(var id: Int, var ad: String, var fiyat: Int) {


    init {   //Constructor
        println("Nesne oluşturuldu")    //Bu sınıftan nesne oluşturulduğunda çalışır.
    }

    fun bilgiAl() {
        println("Id       : ${id}")
        println("ad       : ${ad}")
        println("fiyat       : ${fiyat}")
    }
}
// init {
//
//}
//this: bulunduğu sınıfın nesnesi o sınıfı temsil eder swift dilindeki karşılığı self
//super : kalıtım yoluyla gelen üst sınıfı temsil eder