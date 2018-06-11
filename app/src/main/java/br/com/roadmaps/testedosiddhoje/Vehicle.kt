package br.com.roadmaps.testedosiddhoje

/**
 * Created by sidd on 09/06/18.
 */
open class Vehicle(name: String, year: Int) {

    var name:String
    var year:Int

    init {
        this.name = name;
        this.year = year;
    }

    open fun acelerar (velocidade: Int){
        println("Acelerando até $velocidade")
    }

    override fun toString(): String {
        return "O carro $name é do ano $year"
    }
}
