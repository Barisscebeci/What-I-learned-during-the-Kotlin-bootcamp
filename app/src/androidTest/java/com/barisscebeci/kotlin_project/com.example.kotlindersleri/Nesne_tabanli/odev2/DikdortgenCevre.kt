package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

class DikdortgenCevre (var x: Double, var y:Double) {
    fun cevreHesapla(): Double {
        return 2 * (x + y)
    }
}