package com.lmp.teapprendonav._view.teachingUnit

import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import com.lmp.teapprendonav._model.ui.MyMessage
import com.lmp.teapprendonav._view.navigation.AppScreens
import com.lmp.teapprendonav._view.fragments.MyBodyContent
import com.lmp.teapprendonav._view.fragments.MyItemList
import com.lmp.teapprendonav._view.fragments.MyTopBar
import com.lmp.teapprendonav._model.util.Constants
import com.lmp.teapprendonav._viewModel.CurricularViewModel
import com.lmp.teapprendonav._viewModel.converter.convertTeachingUnitListToMyMessageList

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TeachingUnitSearchScreen(navController: NavController, viewModel: CurricularViewModel) {
    val teachingUnits by viewModel.teachingUnits.observeAsState(emptyList())
    val messages = convertTeachingUnitListToMyMessageList(teachingUnits)

    LaunchedEffect(Unit) {
        viewModel.fetchTeachingUnits()
    }

    Scaffold(
        topBar = { MyTopBar(Constants.TEACHING_UNIT_SEARCH_TITLE, navController) }
    ) {
        MyBodyContent({ TeachingUnitSearchScreenBodyContent(navController, messages) })
    }
}


@Composable
fun TeachingUnitSearchScreenBodyContent(navController: NavController, messages: List<MyMessage>) {
    Button(onClick = {
        navController.navigate(route = AppScreens.TeachingUnitRegisterScreen.route)
    }) {
        Text("Registrar Unidad Didáctica")
    }
    Button(onClick = {
        navController.navigate(route = AppScreens.TeachingUnitEditScreen.route)
    }) {
        Text("Editar Unidad Didáctica")
    }
    LazyColumn {

        items(messages) { message ->
            MyItemList(message = message)
        }
    }
}