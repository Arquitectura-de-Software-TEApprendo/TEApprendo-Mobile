package com.lmp.teapprendonav._view.teachingUnit

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.lmp.teapprendonav._view.fragments.MyBodyContent
import com.lmp.teapprendonav._view.fragments.MyTopBar
import com.lmp.teapprendonav._model.util.Constants

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TeachingUnitRegisterScreen(navController: NavController) {
    Scaffold(
        topBar = { MyTopBar(Constants.TEACHING_UNIT_REGISTER_TITLE, navController) }
    ) {
        MyBodyContent({ TeachingUnitRegisterScreenBodyContent(navController) })
    }
}

@Composable
fun TeachingUnitRegisterScreenBodyContent(navController: NavController) {
    Text("Registrar Unidad Didáctica")
}