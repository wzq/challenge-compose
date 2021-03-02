package com.example.androiddevchallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.bgGray


const val SCREEN_HOME = "Home"

@Composable
fun DogList() {
    LazyColumn(
        Modifier.background(bgGray),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        content = {
            items(dogs) { item ->
                DogItemCard(dog = item) {
                }
            }
        }
    )
}