package com.example.ejercicio22tiendavirtual.navegacion

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.ejercicio22tiendavirtual.pantallas.PantallaDetalle
import com.example.ejercicio22tiendavirtual.pantallas.PantallaHome

@Composable
fun GestionNavegacion() {
    val pilaNavegacion = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = pilaNavegacion,
        onBack = {pilaNavegacion.removeLastOrNull()},
        entryProvider = { key ->
            when (key) {
                is Routes.Home -> NavEntry(key) {
                    PantallaHome(
                        navegaADetalle = { producto -> pilaNavegacion.add(Routes.Detalle(producto))
                        }
                    )
                }
                is Routes.Detalle -> NavEntry(key){
                    PantallaDetalle(
                        key.producto,
                        navegaAtras = {
                            pilaNavegacion.removeLastOrNull()
                        }

                    )
                }
                else -> NavEntry(Routes.Error){
                    Text("Error")
                }
            }
        }
    )
}