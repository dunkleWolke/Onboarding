package com.example.onboard

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.example.onboard.ui.theme.FinalScreen
import com.example.onboard.ui.theme.OnboardingScreen1
import com.example.onboard.ui.theme.OnboardingScreen2
import com.example.onboard.ui.theme.OnboardingScreen3
import com.example.onboard.ui.theme.OnboardingScreen4
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreens() {
    val pagerState = rememberPagerState(pageCount = { 5 })
    val scope = rememberCoroutineScope()

    HorizontalPager(state = pagerState) { page ->
        when (page) {
            0 -> OnboardingScreen1(
                onSkip = { scope.launch { pagerState.scrollToPage(pagerState.pageCount - 1) } },
                onNext = { scope.launch { pagerState.scrollToPage(page + 1) } }
            )
            1 -> OnboardingScreen2(
                onSkip = { scope.launch { pagerState.scrollToPage(pagerState.pageCount - 1) } },
                onNext = { scope.launch { pagerState.scrollToPage(page + 1) } }
            )
            2 -> OnboardingScreen3(
                onSkip = { scope.launch { pagerState.scrollToPage(pagerState.pageCount - 1) } },
                onNext = { scope.launch { pagerState.scrollToPage(page + 1) } }
            )
            3 -> OnboardingScreen4(
                onSkip = { scope.launch { pagerState.scrollToPage(pagerState.pageCount - 1) } },
                onNext = { scope.launch { pagerState.scrollToPage(page + 1) } }
            )
            4 -> FinalScreen()
        }
    }

}