package com.fatec.fateats2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fatec.fateats2.model.Product
import com.fatec.fateats2.sampledata.sampleCandies
import com.fatec.fateats2.ui.components.CardProductItem
import com.fatec.fateats2.ui.components.ProductSection
import com.fatec.fateats2.ui.components.SearchTextField
import com.fatec.fateats2.ui.theme.Fateats2Theme
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }

    @Composable
    private fun App() {
        Fateats2Theme {
            Scaffold(modifier = Modifier.fillMaxSize(),
                    floatingActionButton = { FloatingActionButton(onClick = { onFabClick }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = null)
                    }}
                ) { innerPadding ->
                Greeting(
                    name = "Android",
                    modifier = Modifier.padding(innerPadding)
                )
                var text by remember { mutableStateOf("Default") }
                SearchTextField(searchText = text, onSearchChange = { newText ->
                    text = newText
                    Log.i("HomeScreen", "HomeScreen: TextField: $newText")
                    Log.i("HomeScreen", "HomeScreen: state: $text")
                })
                ProductSection(
                    title = "Promoções", products = sampleCandies

                )
                CardProductItem(
                    product = Product(
                        name = "Comidinha",
                        price = BigDecimal("2.00")
                    )
                )
            }

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    Fateats2Theme {
        HomeScreen(sampleCandies)
    }
}

@Composable
fun HomeScreen(sampleSections: Any) {

}
