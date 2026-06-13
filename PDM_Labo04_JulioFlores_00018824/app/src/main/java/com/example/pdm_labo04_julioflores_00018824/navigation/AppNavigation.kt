package com.example.pdm_labo04_julioflores_00018824.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pdm_labo04_julioflores_00018824.data.local.AppDatabase
import com.example.pdm_labo04_julioflores_00018824.data.repository.TaskRepository
import com.example.pdm_labo04_julioflores_00018824.view.HomeScreen
import com.example.pdm_labo04_julioflores_00018824.view.TaskScreen
import com.example.pdm_labo04_julioflores_00018824.viewmodel.TaskViewModel
import com.example.pdm_labo04_julioflores_00018824.viewmodel.TaskViewModelFactory

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    val context = LocalContext.current
    val database = AppDatabase.getDatabase(context)
    val repository = TaskRepository(database.taskDao())

    val viewModel: TaskViewModel = viewModel(
        factory = TaskViewModelFactory(repository)
    )

    NavHost(
        navController = navController,
        startDestination = Home
    ) {
        composable<Home> {
            HomeScreen(navController = navController)
        }

        composable<Task> {
            TaskScreen(viewModel = viewModel)
        }
    }
}