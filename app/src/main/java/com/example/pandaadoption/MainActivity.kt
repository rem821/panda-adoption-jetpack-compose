package com.example.pandaadoption

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.pandaadoption.composable.PandaAdoptionApp
import com.example.pandaadoption.viewModel.PandaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val pandaViewModel: PandaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PandaAdoptionApp(pandaViewModel)
        }
    }
}