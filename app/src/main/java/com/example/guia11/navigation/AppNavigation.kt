package com.example.guia11.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.guia11.ui.screen.RegistroScreen
import com.example.guia11.ui.screen.ResumenScreen
import com.example.guia11.viewModel.UsuarioViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    // Aqui creamos el viewModel una sola vez
    val usuarioViewModel: UsuarioViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "registro"
    ) {
        composable("registro") {
            RegistroScreen(navController, usuarioViewModel)
        }
        composable("resumen") {
            ResumenScreen(usuarioViewModel)
        }
    }
}