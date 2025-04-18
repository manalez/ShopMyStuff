package com.example.shopmystuff.ui.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Created by sergio on 03/02/2024
 * All rights reserved GoodBarber
 */
@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    //TODO Create a OutlineTextFilled with the search icon as icon
}

@Composable
fun SearchIcon(modifier: Modifier = Modifier) {
    Icon(imageVector = Icons.Outlined.Search, contentDescription = null, modifier = modifier)
}

@Preview
@Composable
fun SearchBarPreview() {
    SearchBar()
}