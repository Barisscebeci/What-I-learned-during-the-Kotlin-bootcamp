package com.barisscebeci.kotlin_project.collections

fun main() {
    val meyveler = HashSet<String>()
    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")

    println(meyveler)

    meyveler.add("Amasya Elması")
    println(meyveler)
    meyveler.add("Şeftali")
    println(meyveler)
    meyveler.add("Şeftali2")
    println(meyveler)
    meyveler.add("Şeftali3")
    println(meyveler)

    println(meyveler.size)
    println(meyveler.elementAt(2))

    for((indeks,meyve) in meyveler.withIndex()) {   //ekstra olarak indekside istenebilir   ,swift dilinde karşılığı enumerated()
        println("$indeks. -> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}