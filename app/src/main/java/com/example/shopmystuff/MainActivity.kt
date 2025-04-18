package com.example.shopmystuff

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shopmystuff.ui.theme.ShopMyStuffTheme
import androidx.compose.ui.draw.clip


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShopMyStuffTheme {
                ShopMyStuffScreen()
            }
        }
    }
}

@Composable
fun ShopMyStuffScreen() {
    Scaffold(
        bottomBar = { BottomNavBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.White)
        ) {
            TopBar()
            Spacer(modifier = Modifier.height(16.dp))
            SearchBar()
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Our Categories",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(start = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))
            CategoryRow()
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Our best deal",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(start = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))
            BestDealCard()
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Best sales",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(start = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))
            BestSalesRow()
        }
    }
}

@Composable
fun TopBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color(0xFF8A69C4)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "ShopMyStuff",
            style = MaterialTheme.typography.headlineSmall,
            color = Color.White
        )
    }
}

@Composable
fun SearchBar() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        placeholder = { Text("Search") },
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(56.dp),
        shape = RoundedCornerShape(8.dp)
    )
}

@Composable
fun CategoryRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(76.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CategoryItem("Fruit", R.drawable.fruits)
        CategoryItem("Vegetable", R.drawable.vegetables)
        CategoryItem("Producer", R.drawable.producers)
    }
}

@Composable
fun CategoryItem(label: String, imageRes: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = label,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(label)
    }
}

@Composable
fun BestDealCard() {
    Card(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(modifier = Modifier.background(Color(0xFFD9DBFF))) {
            Image(
                painter = painterResource(id = R.drawable.purple_wine),
                contentDescription = null,
                modifier = Modifier
                    .width(144.dp)
                    .height(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
            ) {
                Text("Purple Wine", style = MaterialTheme.typography.headlineMedium)
                Text(
                    "Prosciutto di Parma,\nChorizo Iberico, French\nSaucisson Sec, Duck",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text("45.0 €", style = MaterialTheme.typography.headlineSmall)
            }
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier
                        .background(Color(0xFFAA88BB), CircleShape)
                        .size(24.dp),
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
fun BestSalesRow() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(listOf(
            "Honey" to R.drawable.honey,
            "Clementine" to R.drawable.clementine,
            "Strawberry" to R.drawable.strawberry
        )) { (label, imageRes) ->
            SalesItem(label, imageRes)
        }
    }
}

@Composable
fun SalesItem(label: String, imageRes: Int) {
    Card(
        modifier = Modifier
            .width(120.dp)
            .height(150.dp)
    ) {
        Column {
            Box(modifier = Modifier.height(100.dp)) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = label,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(4.dp)
                        .background(Color(0xFFAA88BB), CircleShape)
                        .size(24.dp)
                )
            }
            Text(
                text = label,
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
fun BottomNavBar() {
    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp),
        containerColor = Color(0xFFE8DDF4)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.ShoppingCart, contentDescription = null) },
            label = { Text("Cart") }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Default.Star, contentDescription = null) },
            label = { Text("Favorites") }
        )
    }
}
