package com.example.quizybuddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizybuddy.databinding.ActivityQuizBinding
import com.example.quizybuddy.databinding.ActivityQuizQuestionBinding

class QuizQuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizQuestionBinding
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}