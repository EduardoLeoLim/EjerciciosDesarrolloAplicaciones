package uv.fei.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView

class RadioYCheckBotones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_ycheck_botones)

        //Código para manejar checkboxes

        val opcion1 = findViewById<CheckBox>(R.id.chkOpcion1)
        val opcion2 = findViewById<CheckBox>(R.id.chkOpcion2)
        val txtSalida = findViewById<TextView>(R.id.txtsalidaBotones)
        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        btnAceptar.setOnClickListener {
            var ops = ""
            if (opcion1.isChecked) {
                ops += "\n\tOpcion 1"
            }

            if (opcion2.isChecked) {
                ops += "\n\tOpción 2"
            }

            if(ops.length > 0) {
                txtSalida.text = "Opciones seleccionadas:${ops}"
            } else {
                txtSalida.text = "No seleccionaste ninguna opción"
            }
        }

        //Código para radiobutton

        val r1 = findViewById<RadioButton>(R.id.rdbOpcionA)
        val r2 = findViewById<RadioButton>(R.id.rdbOpcionB)
        val btnOK = findViewById<Button>(R.id.btnAceptarRadio)

        btnOK.setOnClickListener {
            var opciones = ""
            if (r1.isChecked)
                opciones = "\n\tOpción A"

            if (r2.isChecked)
                opciones = "\n\tOpción B"

            if (opciones.length > 0)
                txtSalida.text = "Opcion seleccionada: ${opciones}"
            else
                txtSalida.text = "No seleccionaste ninguna opción"
        }



        //Codigo para cerrar activity
        val btnSalir = findViewById<Button>(R.id.btnSalirBotones)
        btnSalir.setOnClickListener {
            finish()
        }
    }
}