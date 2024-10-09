package com.example.gestordecontraseas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestordecontraseas.ui.theme.GestorDeContrasenasTheme


data class EntradaContraseña(val id: Int, val plataforma: String, val usuario: String, val contraseña: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GestorDeContrasenasTheme {
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
            Row {
                Text(
                    text = "1",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(start = 28.dp, end = 5.dp, top = 30.dp)
                )
                Column {
                    Text(
                        text = "Instagram",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 28.dp, end = 5.dp, top = 30.dp)
                    )
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(horizontal = 28.dp, vertical = 3.dp)
                            .fillMaxWidth(),
                        thickness = 2.dp,
                        color = Color.Gray
                    )
                }
            }


            Row (
                modifier=Modifier.padding( start = 20.dp)
            ){
                Image(
                    painter = painterResource(R.drawable.baseline_account_circle_24),
                    contentDescription = "Imagen de User",
                    modifier=Modifier
                        .size(55.dp)
                        .padding(start = 5.dp, top = 20.dp)
                )
                Text(
                    text = "Usuario:",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 80.sp,
                    modifier = Modifier
                        .padding(start = 3.dp, end = 10.dp)
                )
                Text(
                    text = "Amaro",
                    fontSize = 20.sp,
                    lineHeight = 80.sp,
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                )
            }
            Row (
                modifier=Modifier
                    .padding(start = 20.dp)
            ){
                Image(
                    painter = painterResource(R.drawable.baseline_password_24),
                    contentDescription = "Imagen de Contraseña",
                    modifier=Modifier
                        .size(40.dp)
                        .padding(start = 5.dp, top = 10.dp)
                )

                Text(
                    text = "Contraseña:",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 50.sp,
                    modifier = Modifier
                        .padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "1234",
                    fontSize = 20.sp,
                    lineHeight = 50.sp,
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

