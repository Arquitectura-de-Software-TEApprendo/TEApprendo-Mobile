package com.lmp.teapprendonav._view.navigation

sealed class AppScreens(val route: String) {
    object TeachingUnitSearchScreen: AppScreens("teaching_unit_search_screen")
    object TeachingUnitRegisterScreen: AppScreens("teaching_unit_register_screen")
    object TeachingUnitEditScreen: AppScreens("teaching_unit_edit_screen")
}