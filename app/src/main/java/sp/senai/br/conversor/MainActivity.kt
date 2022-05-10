package sp.senai.br.conversor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    var etValorDolar: EditText? = null
    var etQuantidade: EditText? = null
    var tvResultado: TextView? = null
    var btCalcular: TextView? = null
    var btLimpar: TextView? = null
    var swMudarCor: Switch? = null
    var bgConversor: ConstraintLayout? = null
    var ivDolar: ImageView? = null
    var ivReal: ImageView? = null
    var tvNome: TextView? = null
    var ivFundo: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etValorDolar = findViewById<View>(R.id.etValorDolar )  as EditText
        etQuantidade = findViewById<View>(R.id.etQuantidade) as EditText
        tvResultado = findViewById<View>(R.id.tvResultado) as TextView
        btCalcular = findViewById<View>(R.id.btCalcular) as Button
        btLimpar = findViewById<View>(R.id.btLimpar) as Button
        swMudarCor = findViewById<View>(R.id.swMudarCor) as Switch
        bgConversor = findViewById<View>(R.id.bgConversor) as ConstraintLayout
        ivDolar = findViewById<View>(R.id.ivDolar) as ImageView
        ivReal = findViewById<View>(R.id.ivReal) as ImageView
        tvNome = findViewById<View>(R.id.tvNome) as TextView
        ivFundo =findViewById<View>(R.id.ivFundo) as ImageView
        btCalcular!!.setOnClickListener{btCalcularOnClick()}
        btLimpar!!.setOnClickListener{btLimparOnClick()}
        swMudarCor!!.setOnClickListener{swMudarCorOnClick()}



    }

    fun btCalcularOnClick() {
        var valordolar = etValorDolar!!.text.toString().toDouble()
        var quantidade = etQuantidade!!.text.toString().toDouble()
        var resultado = ( valordolar  * quantidade)
        tvResultado!!.text = DecimalFormat("R$ " +"0.00").format(resultado )
        ivDolar!!.setImageResource(R.drawable.umdolar);
        ivDolar!!.visibility = View.VISIBLE
        ivReal!!.setImageResource(R.drawable.cemreais);
        ivReal!!.visibility = View.VISIBLE
    }

    fun btLimparOnClick(){
        etValorDolar!!.setText("")
        etQuantidade!!.setText("")
        tvResultado!!.setText("")
        etValorDolar!!.requestFocus()
        ivReal!!.setVisibility(View.INVISIBLE)
        ivDolar!!.setVisibility(View.INVISIBLE)
    }
    fun swMudarCorOnClick() {
        if (swMudarCor!!.isChecked) {
            bgConversor!!.setBackgroundColor(Color.BLACK)
            btCalcular!!.setBackgroundColor(Color.GRAY)
            btLimpar!!.setBackgroundColor(Color.GRAY)
            etQuantidade!!.setBackgroundColor(Color.GRAY)
            etValorDolar!!.setBackgroundColor(Color.GRAY)
            tvResultado!!.setBackgroundColor(Color.GRAY)
            tvNome!!.setBackgroundColor(Color.GRAY)
            swMudarCor!!.setBackgroundColor(Color.GRAY)
            ivFundo!!.setImageResource(R.drawable.bandeira)
            ivDolar!!.setImageResource(R.drawable.eua)
            ivReal!!.setImageResource(R.drawable.brasil)
        }
        else {
            bgConversor!!.setBackgroundColor(Color.WHITE)
            btCalcular!!.setBackgroundColor(Color.TRANSPARENT)
            btLimpar!!.setBackgroundColor(Color.TRANSPARENT)
            etQuantidade!!.setBackgroundColor(Color.TRANSPARENT)
            etValorDolar!!.setBackgroundColor(Color.TRANSPARENT)
            tvResultado!!.setBackgroundColor(Color.TRANSPARENT)
            tvNome!!.setBackgroundColor(Color.TRANSPARENT)
            swMudarCor!!.setBackgroundColor(Color.TRANSPARENT)
            ivFundo!!.setImageResource(R.drawable.dolar)
            ivDolar!!.setImageResource(R.drawable.umdolar)
            ivReal!!.setImageResource(R.drawable.cemreais)

        }
    }

}