package com.project.collage_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.collage_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            modesActivity()
        }
    }

    private fun modesActivity() {
        val intent  = Intent(this, ModesActivity::class.java)
        startActivity(intent)
    }

}