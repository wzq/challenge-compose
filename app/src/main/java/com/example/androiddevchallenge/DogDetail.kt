/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.purple500

@Composable
fun DogDetail(dog: Dog, onBackPressed: () -> Unit) {
    Surface {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            LazyColumn(
                modifier = Modifier.weight(1f)
            ) {
                item {
                    Box {
                        Image(
                            painter = painterResource(id = dog.imageRes),
                            contentScale = ContentScale.Crop,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(4 / 3f)
                        )
                        TopAppBar(
                            backgroundColor = Color.Transparent,
                            elevation = 0.dp,
                            contentColor = purple500
                        ) {
                            IconButton(onClick = onBackPressed) {
                                Icon(
                                    imageVector = Icons.Rounded.ArrowBack,
                                    contentDescription = null
                                )
                            }
                        }
                    }
                }
                item {
                    Text(text = dog.name, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
                }
                item {
                    Text(
                        text = dog.desc,
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                    )
                }
            }
            val onAdoptChanged = remember(calculation = { dog.isAdopt })
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(purple500)
                    .fillMaxWidth()
                    .clickable {
                        onAdoptChanged.value = !onAdoptChanged.value
                    }
            ) {
                Text(
                    text = if (onAdoptChanged.value) "Let me think again" else "Yes,I want to adopt it",
                    color = Color.White,
                    modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                )
            }
        }
    }
}
