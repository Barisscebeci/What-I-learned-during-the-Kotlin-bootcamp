package com.barisscebeci.kotlin_project.collections

fun main() {
    //Swift : Dictionary
    //json veri modeline benziyor.
    //Value kısmı value : Any yazabilir -> Any yazıyortsa her türde çalışma yapabilirsin
    val iller = HashMap<Int,String>()
    iller.put(16,"Bursa")
    iller[35] = "İzmir"
    println(iller)

    println(iller[16])
    println(iller.get(35))

    //Güncelleme
    iller.put(16,"Yeni Bursa")
    println(iller)

    println(iller.size)

    for((anahtar,deger) in iller) {
        println("$anahtar -> $deger")
    }

    iller.remove(35)
    println(iller)

    iller.clear()
    println(iller)
}