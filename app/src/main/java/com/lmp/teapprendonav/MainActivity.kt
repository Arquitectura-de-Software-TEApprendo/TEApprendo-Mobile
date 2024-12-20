package com.lmp.teapprendonav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lmp.teapprendonav._view.navigation.AppNavigation
import com.lmp.teapprendonav._viewModel.CurricularViewModel
import com.lmp.teapprendonav.ui.theme.TEApprendoNavTheme

class MainActivity : ComponentActivity() {
    private val viewModel: CurricularViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TEApprendoNavTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    AppNavigation(viewModel)
                }
            }
        }
    }
}