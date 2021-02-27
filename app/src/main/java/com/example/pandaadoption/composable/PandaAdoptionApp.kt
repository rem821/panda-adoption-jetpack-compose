package com.example.pandaadoption.composable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pandaadoption.Actions
import com.example.pandaadoption.Destinations.Detail
import com.example.pandaadoption.Destinations.Home
import com.example.pandaadoption.screens.DetailScreen
import com.example.pandaadoption.screens.HomeScreen
import com.example.pandaadoption.ui.PandaAdoptionTheme
import com.example.pandaadoption.viewModel.PandaViewModel

@Composable
fun PandaAdoptionApp(pandaViewModel: PandaViewModel) {
    val navController = rememberNavController()
    val actions = remember(navController) { Actions(navController) }
    PandaAdoptionTheme {
        NavHost(navController, startDestination = Home) {
            composable(Home) {
                HomeScreen(pandaViewModel, actions)
            }

            composable(Detail) {
                DetailScreen(pandaViewModel, navController)
            }
        }
    }
}