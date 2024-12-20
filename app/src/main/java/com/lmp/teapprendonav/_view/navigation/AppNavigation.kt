package com.lmp.teapprendonav._view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lmp.teapprendonav._view.teachingUnit.TeachingUnitEditScreen
import com.lmp.teapprendonav._view.teachingUnit.TeachingUnitRegisterScreen
import com.lmp.teapprendonav._view.teachingUnit.TeachingUnitSearchScreen
import com.lmp.teapprendonav._viewModel.CurricularViewModel

@Composable
fun AppNavigation(viewModel: CurricularViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.TeachingUnitSearchScreen.route) {
        composable(route = AppScreens.TeachingUnitSearchScreen.route) {
            TeachingUnitSearchScreen(navController, viewModel)
        }
        composable(route = AppScreens.TeachingUnitRegisterScreen.route) {
            TeachingUnitRegisterScreen(navController)
        }
        composable(route = AppScreens.TeachingUnitEditScreen.route) {
            TeachingUnitEditScreen(navController)
        }
    }
}