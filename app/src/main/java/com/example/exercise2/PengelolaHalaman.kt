package com.example.exercise2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.exercise2.data.UIState

enum class PengelolaHalaman {
    Home,
    Form,
    Hasil
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun exeAPPBar(
    bisaNavigasiBack: Boolean,
    navigasiUp: () -> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = { Text(stringResource(R.string.app_name)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = Modifier,
        navigationIcon = {
            if (bisaNavigasiBack) {
                IconButton(onClick = navigasiUp) {
                    Icon(
                        painterResource(R.drawable.arrow_back), contentDescription = stringResource(
                            R.string.back_button
                        )
                    )
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise2APP(
    viewModel: ViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    Scaffold(
        topBar = {
            exeAPPBar(bisaNavigasiBack = false, navigasiUp = { /*TODO*/ })
        }
    ) {innerPadding ->
        val uiState by ViewModel.stateUI

    }
}