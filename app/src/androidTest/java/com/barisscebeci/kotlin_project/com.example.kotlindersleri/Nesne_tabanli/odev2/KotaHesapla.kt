package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

class KotaHesapla (var internetKullanimi:Int, var sabitFiyat:Int,var asimFiyati:Int){
    var normalKullanim = internetKullanimi*sabitFiyat
    var kotaAsimUcreti = ((internetKullanimi-50)*asimFiyati)
}