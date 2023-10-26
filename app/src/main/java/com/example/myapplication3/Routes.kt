package com.example.myapplication3

sealed class Routes(val route: String){

    object Principal :Routes("pantalla1")
    object Empleados :Routes("pantalla2")
    object Honorarios :Routes("pantalla2")

}
