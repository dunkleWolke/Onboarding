package com.example.onboard.ui.theme

import com.example.onboard.ui.theme.SkipBubbles
import com.example.onboard.ui.theme.NextButton
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
fun Check() {
    OnboardingScreen1(onSkip = {}, onNext = {})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnboardingScreen1(
    onSkip: () -> Unit,
    onNext: () -> Unit
) {
    Scaffold(
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
                    .background(Yellow)
            ) {
                Spacer(modifier = Modifier.height(83.dp))
                Text(
                    text = "Your first car without\na driver's license",
                    style = MaterialTheme.typography.titleLarge,
                    color = White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
                )
                Text(
                    text = "Goes to meet people who just got\ntheir license",
                    style = MaterialTheme.typography.bodyLarge,
                    color = White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.img_car1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(height = 429.dp, width = 375.dp)
                        .background(Yellow),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(64.dp))

                SkipBubbles(
                    onSkip = onSkip,
                    onNext = onNext,
                    currentPage = 0,
                    totalPages = 4
                )


            }
        }
    )
}




