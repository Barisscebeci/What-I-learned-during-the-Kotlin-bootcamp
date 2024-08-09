package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli

fun main () {
    val a = ClassA()

    //println(a.x)
    //a.metod()

    //Virtual Object (Sanal Nesne),Nameless Object
    //println(ClassA().x) //1.Nesne
    //ClassA().metod()//2.Nesne

    println(ClassA.x)
    ClassA.metod()
}