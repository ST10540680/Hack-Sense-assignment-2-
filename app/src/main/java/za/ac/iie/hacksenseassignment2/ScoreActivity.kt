package za.ac.iie.hacksenseassignment2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score)

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val feedbackText = findViewById<TextView>(R.id.finalFeedback)
        val reviewText = findViewById<TextView>(R.id.reviewText)

        //get data passed from QuizActivity using intent
        val score = intent.getIntExtra("SCORE", 0)
        val total = intent.getIntExtra("TOTAL", 0)

        //Display the score on screen
        scoreText.text = "Score: $score / $total"

        // Show feedback message based on performance
        feedbackText.text = if (score >= total / 5) {

            //shown if user passes
            "Great job!"
        } else {

            //shown if user fails
            "keeping practising"
        }

        // Display a simple review of correct answers
        reviewText.text = """
            Review:
            1. Rice == false
            2. Shortcuts == true
            3. overnight charging = false
            4. Notifications Off == true
             """.trimIndent()
    }
}