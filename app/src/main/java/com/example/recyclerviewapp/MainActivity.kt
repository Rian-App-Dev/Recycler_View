package com.example.recyclerviewapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    val datalist = listOf(Details("Rian", "rfrian111@gmail.com"),
        Details("Rian", "rfrian111@gmail.com"),
        Details("Rian", "rfrian111@gmail.com"),
        Details("Rian", "rfrian111@gmail.com"),
        Details("Rian", "rfrian111@gmail.com"),
        Details("Rian", "rfrian111@gmail.com"),
        Details("Rian", "rfrian111@gmail.com"),
        Details("Rian", "rfrian111@gmail.com"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.recyclerView.adapter = Adapter(datalist)

    }
}