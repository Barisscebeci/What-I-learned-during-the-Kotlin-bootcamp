package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

fun UrunlerMain() {
    val urun1 = nesne_taban(1, "tv", 8999)
    urun1.bilgiAl()
    urun1.ad = "TV Samsung"
    urun1.fiyat = 10000  //değeri değişti //buradaki değer son yazdığımıza denk geldi
    urun1.bilgiAl()

    val urun2 = nesne_taban(2, "Saat", 3000)
    urun2.bilgiAl()
}