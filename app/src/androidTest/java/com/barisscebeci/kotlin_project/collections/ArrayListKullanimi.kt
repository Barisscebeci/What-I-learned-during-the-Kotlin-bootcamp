package com.barisscebeci.kotlin_project.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()  //Türleri burada tanımlıyoruz

    //Veri ekleme
    meyveler.add("Elma")  //0. indeks    add metodu hep sona ekler
    meyveler.add("Muz")   //1.indeks
    meyveler.add("Kiraz")  //2.indeks
    println(meyveler)

    //Gucelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert -> İçerisine ekleme gibi
    meyveler.add(1, "Portakal")  //Araya ekleme, sağ ve sol arasına ekleme yapar
    println(meyveler)

    //Veri okuma
    println(meyveler.get(0))
    println(meyveler[2])

    //boyutu döndür
    println(meyveler.count())
    println(meyveler.size)


    for((indeks,meyve) in meyveler.withIndex()) {   //ekstra olarak indekside istenebilir   ,swift dilinde karşılığı enumerated()
        println("$indeks. -> $meyve")
    }
    //Silme
    meyveler.removeAt(2)
    println(meyveler)

    //temizleme
    meyveler.clear()
    println(meyveler)

}