package sauceda.carlos.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegiterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regiter)

        val button: Button = findViewById(R.id.button_sing_in) as Button
        var intent: Intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)

    }
}