package com.example.onboard.ui.theme


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

import androidx.compose.ui.unit.dp



@Composable
fun SkipBubbles(
    onSkip: () -> Unit,
    onNext: () -> Unit,
    currentPage: Int,
    totalPages: Int
) {
    Column(
        modifier = Modifier.padding(start = 24.dp)
    ) {
        Box(
            modifier = Modifier.padding(start = 4.dp)
        ) {
            Row {
                repeat(totalPages) { index ->
                    Box(
                        modifier = Modifier
                            .size(height = 14.dp, width = 14.dp)
                            .clip(CircleShape)
                            .background(
                                color = if (index == currentPage) Pink40 else Pink40.copy(alpha = 0.2f)
                            )
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(
                    onClick = onSkip
                ) {
                    Text("Skip", style = MaterialTheme.typography.bodyLarge, color = Pink40)
                }
                Spacer(modifier = Modifier.width(16.dp))
                NextButton(onClick = onNext, currentPage = 1, totalPages = 4)
            }
        }
    }
}

@Composable
fun NextButton(
    onClick: () -> Unit,
    currentPage: Int,
    totalPages: Int
) {
    val progress = remember { mutableStateOf((currentPage.toFloat() / totalPages.toFloat())) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 16.dp),
        contentAlignment = Alignment.CenterEnd,
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.White, CircleShape)
                .border(width = 1.dp, color = White, shape = CircleShape)
        ) {
            CircularProgressIndicator(
                progress = progress.value,
                strokeWidth = 8.dp,
                modifier = Modifier.size(64.dp),
                color = Pink40
            )
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "Next",
                modifier = Modifier
                    .size(28.dp),
                tint = Pink40
            )
        }
    }
}

