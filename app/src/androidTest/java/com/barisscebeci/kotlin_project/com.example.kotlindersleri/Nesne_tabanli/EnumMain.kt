package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

fun main() {
    ucretHesapla(KonserveBoyut.ORTA, 120)
}

fun ucretHesapla(Boyut: KonserveBoyut, adet:Int) {
    when(Boyut) {
        KonserveBoyut.KUCUK -> println("Toplam tutar: ${adet * 130}₺")
        KonserveBoyut.ORTA -> println("Toplam tutar: ${adet * 210}₺")
        KonserveBoyut.BUYUK -> println("Toplam tutar: ${adet * 460}₺")
    }
}