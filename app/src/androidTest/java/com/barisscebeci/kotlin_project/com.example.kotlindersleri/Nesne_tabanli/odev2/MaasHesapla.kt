package com.barisscebeci.kotlin_project.com.example.kotlindersleri.Nesne_tabanli.odev2

class MaasHesapla(var gunSayisi:Int, var calismaSaatUcreti:Int, var mesaiSaatUcreti:Int){
    var calismaSaati = gunSayisi*8
    var mesaiSaati = calismaSaati-160
    var mesailiUcret = (((calismaSaati-mesaiSaati)*calismaSaatUcreti)+(mesaiSaati*mesaiSaatUcreti))
    var mesaisizUcret = calismaSaati*calismaSaatUcreti
}