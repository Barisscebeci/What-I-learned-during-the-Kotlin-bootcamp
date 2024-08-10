package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() // Kalıtım yok , kendi fonksiyonuna erişiyor.
    memeli.sesCikar() // Kalıtım var , Üst sınıfın metoduna erişiyor.
    kedi.sesCikar() //Kalıtım var , kendi sınıflarına - metodlarına erişiyorlar -> override
    kopek.sesCikar() //kalıtım var , kendi metodlarına erişiyorlar. -> override
}