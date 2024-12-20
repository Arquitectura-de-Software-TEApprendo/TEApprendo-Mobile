package com.lmp.teapprendonav._view.fragments

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lmp.teapprendonav._model.util.Constants.Companion.BODY_CONTENT_TOP_PADDING

@Composable
fun MyBodyContent(child: @Composable () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(top = BODY_CONTENT_TOP_PADDING.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        child()
    }
}