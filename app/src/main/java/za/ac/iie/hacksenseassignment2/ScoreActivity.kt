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

        // get data passed from QuizActivity using intent
        val score = intent.getIntExtra("SCORE", 0)
        val total = intent.getIntExtra("TOTAL", 0)

        // Display the score on screen using string resource with placeholders
        scoreText.text = getString(R.string.score_format, score, total)

        // Show feedback message based on performance using string resources
        feedbackText.text = if (score >= total / 2) {
            getString(R.string.great_job)
        } else {
            getString(R.string.keep_practicing)
        }

        // Display review from string resource
        reviewText.text = getString(R.string.review_content)
    }
}
