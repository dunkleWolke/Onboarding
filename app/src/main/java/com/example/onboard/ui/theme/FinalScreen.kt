package com.example.onboard.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.onboard.R


@Preview()
@Composable
fun CheckFinal() {
    FinalScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FinalScreen(

) {
    Box(
        modifier = Modifier
            .background(Blue)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "You are a clever person!",
            style = MaterialTheme.typography.titleLarge,
            color = White,
            fontWeight = FontWeight.Bold
        )
    }
}