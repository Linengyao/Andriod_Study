package com.example.uidesign

import android.os.Bundle
import android.transition.TransitionManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintLayout
import android.view.View
import android.widget.Button

class CartoonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cartoonlayout)

        val btn :Button = findViewById(R.id.button2)
        btn.setOnClickListener {
            val constraintLayout:ConstraintLayout = findViewById(R.id.constrainLayout)

            val constraintSet = ConstraintSet();
            constraintSet.load(this,R.layout.cartoonlayout2)
            TransitionManager.beginDelayedTransition(constraintLayout)
            constraintSet.applyTo(constraintLayout)


        }


    }





}