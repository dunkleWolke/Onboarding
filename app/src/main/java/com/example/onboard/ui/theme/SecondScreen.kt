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
fun Check2() {
    OnboardingScreen2(onSkip = {}, onNext = {})
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnboardingScreen2(
    onSkip: () -> Unit,
    onNext: () -> Unit
) {
    Scaffold(
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
                    .background(Purple)
            ) {
                Spacer(modifier = Modifier.height(83.dp))
                Text(
                    text = "Always there: more than\n1000 cars in Tbilisi",
                    style = MaterialTheme.typography.titleLarge,
                    color = White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
                )
                Text(
                    text = "Our company is a leader by the\nnumber of cars in the fleet",
                    style = MaterialTheme.typography.bodyLarge,
                    color = White,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 8.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.img_car2),
                    contentDescription = null,
                    modifier = Modifier
                        .size(height = 428.dp, width = 380.dp)
                        .background(Purple)
                        .align(Alignment.End),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(64.dp))

                SkipBubbles(
                    onSkip = onSkip,
                    onNext = onNext,
                    currentPage = 1,
                    totalPages = 4
                )


            }
        }
    )
}




