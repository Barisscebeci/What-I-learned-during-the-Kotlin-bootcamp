package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.override_kullanimi

open class Hayvan {
    open fun sesCikar() {               //open keywoard ü olmak zorunda         ,           Composable ile başlarsa fonksiyonun baş harfi büyük eğer yok ise küçük harf ile başlayacağız
        println("Sesim yok")
    }
}


//open olması özellik aktarımına açık anlamına gelir