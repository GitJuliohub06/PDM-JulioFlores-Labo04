package com.example.pdm_labo04_julioflores_00018824.data.repository


import com.example.pdm_labo04_julioflores_00018824.data.local.TaskDao
import com.example.pdm_labo04_julioflores_00018824.model.Task
import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao) {

    val allTasks: Flow<List<Task>> = taskDao.getAllTasks()

    suspend fun insertTask(task: Task) {
        taskDao.insertTask(task)
    }
}