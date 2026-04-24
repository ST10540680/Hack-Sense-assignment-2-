package za.ac.iie.hacksenseassignment2

class QuestionRepository {
    companion object {
        fun getQuestion(): Array<Question> {
            return arrayOf(
                Question(
                    questionText = "Putting phone in rice fixes water damage",
                    answer = false,
                    explanation = "Rice doesn't fully remove moisture"
                ),
                Question(
                    questionText = "Keyboard shortcuts improve productivity",
                    answer = true,
                    explanation = "They save time."
                ),
                Question(
                    questionText = "Charging overnight damages battery",
                    answer = false,
                    explanation = "Modern phones stop charging."
                ),
                Question(
                    questionText = "Turning off notifications improves focus",
                    answer = true,
                    explanation = "Less distraction."
                ),
            )
        }
    }
}
