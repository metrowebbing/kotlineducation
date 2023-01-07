package com.metrowebbingdev.kotlineducation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.metrowebbingdev.kotlineducation.navigation.SetupNavHost
import com.metrowebbingdev.kotlineducation.ui.theme.KotlineducationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlineducationTheme {
                val navController = rememberNavController()
                SetupNavHost(navController = navController)
               
            }
        }
    }
}

