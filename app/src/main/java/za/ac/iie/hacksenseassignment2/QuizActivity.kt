package za.ac.iie.hacksenseassignment2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class QuizActivity: AppCompatActivity() {

    // Components of the User Interface(TextViews)
    var questionTextView = TextView
    var feedbackTextView = TextView

    // variables to track quiz progress
    var currentIndex = 0  //keeps track of which question we are on
    var score = 0         //stores number of correct answers

    //get list of question from repository (data layer)



    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        // variables
    }
}