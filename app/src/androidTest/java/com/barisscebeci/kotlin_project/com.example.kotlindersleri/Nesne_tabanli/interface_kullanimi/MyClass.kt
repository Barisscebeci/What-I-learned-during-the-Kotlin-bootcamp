package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.interface_kullanimi

class MyClass : MyInterface {  //Önemli İnterface ile kalıtımın farkı isim sonrası parantez var kalıtımda interface de parantez yoktur , şu an hata almamın sebebi kalıtımdan bir diğer farkıdır
    override val degisken: Int = 10


    override fun metod1() {
        println("Metod 1 çalıştı")
    }

    override fun metod2(): String {
        return "Metod 2 çalıştı"
    }

}