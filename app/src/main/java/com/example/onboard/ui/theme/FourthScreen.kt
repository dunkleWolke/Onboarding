package com.example.onboard.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.onboard.R


@Preview()
@Composable
fun Check4() {
    OnboardingScreen4(onSkip = {}, onNext = {})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnboardingScreen4(
    onSkip: () -> Unit,
    onNext: () -> Unit
) {
    Scaffold(
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
                    .background(Blue)
            ) {
                Spacer(modifier = Modifier.height(83.dp))
                Text(
                    text = "29 car models: from Skoda\nOctavia to Porsche 911",
                    style = MaterialTheme.typography.titleLarge,
                    color = White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
                )
                Text(
                    text = "Choose between regular car models\nor exclusive ones",
                    style = MaterialTheme.typography.bodyLarge,
                    color = White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.img_car4),
                    contentDescription = null,
                    modifier = Modifier
                        .size(height = 429.dp, width = 375.dp)
                        .background(Blue),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(64.dp))

                SkipBubbles(
                    onSkip = onSkip,
                    onNext = onNext,
                    currentPage = 3,
                    totalPages = 4
                )


            }
        }
    )
}




