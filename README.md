# Hack-Sense-assignment-2-

# Student information
**Name:** Helder Antonio Madia Filipe 

**Student Number:** ST10540680

**Assignment:** assignment 2


## 🧠 Overview
Hack Sense is a simple Android quiz app that tests users on whether common life tips are real **life hacks(true)** or **urban myths(false)**. The app presents a series of questions, provides instant feedback, and displays a final score with a review section.

---

## 🎯 Features
Welcome screen with start button
- Multiple-choice quiz (true or false)
- Instant feedback after each answer
- Score tracking system
- Final results screen with performance feedback
- Review section showing correct answers
- Smooth navigation between screens

🏗️ App Structure

### 📂 Packages
- `ui` → Activities (screens)
- `model` → Data class (Question)
- `data` → Question repository

---

## 🧩 Technologies Used
- Kotlin
- Android Studio
- XML layouts
- Android SDK

## 🔄 App Flow
1. **MainActivity**
    - Displays welcome screen
    - Navigates to quiz

2. **QuizActivity**
    - Displays questions
    - Handles user input
    - Updates score
    - Loops through all questions

3. **ScoreActivity**
    - Displays final score
    - Shows feedback
    - Displays review section


# AI DISCLOSURE
AI tools were used only for guidance and concept clarification. All coding decisions, implementation, and testing were completed independently.
The following AI tools were used:
- ChatGPT (OpenAI)
- Gemini (Google)

These tools were used to:
- Explain Android development concepts (Activities, Intents, Kotlin syntax)
- Assist with project structure (UI, data, and model layers)
- Generate example code snippets and XML layouts
- Provide guidance on debugging and GitHub setup

All generated content was carefully reviewed, tested, and modified by the author. I ensured that I fully understood the code and made necessary adjustments to meet the assignment requirements.

## References

Google. 2026. Gemini. [Generative artificial intelligence tool]. Available at: https://gemini.google.com/ [Accessed: 24 April 2026].

OpenAI. 2026. ChatGPT (GPT-5.3). [Large language model]. Available at: https://chat.openai.com/ [Accessed: 22 April 2026].

The Independent Institute of Education (IIE). 2026. Introduction to Mobile Application Development (IMAD). [Module guide]. Emeris. Available via: IIE student portal (Learn)https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BCA5A47EE-F107-44AD-AB60-6E296E0B3EAE%7D&file=IMAD5112MM.docx&action=default&mobileredirect=true [Accessed: 23 April 2026].


---

## 🔁 Loop Usage
A loop is implemented using a question index:

```kotlin
currentIndex++
if (currentIndex < questions.size) {
    showQuestion()
}


