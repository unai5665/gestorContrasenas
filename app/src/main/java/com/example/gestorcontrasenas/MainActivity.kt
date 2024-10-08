package com.example.gestorcontrasenas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
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
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Text(
                text = "Gestor de Contraseñas",
                fontSize = 33.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 116.sp,
                modifier = Modifier
                    .padding(start = 28.dp, end = 10.dp)
            )
            Text(
                text = "Instagram",
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(start = 28.dp, end = 5.dp, top = 30.dp)
            )
            Divider(
                color = Color.Gray,
                thickness = 2.dp,
                modifier = Modifier
                    .padding(horizontal = 28.dp, vertical = 3.dp)
                    .fillMaxWidth()
            )


            Row {
                Text(
                    text = "Usuario:",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 116.sp,
                    modifier = Modifier
                        .padding(start = 28.dp, end = 10.dp)
                )
                Text(
                    text = "Amaro",
                    fontSize = 24.sp,
                    lineHeight = 116.sp,
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                )
            }
            Row {
                Text(
                    text = "Contraseña:",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 28.dp, end = 10.dp)
                )
                Text(
                    text = "1234",
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            Button(
                onClick = { },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("<")
            }
            Button(
                onClick = { },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Agregar")
            }

            Button(
                onClick = { },
                modifier = Modifier.padding(8.dp)
            ) {
                Text("Eliminar")
            }

            Button(
                onClick = { },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(">")
            }
        }
    }
}



