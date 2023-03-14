package com.example.plants

import androidx.appcompat.app.AppCompatActivity
import com.example.plants.databinding.ActivityEditBinding
import android.os.Bundle

class EditActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}