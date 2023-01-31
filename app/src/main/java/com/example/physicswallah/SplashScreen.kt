package com.example.physicswallah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        val backgroundImage: ImageView =findViewById(R.id.splashScreenImage)
        val slideAnimation= AnimationUtils.loadAnimation(this,R.anim.splash_screen)
        backgroundImage.startAnimation(slideAnimation)

        Handler().postDelayed({
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}