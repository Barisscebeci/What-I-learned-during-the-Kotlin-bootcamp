package com.barisscebeci.kotlin_project.Degiskenler

fun main() {
    println("Uygulamaya Hoşgeldiniz")
    var urunAdi = "Macbook Pro"
    var urunFiyati = 45999
    var kisiBoyu = 1.78
    var Kategori = "Bilgisayar"
    var dogruMu = true

    println("Ürünün Adi: $urunAdi") //Swift $urunAdi = /(urunAdi)
    println("Ürünün Fiyatı: ${urunFiyati * 2}")
    println("Kategori: $Kategori")
    println("Satın Almak İstiyor musunuz: $dogruMu")
    println("Kişi Boyu: $kisiBoyu")

    //Sabitler = Constant
    //Swift let , Java-Dart final
    var sayi = 30   //Sonradan değiştirilebilir
    println(sayi)
    sayi = 100
    println(sayi)
    val numara = 90         //Sonradan değiştirilemez
    println(numara)

    //Tür Dönüşümü - Type Casting
    //Sayısal bir degerden Sayisal bir degere dönüşüm
    val i =42
    val d = 93.67

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println("Sonuç 1    : $sonuc1")
    println("Sonuç 2    : $sonuc2")

    //Sayısaldan Metne Dönüşüm
    val sayisaldanMetne = 1708  //
    val sonuc3 = sayisaldanMetne.toString()
    println("Sonuç 3    : $sonuc3")

    //Metinden Sayisala Dönüşüm
    var metindenSayisalDonusum = "deneme"  //İçerisine string bir ifade yazıldığında örnek veriyorum Deneme bunu int e çevirmek istediğimde exception fırlatmaktadır
    val sonuc4 = metindenSayisalDonusum.length.toInt()
    val sonuc5 = metindenSayisalDonusum.toIntOrNull()

    println("Sonuç 4    : $sonuc4")
    println("Sonuç 5    : $sonuc5")
    metindenSayisalDonusum = "1234"
    val sonuc6 = metindenSayisalDonusum.toInt()
    println("Sonuc 6    : $sonuc6")
}