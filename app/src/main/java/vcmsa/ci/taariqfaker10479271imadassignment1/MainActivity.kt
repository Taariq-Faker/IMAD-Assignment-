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

        val displaySuggest = findViewById<TextView>(R.id.displaySugget)

        val timeDayEdit = findViewById<EditText>(R.id.timeEditText)
        val showOptions=findViewById<Button>(R.id.showOptions)

        resetButton?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Option Reset", Toast.LENGTH_LONG).show()

           timeDayEdit.setText("")
            displaySuggest.setText("Meal reccomendations:")
        }

        showOptions?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Options generated", Toast.LENGTH_LONG).show()


            if (timeDayEdit.text.toString().equals("Morning",ignoreCase = true))
            {
                displaySuggest.setText("The recommended meal is Eggs")
            }
            else if (timeDayEdit.text.toString().equals("Mid-morning Snack", ignoreCase = true))
            {
                displaySuggest.setText("The recommended meal is a light snack,such as a fruit")
            }
            else if (timeDayEdit.text.toString().equals("lunch",ignoreCase = true))
            {
                displaySuggest.setText("The recommended meal is burger")

            }
            else if (timeDayEdit.text.toString().equals("Afternoon Snack",ignoreCase = true))
            {
                displaySuggest.setText("The recommended meal is a quick bite such as a cake or other sweet treats")
            }
            else if (timeDayEdit.text.toString().equals("Main Course",ignoreCase = true))
            {
                displaySuggest.setText("The recommended meal is is Pasta")
            }
            else if (timeDayEdit.text.toString().equals("After Dinner Snack ",ignoreCase = true))
            {
                displaySuggest.setText("The recommended meal is a dessert such as ice cream")
            }


        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
