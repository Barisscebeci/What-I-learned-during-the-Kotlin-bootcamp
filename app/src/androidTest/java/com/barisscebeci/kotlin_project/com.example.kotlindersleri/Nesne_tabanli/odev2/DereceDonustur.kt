package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

class DereceDonustur(public val celsius: Double) {
    fun fahrenheit(): Double {
        return (celsius * 1.8) + 32
    }
}