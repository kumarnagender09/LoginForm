package com.login.loginform.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.login.loginform.ui.screens.auth.LoginScreen
import com.login.loginform.ui.screens.home.HomeScreen

@Composable
fun AppNavGraph(){
    val navControler = rememberNavController()
    NavHost(navController = navControler, startDestination = "login") {
        composable("login") {
            LoginScreen(navControler)
    }
        composable("home"){
            HomeScreen(navControler)
        }
    }

}