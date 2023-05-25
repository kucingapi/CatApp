package com.example.catapp.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.catapp.navigation.Destinations.DetailPage
import com.example.catapp.ui.components.AppBar
import com.example.catapp.ui.pages.AboutPage
import com.example.catapp.ui.pages.DetailPage
import com.example.catapp.ui.pages.ListPage

@Composable
fun MyAppNavHost(
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Destinations.ListPage
    ) {
        composable(Destinations.ListPage) {
            ListPage(navController)
        }
        composable("detail/{catId}") {
            DetailPage(navController, it.arguments?.getString("catId") ?: "1")
        }
        composable(Destinations.AboutPage) {
            AboutPage(navController)
        }
    }
}
