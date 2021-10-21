package uv.fei.miaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnabrirAcercade = findViewById<Button>(R.id.btnAcercaDe)
        btnabrirAcercade.setOnClickListener{
            val intento1 = Intent(this, AcercaDe::class.java)
            startActivity(intento1)

        }

        val btnAbrirListas = findViewById<Button>(R.id.btnEjemploListas)
        btnAbrirListas.setOnClickListener{
            val intento1 = Intent(this, Listas::class.java)
            startActivity(intento1)
        }

        val btnBotones = findViewById<Button>(R.id.btnBotones)
        btnBotones.setOnClickListener {
            val intento1 = Intent(this, RadioYCheckBotones::class.java)
            startActivity(intento1)
        }

        val btnSpinner = findViewById<Button>(R.id.btnSpinner)
        btnSpinner.setOnClickListener {
            val intento1 = Intent(this, EjemplosSpinner::class.java)
            startActivity(intento1)
        }


        //Código navegacion web
        val url = findViewById<EditText>(R.id.txtURL)
        val btnIr = findViewById<Button>(R.id.btnNavegar)
        btnIr.setOnClickListener {
            val intento1 = Intent(this, Navegador::class.java)
            intento1.putExtra("direccion", url.text.toString())
            startActivity(intento1)
        }
    }
}