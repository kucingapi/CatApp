package com.example.catapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.catapp.navigation.Destinations

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(navController: NavController, navIcon: Boolean = true) {
    TopAppBar(
        title = { Text(text = "Cat App") },
        navigationIcon = {
            if (navIcon) {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "back")
                }
            }
        },
        actions = {
            IconButton(onClick = { navController.navigate(Destinations.AboutPage) }) {
                Icon(Icons.Default.Info, contentDescription = "about_page")
            }
        }
    )
}
