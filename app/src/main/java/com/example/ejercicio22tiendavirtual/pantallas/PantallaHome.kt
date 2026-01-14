package com.example.ejercicio22tiendavirtual.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio22tiendavirtual.R


@Composable
fun PantallaHome() {
    Scaffold {
        paddingValues ->
        LazyColumn(Modifier.padding(paddingValues)) {
            item {
                Text("Catálogo disponible:", modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp))
            }

            item {
                Producto(R.string.producto_zapatilla,"99.99€", R.drawable.zapatillasnike)
            }
            item {
                Producto(R.string.producto_camiseta,"69.90€", R.drawable.camisetamalaga)
            }
            item {
                Producto(R.string.producto_gorra,"15.0€", R.drawable.gorramalaga)
            }

        }
    }
}

@Composable
fun Producto(
    nombre: Int,
    precio: String,
    imagenRes: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = imagenRes),
                contentDescription = "",
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f)
            ){
                Text(
                    text = stringResource(id = nombre),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = precio,
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            }

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp)

            ) {
                Text(text = "Ver")
            }
        }
    }
}
