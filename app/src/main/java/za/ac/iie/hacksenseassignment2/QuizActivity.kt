package za.ac.iie.hacksenseassignment2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class QuizActivity: AppCompatActivity() {

    // Components of the User Interface
    var questionTextView = TextView
    var feedbackTextView = TextView

    

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        // variables
    }
}