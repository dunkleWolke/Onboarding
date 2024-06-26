package com.example.onboard.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.onboard.R


@Preview()
@Composable
fun Check3() {
    OnboardingScreen3(onSkip = {}, onNext = {})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnboardingScreen3(
    onSkip: () -> Unit,
    onNext: () -> Unit
) {
    Scaffold(
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
                    .background(Orange)
            ) {
                Spacer(modifier = Modifier.height(83.dp))
                Text(
                    text = "Do not pay for parking,\nmaintenance and gasoline",
                    style = MaterialTheme.typography.titleLarge,
                    color = White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
                )
                Text(
                    text = "We will pay for you, all expenses\nrelated to the car",
                    style = MaterialTheme.typography.bodyLarge,
                    color = White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.img_car3),
                    contentDescription = null,
                    modifier = Modifier
                        .size(height = 428.dp, width = 380.dp)
                        .background(Orange)
                        .align(Alignment.End),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(64.dp))

                SkipBubbles(
                    onSkip = onSkip,
                    onNext = onNext,
                    currentPage = 2,
                    totalPages = 4
                )


            }
        }
    )
}




