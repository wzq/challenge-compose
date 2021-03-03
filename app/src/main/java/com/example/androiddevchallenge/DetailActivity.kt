package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val data = intent.getIntExtra("index", 0).let {
            dogs[it]
        }
        setContent {
            MyTheme {
                DogDetail(dog = data){
                    onBackPressed()
                }
            }
        }
    }
}