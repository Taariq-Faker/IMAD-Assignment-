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

        //Declaring variables
        val resetButton = findViewById<Button>(R.id.resetButton)

        val displaySuggest = findViewById<TextView>(R.id.displaySugget)

        val timeDayEdit = findViewById<EditText>(R.id.timeEditText)
        val showOptions=findViewById<Button>(R.id.showOptions)


        //Coding the reset button so that it when clicked it does as intended
        //Using the setOncClick method to run the code once the button is clicked
        resetButton?.setOnClickListener {

            //Prompting the program to display the a message to the user once the reset button is clicked
            Toast.makeText(this@MainActivity, "Option Reset", Toast.LENGTH_LONG).show()

            //Resetting the time of day textbox once the reset button is clicked
           timeDayEdit.setText("")
            //Reseting the display box to its original display once the reset button is clicked
            displaySuggest.setText("Please enter one of the following:\n" + "Morning\n" + " Mid morning Snack\n" + "Lunch\n" + "Afternoon Snack\n" + "Main Course\n" + "After Dinner Snack")
        }

            //Coding the Show Options button so it does what is intended once clicked
        //Using the setOnClick method to run the code once the button is clicked
        showOptions?.setOnClickListener {

            //Generates a message and shows it to the user once they click the button
            Toast.makeText(this@MainActivity, "Options generated", Toast.LENGTH_LONG).show()

            //Using if statement to determine what the program should display based on the data inputted by the user

            //Converting the inputted answer of the user to string  by using the .toSting() method  so that it can be displayed in the suggest text box
            //Using the .equals method and ignore case so that the answer of the user does not have to be case dependant in order to display the answer
            if (timeDayEdit.text.toString().equals("Morning",ignoreCase = true))
            {
                //Displays the required output based on the user input by using the setText method in order to display it in the text field
                displaySuggest.setText("Meal reccomendations: \n"+ "The recommended meal is Eggs")
            }

            //Using else statements in order to display different result based on what the user entered
            else if (timeDayEdit.text.toString().equals("Mid morning Snack", ignoreCase = true))
            {
                displaySuggest.setText("Meal reccomendations: \n"+ "The recommended meal is a light snack, such as a fruit")
            }
            else if (timeDayEdit.text.toString().equals("lunch",ignoreCase = true))
            {
                displaySuggest.setText("Meal reccomendations: \n"+ "The recommended meal is a burger")

            }
            else if (timeDayEdit.text.toString().equals("Afternoon Snack",ignoreCase = true))
            {
                displaySuggest.setText("Meal reccomendations: \n"+ "The recommended meal is a quick bite such as a cake ")
            }
            else if (timeDayEdit.text.toString().equals("Main Course",ignoreCase = true))
            {
                displaySuggest.setText("Meal reccomendations: \n"+ "The recommended meal is a Pasta")
            }
            else if (timeDayEdit.text.toString().equals("After dinner Snack",ignoreCase = true))
            {
                displaySuggest.setText("Meal reccomendations: \n"+ "The recommended meal is a dessert ")
            }
            else {
                // Check if the input enter by user is valid if not it display a message to show them the options they are allowed to enter as well as display a message once the button is clicked
                Toast.makeText(this@MainActivity, "Invalid input! Please enter a valid meal time.", Toast.LENGTH_LONG).show()
                displaySuggest.setText("Invalid input. Please enter one of the following:\n" + "Morning\n" + " Mid morning Snack\n" + "Lunch\n" + "Afternoon Snack\n" + "Main Course\n" + "After Dinner Snack"
                )
            }

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
