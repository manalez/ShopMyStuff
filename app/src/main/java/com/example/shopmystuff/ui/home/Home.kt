package com.example.shopmystuff.ui.home

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Created by sergio on 03/02/2024
 * All rights reserved GoodBarber
 */
@Composable
fun HomeSection(
    modifier: Modifier = Modifier,
    @StringRes title: Int,
    content: @Composable () -> Unit
) {
    //TODO Create a home "section" using the Slot API
}


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    //TODO Setup here all the home content (Search, Categories, Best Deal, and best sellers). Use the HomeSection above to build this composable
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}