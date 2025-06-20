package com.example.corprojeto

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.*
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun COR (){

    var CorEscolhida by remember { mutableStateOf(Color.White) }
    var TamanhoImagem by remember { mutableStateOf(IntSize.Zero) }
    val contexto = LocalContext.current
    val Imagem = ImageBitmap.imageResource(contexto.resources,R.drawable.color_wheel)
    val bitmap = Imagem.asAndroidBitmap()
    var CodigoCor by remember { mutableStateOf("#FFFFFF") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Image(
            //Carrega a imagem
            bitmap = Imagem,
            //Descreve a imagem (IMPORTANTE)
            contentDescription = "Roda com Cores",
            //Define o tamanho e a posição da imagem
            modifier = Modifier
                .fillMaxWidth() //Ocupa a largura disponivel
                .height(300.dp) //Fixa a altura da imagem em 300dp
                .onGloballyPositioned { coordinates -> TamanhoImagem = coordinates.size }
                .pointerInteropFilter { event ->
                    val xRatio = event.x / TamanhoImagem.width.toFloat()
                    val yRatio = event.y / TamanhoImagem.height.toFloat()

                    val xBitmap = (xRatio * bitmap.width).toInt()
                    val yBitmap = (yRatio * bitmap.height).toInt()

                    if (xBitmap in 0 until bitmap.width && yBitmap in 0 until bitmap.height) {
                        val pixel = bitmap.getPixel(xBitmap, yBitmap)
                        val Novacor = Color(pixel)
                        CorEscolhida = Novacor
                        CodigoCor = String.format("#%06X", 0xFFFFFF and pixel)
                    }
                    true
                },

            contentScale = ContentScale.Fit
        )

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(CorEscolhida)
        )
    }
    }

