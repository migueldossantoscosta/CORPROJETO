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
        //Carrega a imagem
        painter = painterResource(id = R.drawable.color_wheel),
        //Descreve a imagem (IMPORTANTE)
        contentDescription = "Roda com Cores",
        //Define o tamanho e a posição da imagem
        modifier = Modifier
            .fillMaxWidth() //Ocupa a largura disponivel
            .height(300.dp), //Fixa a altura da imagem em 300dp
        contentScale = ContentScale.Fit
    )
}

