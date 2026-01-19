package com.example.ejercicio22tiendavirtual.navegacion

import androidx.navigation3.runtime.NavKey
import com.example.ejercicio22tiendavirtual.Producto
import kotlinx.serialization.Serializable

sealed class Routes: NavKey {
    @Serializable
    data object Home: Routes()
    @Serializable
    data class Detalle(val producto: Producto): Routes()
    @Serializable
    data object Compra: Routes()

    @Serializable
    data object Error: Routes()
}