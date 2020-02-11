package parra.mario.calculadorasimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sumar.setOnClickListener{
            suma()
        }
    }

    fun suma(){
        var num1 = et_num1.text.toString().toDouble()
        var num2 = et_num2.text.toString().toDouble()

        var suma = num1 + num2

        tv_resp.setText("$suma")
    }


}
