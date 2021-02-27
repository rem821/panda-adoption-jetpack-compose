package com.example.pandaadoption

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.pandaadoption.Destinations.Detail

object Destinations {
    const val Home = "home"
    const val Detail = "detail"
}

class Actions(navController: NavHostController) {
    val openDetail: () -> Unit = {
        navController.navigate(Detail)
    }
}