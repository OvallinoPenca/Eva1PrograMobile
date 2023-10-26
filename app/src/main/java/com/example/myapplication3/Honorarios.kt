package com.example.myapplication3
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Honorarios(navController: NavController) {
            var base by remember { mutableStateOf( "" ) }
            var altura by remember { mutableStateOf( "" ) }
            var resultado by remember { mutableStateOf("") }
            Column {
                Text("Cálculo Honorarios")
                TextField(
                    value = base,

                    onValueChange = { base = it },
                    label = { Text("Base") },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                )
                Button(onClick = {
                    // si no puede convertir a número entero
                    // se devuelve null
                    // y finalmente si es null se devuelve 0
                    val baseNumero = base.toIntOrNull() ?: 0
                    val liquido = calcularDescuento(baseNumero)
                    resultado = "El Total con descuento(13%) es : " + liquido
                }) {
                    // Contenido del botón
                    Text("Calcular")
                }
                Text(resultado ) // acá irá el resultado
                Button(onClick = { navController.navigate(Routes.Principal.route) }) {
                    Text(text = "Ir a Pantalla Principal")
                }
            }
        }
fun calcularDescuento(base:Int): Double {
    return base * 0.87
}
