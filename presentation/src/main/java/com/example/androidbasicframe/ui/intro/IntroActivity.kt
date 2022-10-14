package com.example.androidbasicframe.ui.intro

import android.os.Bundle
import androidx.activity.viewModels
import com.example.androidbasicframe.R
import com.example.androidbasicframe.databinding.ActivityIntroBinding
import com.example.androidbasicframe.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IntroActivity : BaseActivity<ActivityIntroBinding>(R.layout.activity_intro) {

    private val introViewModel by viewModels<IntroViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}