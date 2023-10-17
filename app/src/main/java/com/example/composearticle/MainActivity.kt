package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card(stringResource(R.string.title), stringResource(R.string.shortDesc), stringResource(
                        R.string.longDesc
                    ))
                }
            }
        }
    }
}


@Composable
fun Card(title: String, shortDesc: String, longDesc: String , modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)


    Column(modifier = Modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )

        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )

        Text(
            text = shortDesc,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = longDesc,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
            )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Card(stringResource(R.string.title), stringResource(R.string.shortDesc), stringResource(
            R.string.longDesc
        ))
    }
}

