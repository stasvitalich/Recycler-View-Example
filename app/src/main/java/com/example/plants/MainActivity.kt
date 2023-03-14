package com.example.plants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.plants.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var adapter = FishAdapter()
    private val imageIdList = listOf(
        R.drawable.karas,
        R.drawable.okun,
        R.drawable.shuka,
        R.drawable.sudak,
        R.drawable.karp,
        R.drawable.lesh,
        R.drawable.lin,
        R.drawable.peskar,
        R.drawable.plotva,
        R.drawable.yorsh,
    )
    private var index = 0


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() = with(binding){
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {
                if (index>9) index = 0
                val fish = Fish(imageIdList[index], "Рыба $index"  )
                adapter.addFish(fish)
                index++
            }

    }
}