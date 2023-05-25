package com.example.catapp.ui.pages

import android.annotation.SuppressLint
import android.widget.LinearLayout
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.catapp.data.catList
import com.example.catapp.ui.components.AppBar
import com.example.catapp.ui.components.CatItem
import com.example.catapp.ui.theme.CatAppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPage(navController: NavController) {


    Scaffold(
        topBar = { AppBar(navController,false) }
    ) {
        LazyColumn(Modifier.padding(it)) {
            items(catList.size) { cat ->
                CatItem(navController,catList[cat], cat)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ListPagePreview() {
    CatAppTheme {
        ListPage(rememberNavController())
    }
}
