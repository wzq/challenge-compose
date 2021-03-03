package com.example.androiddevchallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.bgGray

@Composable
fun DogList(onItemClick: (Int) -> Unit) {
    LazyColumn(
        Modifier.background(bgGray),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        content = {
            itemsIndexed(dogs) { index, item ->
                DogItemCard(dog = item, index, onClick = onItemClick)
            }
        }
    )
}