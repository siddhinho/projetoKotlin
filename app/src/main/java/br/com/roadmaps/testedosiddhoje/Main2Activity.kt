package br.com.roadmaps.testedosiddhoje

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var name = intent.getStringExtra("Nome")
        var valor = intent.getIntExtra("Valor",0)
        var valorDouble = intent.getDoubleExtra("Valor Double", 0.0)

        textView2.text = "Nome = $name e valor = $valor e double = $valorDouble"

    }

    fun showToast (view: View){
//        toast("OI Sidd")
        longToast("Sidd Demorado")
    }

    fun showSnack(view: View){
        snackbar(view, "Hora do Almoço")
    }
}
