package br.com.roadmaps.testedosiddhoje

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "Lalallaa"

        val car:Vehicle = Vehicle("Corsa", 2010)
        println(car)

        val car2:Car = Car("Ferrari", 2018, "Vermelha" )
        println(car2)

        car.acelerar(100)
        car2.acelerar(200)

        println("Teste do sidd".ascii())

        println(car.toString().stringComData())

        val ints = listOf(1,2,3,4,5,6)

        val novaLista = filtrar(ints, ::numeroPar)
        println(novaLista)


        val ints2 = listOf(1,2,3,4,5,6,20,30,40,50)
        val novaLista2 = filtrar(ints2, ::maiorDoQue10)
        println(novaLista2)

    }

    fun String.ascii():String{
        var s = ""
        for (c in this){
            s += c.toInt()
        }
        return s;
    }

    fun callNewActivity(view: View){
//        startActivity(Intent(this@MainActivity, 	Main2Activity::class.java)
//                .putExtra("Nome", "Siddhartha")
//
//                .putExtra("Valor Double", 1.1));

        startActivity<Main2Activity>("Nome" to "Sidd", "Valor" to 30)



    }

    fun String.stringDoSidd():String{
        return "String do Sidd = $this"
    }

    fun String.stringComData():String{
        return "$this,  ${Date()}"
    }

    fun showAlert(view:View){
        alert("Hi, I'm Roy", "Have you tried turning it off and on again?") {
            yesButton { toast("Oh…") }
            noButton {}
        }.show()

    }

    fun showSelector(view: View ){
//        val countries = listOf("Russia", "USA", "Japan", "Australia")
//        selector("Where are you from?", countries, { dialogInterface, i ->
//            toast("So you're living in ${countries[i]}, right?")
//        })

//       var progress = indeterminateProgressDialog("Wait", "Title")
//
//        progress.cancel()

        val dialog = progressDialog(message = "Please wait a bit…", title = "Fetching data")
        for (i in 0 .. 100 step 2) {

            dialog.incrementProgressBy(i)
        }
    }



    fun maiorDoQue10(valor:Int):Boolean = valor > 10

    fun numeroPar(valor: Int):Boolean = valor % 2 == 0

    fun filtrar(lista:List<Int>, filtro:(Int)->(Boolean)):List<Int>{
        val newList = arrayListOf<Int>()
        for(item in lista){
            if(filtro(item)){
                newList.add(item)
            }
        }
        return newList
    }

    fun nomeFacil(lista:List<Int>, nomeDaFuncao:(Int, Int)->(Boolean)):List<Int>{

    }

}
