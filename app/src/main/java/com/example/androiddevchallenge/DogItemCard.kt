package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DogItemCard(dog: Dog, index: Int, onClick: (Int) -> Unit) {
    val cornerNormal = CornerSize(0.dp)
    val cornerRound = if (dog.isAdopt) CornerSize(24.dp) else cornerNormal
    val shape = RoundedCornerShape(
        topEnd = cornerRound,
        topStart = cornerNormal,
        bottomEnd = cornerNormal,
        bottomStart = cornerNormal
    )
    Surface(
        shape = shape,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable(onClick = { onClick(index) })
        ) {
            Image(
                painter = painterResource(id = dog.imageRes),
                contentScale = ContentScale.FillBounds,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp, 100.dp)
            )
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
                Text(dog.name, maxLines = 1, fontSize = 16.sp)
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(8.dp)
                )
                Text(
                    dog.desc,
                    maxLines = 1,
                    fontSize = 14.sp,
                    color = Color.Gray,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}