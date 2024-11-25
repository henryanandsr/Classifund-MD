package com.example.classifund

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.classifund.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Untuk membuat aplikasi menjadi full-screen (jika diinginkan)
        window.setFlags(
            android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,
            android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Menyembunyikan status bar dan navigasi jika diperlukan
        ViewCompat.getWindowInsetsController(window.decorView)?.hide(WindowInsetsCompat.Type.statusBars() or WindowInsetsCompat.Type.navigationBars())
    }
}
