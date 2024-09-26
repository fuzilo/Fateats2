package com.fatec.fateats2.ui.components

import android.icu.text.StringSearch
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fatec.fateats2.ui.theme.Fateats2Theme

@Composable
fun SearchTextField(
        searchText: String,
        onSearchChange:(String) -> Unit,
        modifier: Modifier= Modifier

){
OutlinedTextField(
    value = searchText,
    onValueChange = {
    newValue -> onSearchChange(newValue)
},
    modifier = modifier,
    shape = RoundedCornerShape(50),
    leadingIcon = {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = null
        )
    },
    label = {


    }



)

}


@Preview
@Composable
fun SearchTextFieldPreview(


){
    Fateats2Theme {
        Surface {
            SearchTextField(searchText = "Conteudo", onSearchChange = {} )

        }
    }

}