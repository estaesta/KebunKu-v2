package com.example.kebunku_v2

import java.sql.Time


data class Plant(
    var id: Int = 0,
    var name: String = "",
    var photo: Int = 0,
    var jenis_tanaman: String = "",
    var deskripsi: String = "",
    var kategori: Array<String>? = null,
    var jadwalSiramPerHari: Int = 1,
//    var jamSiram: Time = Time(0,0,0),
    var jamSiram: Int = 0,
    var menitSiram: Int = 0,
    ) {
}
