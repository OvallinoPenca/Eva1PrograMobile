package com.example.myapplication3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
@Composable
fun Principal(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Calculador de Sueldos de Empleados",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(modifier = Modifier
            .height(60.dp)
            .width(250.dp) , onClick = { navController.navigate(Routes.Honorarios.route) }) {
            Text("Honorarios")
        }


        Spacer(modifier = Modifier.height(10.dp))
        Button(modifier = Modifier
            .height(60.dp)
            .width(250.dp), onClick = { navController.navigate(Routes.Empleados.route)

        }) {
            Text("Empleados")
        }
    }

}
