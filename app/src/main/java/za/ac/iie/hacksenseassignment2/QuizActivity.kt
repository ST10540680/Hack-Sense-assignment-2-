package za.ac.iie.hacksenseassignment2

import android.content.Intent
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
            if (currentIndex < questionds.size >) {

                // Show next question
                showQuestion()

                // clear previous feedback
                feedbackTextView.text = ""
            } else {

                // No more questions = go to score screen
                val intent = Intent(this, scoreActivity::class.java)

                //send Score data to next activity
                intent.putExtra("SCORE", score)
                intent.putExtra("TOTAL", questions.size)

                startActivity(intent)

                // Close this activity so user can't go back
                finish()
            }
        }
    }


    fun putExtra() {
        TODO("Not yet implemented")
    }

    fun checkAnswer(userAnswer: Boolean) {
        val question = questions [currentIndex]

        // compare user answer with correct answer
        if (userAnswer == question.isTrue) {

            // If correct "increase score"
            score++

            // Show positive feedback + explanation
            feedbackTextView.text = "Correct! ${question.explanation}"
        } else {

            // if wrong " show correct explanation
            feedbackTextView.text = "wrong! ${question.explanation}"
        }

    }

    // function to display current question
    fun showQuestion() {
        val question = questions [currentIndex]

        // Set question text on screen
        questionTextView.text = questions.text


    }
}