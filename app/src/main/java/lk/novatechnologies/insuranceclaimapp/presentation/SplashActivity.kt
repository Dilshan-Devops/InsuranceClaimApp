package lk.novatechnologies.insuranceclaimapp.presentation

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import lk.novatechnologies.insuranceclaimapp.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val animationView = findViewById<LottieAnimationView>(R.id.lottie_animation_view)
        val welcomeText = findViewById<TextView>(R.id.welcome_text)

        // Load the fade-in animation
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        // Make the welcome text visible and start the animation
        welcomeText.visibility = View.VISIBLE
        welcomeText.startAnimation(fadeInAnimation)

        // Set a listener to handle cases where the animation fails to load
        animationView.setFailureListener {
            Log.e("SplashActivity", "Lottie animation failed to load.", it)
            // If animation fails, just navigate to the main activity after a delay
            navigateToMain()
        }

        // Navigate after a delay. This will run regardless of animation success.
        navigateToMain()
    }

    private fun navigateToMain() {
        Handler(Looper.getMainLooper()).postDelayed({
            if (!isFinishing) { // Ensure the activity is still running
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }, 3000) // 3-second delay
    }
}