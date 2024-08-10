package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

class IcAciToplami (var kenarSayisi:Int){
    fun icAciHesapla(): Int {
        return 180 * (kenarSayisi-2)
    }
    //var ucgeninlcAcilarToplami = (kenarSayisi-2)*180
}