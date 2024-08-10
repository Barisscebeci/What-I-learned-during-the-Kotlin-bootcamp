package com.barisscebeci.kotlin_project.Kalitim

fun main() {
    val topkapiSarayi= Saray(5, 300)

    val bogazVilla= Villa(true, 50)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)

    if (topkapiSarayi is Saray) {
        println("Saraydır")

    }else {
        println("Saray degildir")
    }
}