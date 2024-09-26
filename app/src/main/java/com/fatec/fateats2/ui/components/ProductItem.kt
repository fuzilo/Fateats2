package com.fatec.fateats2.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.fatec.fateats2.extensions.toBrazilianCurrency
import com.fatec.fateats2.model.Product
import com.fatec.fateats2.ui.theme.Fateats2Theme

@Composable
fun ProductItem(
    product: Product,
    modifier: Modifier = Modifier,
    elevation: Dp =10.dp){
    //Card
    //Column
    //Product
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
        elevation = CardDefaults.cardElevation(elevation)
    ){
        Column{
            Text(text = product.name)

            Column (
                modifier= Modifier
                    .fillMaxWidth()
                    .background(color = Color.Red)
                    .padding(18.dp)
            ){
                Text(text = product.name, color = Color.White)
                Text(text = product.price.toBrazilianCurrency(), color = Color.White )

            }
        }

    }


}


//preview
@Composable
@Preview
fun ProductItemPreview(
){
    Fateats2Theme {
        Surface {

        }
    }


}