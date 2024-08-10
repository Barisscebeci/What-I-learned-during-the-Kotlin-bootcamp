package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

fun main() {
    var telekominasyon = KotaHesapla(102, 2, 4)
    if (telekominasyon.internetKullanimi<50) {
        var sonuc = telekominasyon.normalKullanim
        println("Toplam Kullanım : ${telekominasyon.internetKullanimi} GB \n$sonuc tl ödemeniz gereken fiyat")
    }else {
        var sonuc2 = (telekominasyon.kotaAsimUcreti) + (telekominasyon.sabitFiyat*50)
        println("Toplam Kullanım : ${telekominasyon.internetKullanimi} GB \n$sonuc2 tl ödemeniz gereken fiyat")
    }
}