package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

fun main() {
    val f = Fonksiyonlar()
    f.selamla1()

    val gelensonuc = f.selamla2()
    f.selamla2()
    println("Gelensonuc : $gelensonuc")

    f.selamla3("barış")


    f.carp(5, 10)
    f.carp(10, 4, "barış")
}