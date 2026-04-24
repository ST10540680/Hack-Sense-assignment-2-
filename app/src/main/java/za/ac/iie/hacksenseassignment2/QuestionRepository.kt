package za.ac.iie.hacksenseassignment2

//noinspection SuspiciousImport
import android.R

class QuestionRepository {
    companion object {
        fun getQuestion(): R.array<Question>{
            return arrayOf(
                Question("Putting phone in rice fixes water damage",false,"Rice doesn't fully remove moisture"),
                Question("Keyboard shortcuts improve productivity", true, "They save time."),
                Question("Charging overnight damages battery", false, "Modern phones stop charging."),
                Question("Turning off notifications improves focus", true, "Less distraction.")
            )
        }
    }

}
