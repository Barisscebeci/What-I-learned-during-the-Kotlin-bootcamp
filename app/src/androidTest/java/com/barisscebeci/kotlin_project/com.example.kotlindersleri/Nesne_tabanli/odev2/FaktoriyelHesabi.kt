package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

class FaktoriyelHesabi (var sayi:Int){
    fun faktoriyelHesapla (): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }
}