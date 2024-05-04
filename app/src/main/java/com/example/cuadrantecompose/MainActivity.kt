package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant(
                        title =  stringResource(R.string.Titulo),
                        text = stringResource(R.string.parrafo1)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrant(title: String, text: String, modifier: Modifier = Modifier) {

        Column(
            modifier = modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)

            )
            Text(
                text = text,
                textAlign = TextAlign.Justify
            )
        }
}
@Composable
fun Todo(title: String, text: String) {
    Column{
        Row (Modifier.weight(1f)){
            Quadrant(
                title = title,
                text = text,
                modifier = Modifier
                    .background(color = Color(0xFFEADDFF))
                    .weight(1f)

            )
            Quadrant(
                title = title,
                text = text,
                modifier = Modifier
                    .background(color = Color(0xFFD0BCFF))
                    .weight(1f)
            )
        }
        Row (Modifier.weight(1f)){
            Quadrant(
                title = title,
                text = text,
                modifier = Modifier
                    .background(color = Color(0xFFB69DF8))
                    .weight(1f)
            )
            Quadrant(
                title = title,
                text = text,
                modifier = Modifier
                    .background(color = Color(0xFFF6EDFF))
                    .weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Todo(title =  stringResource(R.string.Titulo),
        text = stringResource(R.string.parrafo1)
    )

}