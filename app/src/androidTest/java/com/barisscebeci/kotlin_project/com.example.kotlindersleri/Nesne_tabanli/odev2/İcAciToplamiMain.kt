package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

fun main() {
    val icAcilar = IcAciToplami(10)
    if (icAcilar.kenarSayisi < 3) {
        println("Bir çokgen en az 3 adet kenara sahip olmalıdır")
    }else
    {
        println("Çokgenin iç açılar toplamı : ${icAcilar.icAciHesapla()}")
    }
}