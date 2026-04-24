package za.ac.iie.hacksenseassignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    // Components of the User Interface(TextViews)
    private var questionTextView: TextView? = null
    private var feedbackTextView: TextView? = null

    // variables to track quiz progress
    private var currentIndex = 0  // keeps track of which question we are on
    private var score = 0         // stores number of correct answers

    // get list of question from repository (data layer)
    private val questions = QuestionRepository.getQuestion()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        // connecting variables to UI elements in XML
        questionTextView = findViewById(R.id.questionTextView)
        feedbackTextView = findViewById(R.id.feedbackTextView)

        val trueButton = findViewById<Button>(R.id.trueButtonID)
        val falseButton = findViewById<Button>(R.id.falseButtonID)
        val nextButton = findViewById<Button>(R.id.nextButtonID)

        // Display the first question
        showQuestion()

        // when user clicks "true"
        trueButton.setOnClickListener {
            checkAnswer(userAnswer = true)
        }

        // when user clicks "false"
        falseButton.setOnClickListener {
            checkAnswer(userAnswer = false)
        }

        // when user clicks "next"
        nextButton.setOnClickListener {
            // Move to next question
            currentIndex++

            // Check if there are more questions
            if (currentIndex < questions.size) {
                // Show next question
                showQuestion()
                // clear previous feedback
                feedbackTextView?.text = ""
            } else {
                // No more questions = go to score screen
                val intent = Intent(this, ScoreActivity::class.java)

                // send Score data to next activity
                intent.putExtra("SCORE", score)
                intent.putExtra("TOTAL", questions.size)

                startActivity(intent)

                // Close this activity so user can't go back
                finish()
            }
        }
    }

    private fun checkAnswer(userAnswer: Boolean) {
        val question = questions[currentIndex]

        // compare user answer with correct answer
        if (userAnswer == question.answer) {
            // If correct "increase score"
            score++
            // Show positive feedback + explanation using string resource
            feedbackTextView?.text = getString(R.string.correct_feedback, question.explanation)
        } else {
            // if wrong " show correct explanation using string resource
            feedbackTextView?.text = getString(R.string.wrong_feedback, question.explanation)
        }
    }

    // function to display current question
    private fun showQuestion() {
        val question = questions[currentIndex]
        // Set question text on screen
        questionTextView?.text = question.questionText
    }
}
