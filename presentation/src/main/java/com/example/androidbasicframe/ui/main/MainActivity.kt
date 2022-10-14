package com.example.androidbasicframe.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import com.example.androidbasicframe.R
import com.example.androidbasicframe.databinding.ActivityMainBinding
import com.example.androidbasicframe.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val mainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}