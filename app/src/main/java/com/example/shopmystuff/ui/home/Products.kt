package com.example.shopmystuff.ui.home

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shopmystuff.highLightedProduct

/**
 * Created by sergio on 03/02/2024
 * All rights reserved GoodBarber
 */

@Composable
fun AddToCartButton(modifier: Modifier = Modifier) {
    //TODO Create the  "+" button
}

@Composable
fun ProductHighlightCell(@DrawableRes image: Int,
                         @StringRes name: Int,
                         price: Float,
                         @StringRes description: Int,
                         modifier: Modifier = Modifier,) {
    //TODO Highlight cell composable
}




@Composable
fun ProductCell(modifier: Modifier = Modifier) {
    //TODO Create the product cell
}

@Composable
fun BestSales(modifier: Modifier = Modifier) {
    //TODO Assemble the list using the @object DataUtils.topSales
}

@Preview(widthDp = 350)
@Composable
fun ProductHighlightPreview() {
    ProductHighlightCell(
        highLightedProduct.image,
        highLightedProduct.name,
        highLightedProduct.price,
        highLightedProduct.description
    )
}


@Preview
@Composable
fun ProductPreview() {
    ProductCell()
}

@Preview(widthDp = 350)
@Composable
fun BestSalesPreview() {
    BestSales()
}