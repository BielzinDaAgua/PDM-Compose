package com.example.quadrantes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrantes.ui.theme.QuadranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadranteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadranteScreen()
                }
            }
        }
    }
}

@Composable
fun QuadranteScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuadranteCard(
                backgroundColor = Color(0xFFEADDFF),
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1f)
            )
            QuadranteCard(
                backgroundColor = Color(0xFFD0BCFF),
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuadranteCard(
                backgroundColor = Color(0xFFB69DF8),
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
            )
            QuadranteCard(
                backgroundColor = Color(0xFFF6EDFF),
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadranteCard(
    backgroundColor: Color,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            color = Color.Black,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadranteScreenPreview() {
    QuadranteTheme {
        QuadranteScreen()
    }
}
