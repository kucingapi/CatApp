package com.example.catapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.catapp.data.Cat
import com.example.catapp.navigation.Destinations

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatItem(navController: NavController,cat: Cat, id: Int) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onClick = {
            navController.navigate("detail/$id")
        }
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
                .fillMaxWidth()
            ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(cat.pictureResId),
                contentDescription = cat.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
                    .align(Alignment.CenterHorizontally)
            )
            Text(text = cat.name, style = MaterialTheme.typography.headlineMedium)
        }
    }
}
