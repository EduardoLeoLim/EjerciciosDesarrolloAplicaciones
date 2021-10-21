package uv.fei.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class Listas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listas)

        val txtDescriptor = findViewById<TextView>(R.id.txtdescripcion)
        val lista = findViewById<ListView>(R.id.lstNumeros)

        val nombres = arrayOf("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez")
        val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres)
        lista.adapter = adaptador1

        lista.setOnItemClickListener { adapterView, view, i, l ->
            txtDescriptor.text = "El número es: ${numeros[i]}"
        }

        val btnSalir = findViewById<Button>(R.id.btnSalirListas)
        btnSalir.setOnClickListener {
            finish()
        }
    }
}