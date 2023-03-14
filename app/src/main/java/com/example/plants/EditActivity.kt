package com.example.plants

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.plants.databinding.ActivityEditBinding
import android.os.Bundle

class EditActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditBinding
    private var indexImage = 0
    private var imageId = R.drawable.karas

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttons()
    }

    private fun buttons() = binding.apply {
        bNext.setOnClickListener {
            indexImage++
            if (indexImage > imageIdList.size - 1){
                indexImage = 0
            }
            imageId = imageIdList[indexImage]
            imageView2.setImageResource(imageId)
        }

        bDone.setOnClickListener {
            val fish = Fish(imageId, editTitle.text.toString(), editDescription.text.toString())
            val editIntent = Intent().apply {
                putExtra("fish", fish)
            }
            setResult(RESULT_OK, editIntent)
            finish()
        }
    }
}