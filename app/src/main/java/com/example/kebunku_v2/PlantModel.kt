package com.example.kebunku_v2

class PlantModel {
    var listPlant: ArrayList<Plant> = arrayListOf(
        Plant(1,"Broccoli", R.drawable.broccoli, jadwalSiramPerHari = 1, jamSiram = 13, menitSiram = 32),
        Plant(2,"Cabbage", R.drawable.cabbage, jadwalSiramPerHari = 1, jamSiram = 13, menitSiram = 33),
        Plant(3,"Carrot", R.drawable.carrot, jadwalSiramPerHari = 1, jamSiram = 13, menitSiram = 34),
//        Plant("Corn", R.drawable.corn),
//        Plant("Cucumber", R.drawable.cucumber),
//        Plant("Eggplant", R.drawable.eggplant),
//        Plant("Ginger", R.drawable.ginger),
//        Plant("Radish", R.drawable.radish),
//        Plant("Asparagus", R.drawable.asparagus),
//        Plant("beetroot", R.drawable.beetroot),
//        Plant("Bell Pepper", R.drawable.bellpepper),
//        Plant("Champignon", R.drawable.champignon),
//        Plant("Chili", R.drawable.chili),
//        Plant("Kale", R.drawable.kale)
    )

    fun getList(): ArrayList<Plant> {
        return listPlant
    }

}