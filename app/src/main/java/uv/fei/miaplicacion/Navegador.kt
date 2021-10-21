package uv.fei.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class Navegador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navegador)

        val btnSalir = findViewById<Button>(R.id.btnSalirNavegador)
        btnSalir.setOnClickListener {
            finish()
        }

        val bundle = intent.extras
        val url = bundle?.getString("direccion")

        val webView = findViewById<WebView>(R.id.WebView)

        webView.loadUrl("https://${url}")
    }
}