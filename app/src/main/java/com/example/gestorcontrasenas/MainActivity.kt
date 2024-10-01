package com.example.gestorcontrasenas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestorcontrasenas.ui.theme.GestorContrasenasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GestorContrasenasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ){
                    GreetingText()
                }
            }
        }
    }
}

@Composable
fun GreetingText(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = "Usuario: ",
            fontSize = 28.sp,
            lineHeight = 116.sp,
            modifier = Modifier
                .padding(start = 28.dp)
                .padding(end = 10.dp)
                .align(alignment = Alignment.Start)
        )
        Text(
            text = "Contraseña: ",
            fontSize = 28.sp,
            modifier = Modifier
                .padding(start = 28.dp)
                .padding(end = 10.dp)
                .align(alignment = Alignment.Start)

        )
    }
}

