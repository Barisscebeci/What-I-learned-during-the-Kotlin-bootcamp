package com.barisscebeci.kotlin_project.collections

fun main() {
    val y1 = Yemekler(1,"Baklava", 400)
    val y2 = Yemekler(2,"Makarna", 300)
    val y3 = Yemekler(3,"Kazandibi", 200)

    val yemeklerListesi = ArrayList<Yemekler>()
    yemeklerListesi.add(y1)
    yemeklerListesi.add(y2)
    yemeklerListesi.add(y3)

    println("********Varsayılan Hali***********")
    for(yemek in yemeklerListesi){
        println("${yemek.id} = ${yemek.ad} = ${yemek.fiyat}")
    }

    println("******** Filtreleme 1 ***********")
    val f1 = yemeklerListesi.filter { it.fiyat > 250  && it.fiyat < 350}  //sorgu
    for(yemek in f1){
        println("${yemek.id} = ${yemek.ad} = ${yemek.fiyat}")
    }

    println("******** Filtreleme 2 ***********")
    val f2 = yemeklerListesi.filter { it.ad.contains("ar")}
    for(yemek in f2){
        println("${yemek.id} = ${yemek.ad} = ${yemek.fiyat}")
    }

    println("******** Fiyat : Artan  ***********")
    val s1 = yemeklerListesi.sortedWith (compareBy{it.fiyat})   //Ascend :ASC
    for(yemek in s1){
        println("${yemek.id} = ${yemek.ad} = ${yemek.fiyat} TL")
    }


    println("******** Fiyat : Azalan  ***********")
    val s2 = yemeklerListesi.sortedWith (compareByDescending{it.fiyat})   //descend :DESC
    for(yemek in s2){
        println("${yemek.id} = ${yemek.ad} = ${yemek.fiyat} TL")
    }

    println("******** Ad : Azalan  ***********")
    val s3 = yemeklerListesi.sortedWith (compareByDescending{it.ad})   //descend :DESC
    for(yemek in s3){
        println("${yemek.id} = ${yemek.ad} = ${yemek.fiyat} TL")
    }


}