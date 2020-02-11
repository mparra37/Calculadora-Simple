package parra.mario.calculadorasimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sumar.setOnClickListener{
            operacion(1)
        }
        btn_restar.setOnClickListener{
            operacion(2)
        }
        btn_mult.setOnClickListener{
            operacion(3)
        }
        btn_dividir.setOnClickListener {
            operacion(4)
        }
    }

    fun operacion(op: Int){
        var num1 = et_num1.text.toString().toDouble()
        var num2 = et_num2.text.toString().toDouble()

        var resp: Double = 0.0

        when(op){
            1 -> resp = num1 + num2
            2 -> resp = num1 - num2
            3 -> resp = num1 * num2
            4 -> {
                if (num2 != 0.0){
                    resp = num1 / num2
                }else{
                    //Mensaje para el usuario
                    Toast.makeText(this, "ERROR: División por cero", Toast.LENGTH_LONG).show()
                }

            }}

        tv_resp.setText("$resp")
    }


}
