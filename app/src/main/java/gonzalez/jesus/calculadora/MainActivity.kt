package gonzalez.jesus.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var texto: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultado:TextView=findViewById(R.id.textView2) as TextView
        val numeros:TextView=findViewById(R.id.textView3) as TextView

        val num0: Button =findViewById(R.id.btn0) as Button
        val num1: Button =findViewById(R.id.btn1) as Button
        val num2: Button =findViewById(R.id.btn2) as Button
        val num3: Button =findViewById(R.id.btn3) as Button
        val num4: Button =findViewById(R.id.btn4) as Button
        val num5: Button =findViewById(R.id.btn5) as Button
        val num6: Button =findViewById(R.id.btn6) as Button
        val num7: Button =findViewById(R.id.btn7) as Button
        val num8: Button =findViewById(R.id.btn8) as Button
        val num9: Button =findViewById(R.id.btn9) as Button

        val suma: Button =findViewById(R.id.btnMas) as Button
        val resta: Button =findViewById(R.id.btnMenos) as Button
        val division: Button =findViewById(R.id.btnDivision) as Button
        val multiplicacion: Button =findViewById(R.id.btnMultiplicar) as Button

        val result: Button =findViewById(R.id.btnResultado) as Button
        val borrar: Button =findViewById(R.id.btnBorrar) as Button

        //Boton del numero 0
        num0.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "0")

        }

        //Boton del numero 1
        num1.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "1")
        }

        //Boton del numero 2
        num2.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "2")
        }

        //Boton del numero 3
        num3.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "3")
        }

        //Boton del numero 4
        num4.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "4")
        }

        //Boton del numero 5
        num5.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "5")
        }

        //Boton del numero 6
        num6.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "6")
        }

        //Boton del numero 7
        num7.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "7")
        }

        //Boton del numero 8
        num8.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "8")
        }

        //Boton del numero 9
        num9.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "9")
        }

        //Boton para sumar
        suma.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "+")
        }

        //Boton para restar
        resta.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "-")
        }

        //Boton para multiplicar
        multiplicacion.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "*")
        }

        //Boton para dividir
        division.setOnClickListener{
            texto = textView3.text.toString()
            textView3.setText(texto + "/")
        }

        //Boton para realizar el total, dependiendo la operacion
        result.setOnClickListener{
            var cont: Int = 1
            var operadoizq: String = ""
            var operadoder: String = ""
            var operacion: Int = 0
            for (caracter in texto){
                if (caracter.equals('+')){

                    operadoizq = textView3.text.toString().substring(0,cont-1)
                    operadoder = textView3.text.toString().substring(cont)

                    operacion = operadoizq.toInt() + operadoder.toInt()
                    textView2.setText(operacion.toString())
                   textView3.setText(textView2.text)

                }else if (caracter.equals('-')){

                    operadoizq = textView3.text.toString().substring(0,cont-1)
                    operadoder = textView3.text.toString().substring(cont)

                    operacion = operadoizq.toInt() - operadoder.toInt()
                    textView2.setText(operacion.toString())
                    textView3.setText(textView2.text)
                }else if (caracter.equals('/')){

                    operadoizq = textView3.text.toString().substring(0,cont-1)
                    operadoder = textView3.text.toString().substring(cont)

                    operacion = operadoizq.toInt() / operadoder.toInt()
                    textView2.setText(operacion.toString())
                    textView3.setText(textView2.text)
                }
                else if (caracter.equals('*')){

                    operadoizq = textView3.text.toString().substring(0,cont-1)
                    operadoder = textView3.text.toString().substring(cont)

                    operacion = operadoizq.toInt() * operadoder.toInt()
                    textView2.setText(operacion.toString())
                    textView3.setText(textView2.text)
                }

                cont++
            }
        }

        //Boton para borrar los numeros y operacion que estan en el TextView
        borrar.setOnClickListener{
            if (texto.length >= 1){
             texto = textView3.text.toString().substring(0, texto.length -1)
         textView3.setText(texto)
        }}
    }


}
