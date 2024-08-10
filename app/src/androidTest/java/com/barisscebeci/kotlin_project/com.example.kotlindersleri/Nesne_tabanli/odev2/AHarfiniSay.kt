package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

class AHarfiniSay (public val kelime : String) {
    fun say() : Int {
        return kelime.lowercase().count { it == 'a'}
    }
}