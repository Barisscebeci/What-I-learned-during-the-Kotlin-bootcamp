package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.paket2

import com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.paket1.A

class B : A() {
    fun metod () {
        val a = A()
        a.publicDegisken=10
        a.varsayilanDegisken=20
    }
}