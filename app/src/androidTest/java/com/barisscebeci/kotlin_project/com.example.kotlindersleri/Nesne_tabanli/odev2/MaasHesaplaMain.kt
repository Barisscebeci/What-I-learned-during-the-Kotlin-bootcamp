package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

fun main() {
    var maasHesabi = MaasHesapla(100, 10, 20)
    if (maasHesabi.gunSayisi < 20) {
        println("Çalışma Saatiniz ${maasHesabi.calismaSaati} olduğundan maasınız ${maasHesabi.mesaisizUcret}")
    }else {
        println("Çalışma Saatiniz ${maasHesabi.calismaSaati} olduğundan maasınız ${maasHesabi.mesailiUcret}")
    }
}