package com.example.pdm_labo04_julioflores_00018824

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.pdm_labo04_julioflores_00018824.navigation.AppNavigation
import com.example.pdm_labo04_julioflores_00018824.ui.theme.PDM_Labo04_JulioFlores_00018824Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PDM_Labo04_JulioFlores_00018824Theme {
                AppNavigation()
            }
        }
    }
}