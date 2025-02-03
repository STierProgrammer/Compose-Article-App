package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    ComposeArticleContent("Article", "Second")
                }
            }
        }
    }
}

@Composable
fun ComposeArticleContent(title: String, paragraph: String, modifier: Modifier = Modifier) {
    ComposeArticleTheme {
        Column {
            // Image
            Image(
                painter = painterResource(R.drawable.bg_compose_background),
                contentDescription = null
            )

            // Title
            Text(
                text = title,
                fontSize = 100.sp
            )

            // Paragraph
            Text(
                text = paragraph,
                fontSize = 50.sp
            )
        }
    }
}

@Preview
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        ComposeArticleContent("Article", "Blah Blah Blah Blah Blah Blah Blah Blah Blah Blah Blah Blah Blah")
    }
}