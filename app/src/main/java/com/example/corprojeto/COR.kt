package com.example.corprojeto

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*

@Composable
fun COR (){
    Image(
        painter = painterResource(id = R.drawable.color_wheel),
        contentDescription = "Roda com Cores",
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        contentScale = ContentScale.Fit
    )
}

