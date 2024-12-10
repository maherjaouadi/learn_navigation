package com.example.learnnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyAppNavigation(){
    val navController = rememberNavController()
    NavHost( navController,  startDestination = Routes.screenA, builder = {
        composable(route = Routes.screenA){
            ScreenA(navController)
        }
        composable(route = Routes.screenB+"/{name}"){
            val  name = it.arguments?.getString("name")
            ScreenB(navController, name = name?:"No name")
        }
        composable(route = Routes.screenC){
            ScreenC(navController)
        }
    })
}