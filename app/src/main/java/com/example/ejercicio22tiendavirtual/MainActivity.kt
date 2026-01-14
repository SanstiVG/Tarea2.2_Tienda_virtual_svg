package com.example.ejercicio22tiendavirtual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio22tiendavirtual.navegacion.GestionNavegacion
import com.example.ejercicio22tiendavirtual.pantallas.PantallaHome
import com.example.ejercicio22tiendavirtual.ui.theme.Ejercicio22TiendaVirtualTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio22TiendaVirtualTheme {
                GestionNavegacion()
            }
        }
    }
}
