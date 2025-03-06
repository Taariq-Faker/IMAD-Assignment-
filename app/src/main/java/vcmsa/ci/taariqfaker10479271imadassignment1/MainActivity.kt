package vcmsa.ci.taariqfaker10479271imadassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val resetButton = findViewById<Button>(R.id.resetButton)

        val displaySugget = findViewById<TextView>(R.id.displaySugget)

        val timeDayEdit = findViewById<EditText>(R.id.timeEditText)

        resetButton?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Option Reset", Toast.LENGTH_LONG).show()

            var time: Int
            var meal: String
            var morning: String
            var MidMorning: String
            var Afternoon: String
            var AfternoonSnack: String
            var Dinner: String
            var AfterDinnerSnack: String


        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
