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
import androidx.compose.foundation.lazy.items
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
import com.example.ejercicio22tiendavirtual.Producto
import com.example.ejercicio22tiendavirtual.R


@Composable
fun PantallaHome(
    navegaADetalle:(Producto)->Unit
) {
    val productos = listOf(
        Producto(
            R.string.producto_zapatilla,
            R.string.producto_zapatilla_precio,
            R.drawable.zapatillasnike,
            R.string.producto_zapatilla_desc
        ),
        Producto(
            R.string.producto_camiseta,
            R.string.producto_camiseta_precio,
            R.drawable.camisetamalaga,
            R.string.producto_camiseta_desc
        ),
        Producto(
            R.string.producto_gorra,
            R.string.producto_gorra_precio,
            R.drawable.gorramalaga,
            R.string.producto_gorra_desc
        )
    )

    Scaffold {
        paddingValues ->
        LazyColumn(Modifier.padding(paddingValues)) {
            item {
                Text("Catálogo disponible:", modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp))
            }

            items(productos) { producto ->
                ItemProducto(
                    producto = producto,
                    onVerClick = {
                        navegaADetalle(producto)
                    }
                )
            }

        }
    }
}

@Composable
fun ItemProducto(
    producto: Producto,
    onVerClick: () -> Unit
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
                painter = painterResource(id = producto.imagenRes),
                contentDescription = "",
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(id = producto.nombre),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = stringResource(id = producto.precio),
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            }

            Button(
                onClick = onVerClick,
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "Ver")
            }
        }
    }
}



