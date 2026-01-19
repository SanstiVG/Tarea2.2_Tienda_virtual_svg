package com.example.ejercicio22tiendavirtual

import kotlinx.serialization.Serializable

@Serializable
data class Producto(
    val nombre: Int,
    val precio: Int,
    val imagenRes: Int,
    val descripcion: Int
)