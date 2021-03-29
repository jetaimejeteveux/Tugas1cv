package com.belajar.tugas1cv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.belajar.tugas1cv.databinding.ActivityMainBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var urlFirman: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        urlFirman = "https://i.imgur.com/YQqb10M.jpg"
        Glide.with(this)
            .load(urlFirman)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.ivPhoto)

    }
}