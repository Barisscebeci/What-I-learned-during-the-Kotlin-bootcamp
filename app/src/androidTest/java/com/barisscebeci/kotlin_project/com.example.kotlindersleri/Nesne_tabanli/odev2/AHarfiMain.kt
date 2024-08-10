package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

fun main() {
    val bulmaca = AHarfiniSay("abbbbaaabbbbbbaaaaddddddaabbbbbabbbbaaaacccccccaaaabbbbaaabbbbbabbbbbbaaabbbbbaaaaaaaaa")
    val aHarfSayisi = bulmaca.say()
    println("Kelime içerisindeki 'a' harfi sayısı : $aHarfSayisi")
}