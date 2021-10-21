package uv.fei.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class EjemplosSpinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplos_spinner)

        val numero1 = findViewById<EditText>(R.id.txtNumero1)
        val numero2 = findViewById<EditText>(R.id.txtNumero2)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        val btnSalir = findViewById<Button>(R.id.btnSalirSpinner)
        val btnAceptar = findViewById<Button>(R.id.btnAceptarSpinner)

        val spinner = findViewById<Spinner>(R.id.spOperaciones)
        val lista = arrayOf("Sumar", "Restar", "Dividir", "Multiplicar")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador;

        btnAceptar.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "Sumar" -> txtResultado.text = "Resultado: ${numero1.text.toString().toDouble() + numero2.text.toString().toDouble()}"
                "Restar" -> txtResultado.text = "Resultado: ${numero1.text.toString().toDouble() - numero2.text.toString().toDouble()}"
                "Dividir" -> txtResultado.text = "Resultado: ${numero1.text.toString().toDouble() / numero2.text.toString().toDouble()}"
                "Multiplicar" -> txtResultado.text = "Resultado: ${numero1.text.toString().toDouble() * numero2.text.toString().toDouble()}"
            }
        }

        btnSalir.setOnClickListener {
            finish()
        }

    }
}