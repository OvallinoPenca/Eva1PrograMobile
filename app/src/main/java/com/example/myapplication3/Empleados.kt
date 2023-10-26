package com.example.myapplication3
import androidx.compose.foundation.layout.Column
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

import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.myapplication3.Routes
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Empleados(navController: NavController) {

    var base by remember { mutableStateOf( "" ) }
    var altura by remember { mutableStateOf( "" ) }
    var resultado by remember { mutableStateOf("") }
    Column {
        Text("Cálculo Descuento Empleados")
        TextField(
            value = base,

            onValueChange = { base = it },
            label = { Text("Base") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )
        Button(onClick = {
            val baseNumero = base.toIntOrNull() ?: 0
            val liquido = calcularDescuentos(baseNumero)
            resultado = "El Total con descuento(20%) es : " + liquido
        }) {

            Text("Calcular")
        }
        Text(resultado ) // acá irá el resultado

        Button(onClick = { navController.navigate(Routes.Principal.route) }) {
            Text(text = "Ir a Pantalla Principal")
        }
    }
}
fun calcularDescuentos(base:Int): Double {
    return base * 0.8
}