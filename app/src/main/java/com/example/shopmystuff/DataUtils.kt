package com.example.shopmystuff

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Created by sergio on 03/02/2024
 * All rights reserved GoodBarber
 */
val popularCategoriesCollectionsData = listOf(
    R.drawable.fruits to R.string.fruit,
    R.drawable.vegetables to R.string.vegetables,
    R.drawable.producers to R.string.producers,
).map { DrawableStringPair(it.first, it.second) }

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

data class Product(
    @DrawableRes val image: Int,
    @StringRes val name: Int,
    val price: Float,
    @StringRes val description: Int,
    val stock: Int = 0
)

val highLightedProduct = Product(
    image = R.drawable.charcuterie,
    name = R.string.charcuterie,
    price = 45f,
    description = R.string.charcuterie_deal_description,
    stock = 70
)

val topSales = listOf(
    Product(
        image = R.drawable.honey,
        name = R.string.honey,
        price = 7.50f,
        description = R.string.honey_description,
        stock = 12
    ),
    Product(
        image = R.drawable.clementine,
        name = R.string.clementine,
        price = 3.54f,
        description = R.string.clementine_description,
        stock = 0
    ),
    Product(
        image = R.drawable.strawberry,
        name = R.string.strawberry,
        price = 2.99f,
        description = R.string.strawberry_description,
        stock = 12
    ),
    Product(
        image = R.drawable.bell_pepper,
        name = R.string.bell_pepper,
        price = 2.85f,
        description = R.string.bell_pepper_description,
    ),
    Product(
        image = R.drawable.cabbage,
        name = R.string.cabbage,
        price = 0.79f,
        description = R.string.cabbage_description,
        stock = 12
    ),
    Product(
        image = R.drawable.purple_wine,
        name = R.string.purple_wine,
        price = 16.99f,
        description = R.string.purple_wine_description,
        stock = 12
    ),
    Product(
        image = R.drawable.nougat,
        name = R.string.nougat,
        price = 15.69f,
        description = R.string.nougat,
        stock = 12
    ),
    Product(
        image = R.drawable.lemon,
        name = R.string.lemon,
        price = 0.99f,
        description = R.string.lemon_description,
        stock = 12
    ),
    Product(
        image = R.drawable.potatoes,
        name = R.string.potato,
        price = 2.99f,
        description = R.string.potato_description,
    ),
    Product(
        image = R.drawable.red_wine,
        name = R.string.red_wine,
        price = 11.90f,
        description = R.string.red_wine_description,
    ),
)

