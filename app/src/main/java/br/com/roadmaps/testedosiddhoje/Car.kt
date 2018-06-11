package br.com.roadmaps.testedosiddhoje

/**
 * Created by sidd on 09/06/18.
 */
class Car (name: String, year: Int, color:String):Vehicle(name, year) {

    var colorCar:String

    init {
        this.colorCar = color;
    }

    override fun toString(): String {
        return "O carro $name, da cor $colorCar é do ano $year"
    }
}