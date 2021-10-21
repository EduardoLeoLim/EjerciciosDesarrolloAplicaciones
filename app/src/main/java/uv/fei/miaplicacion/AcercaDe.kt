package uv.fei.miaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AcercaDe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)

        val btnSalirAcercaDe = findViewById<Button>(R.id.btnSalirAcercaDe)
        btnSalirAcercaDe.setOnClickListener {
            finish()
        }
    }
}