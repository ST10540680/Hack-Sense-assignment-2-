package za.ac.iie.hacksenseassignment2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class QuizActivity: AppCompatActivity() {

    // Components of the User Interface(TextViews)
    var questionTextView: TextView? = TextView
    var feedbackTextView: TextView? = TextView

    // variables to track quiz progress
    var currentIndex = 0  //keeps track of which question we are on
    var score = 0         //stores number of correct answers

    //get list of question from repository (data layer)
    val questions = QuestionRepository.getQuestion()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        // connecting variables to UI elements in XML
        questionTextView = findViewById<TextView>(R.id.questionTextView)
        feedbackTextView = findViewById<TextView>(R.id.feedbackTextView)

        val trueButton = findViewById<Button>(R.id.trueButtonID)
        val falseButton = findViewById<Button>(R.id.falseButtonID)
        val nextButton = findViewById<Button>(R.id.nextButtonID)

        // Display the first question
        showQuestion()

        // when user clicks "true"
        trueButton.setOnClickListener {
            checkAnswer(true)
        }

        // when user clicks "false"
        falseButton.setOnClickListener {
            checkAnswer(false)
        }

        // when user clicks "next"
        nextButton.setOnClickListener {

            // Move to next question (this part of the loop)
            currentIndex++

            // Check if there are more questions
            if (currentIndex < question.size >) {

                // Show next question
                showQuestion()

                // clear previous feedback
                
            }
        }
    }

    fun checkAnswer() {

    }

    fun showQuestion() {

    }
}