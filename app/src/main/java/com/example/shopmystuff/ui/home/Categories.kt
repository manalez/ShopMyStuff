package com.example.shopmystuff.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shopmystuff.ui.theme.ShopMyStuffTheme

/**
 * Created by sergio on 03/02/2024
 * All rights reserved GoodBarber
 */
@Composable
fun CategoryCell(
    modifier: Modifier = Modifier) {
    //TODO create the cell here
}

@Composable
fun PopularCategories(modifier: Modifier = Modifier) {
    //TODO Assemble the three categories here
}


@Preview()
@Composable
fun CategoryCellPreview() {
    ShopMyStuffTheme {
        CategoryCell()
    }
}

@Preview(widthDp = 360)
@Composable
fun PopularCategoriesPreview() {
    ShopMyStuffTheme {
        PopularCategories()
    }
}