package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

fun main() {
    //Nullable , Null Safety , Optional(Swift)
    //tanımlama kısmı bu şekilde
    var mesaj: String? = "Merhaba"

    //Yöntem 1 :
    println("Yöntem 1 :  ${mesaj?.uppercase()}")

    //Yöntem 2 :
    //println("Yöntem 2 :  ${mesaj!!.uppercase()}")
    // iki tane ünlem olmasının sebebi yazılımcı bunun bir sorun olmadığını ve kesin çalışacağını söylediği için bunu kullanıyoruz

    //Yöntem 3:
    if (mesaj != null ) {
        println("Yöntem 3 :  ${mesaj.uppercase()}")
    } else {
        println("Yöntem 3 :  Sonuç null")
    }


    //Yöntem 4 :
    mesaj?.let {
        println("Yöntem 4 :  ${it.uppercase()}")
    }
}