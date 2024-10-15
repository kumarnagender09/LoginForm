package com.login.loginform.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.login.loginform.data.model.User
import com.login.loginform.ui.screens.components.CustomButton

@Composable
fun HomeScreen(navController: NavController){
    val dummyUser = listOf(
        User(1,"Nagender", "nagender@gmail.com"),
        User(2,"Mike", "mike@gmail.com"),
        User(3,"Ram", "ram@gmail.com"),
        User(1,"Nagender", "nagender@gmail.com"),
        User(2,"Mike", "mike@gmail.com"),
        User(3,"Ram", "ram@gmail.com"),
        User(1,"Nagender", "nagender@gmail.com"),
        User(2,"Mike", "mike@gmail.com"),
        User(3,"Ram", "ram@gmail.com"),
        User(1,"Nagender", "nagender@gmail.com"),
        User(2,"Mike", "mike@gmail.com"),
        User(3,"Ram", "ram@gmail.com"),
        User(1,"Nagender", "nagender@gmail.com"),
        User(2,"Mike", "mike@gmail.com"),
        User(3,"Ram", "ram@gmail.com"),
        User(1,"Nagender", "nagender@gmail.com"),
        User(2,"Mike", "mike@gmail.com"),
        User(3,"Ram", "ram@gmail.com"),

    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home screen", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(10.dp))
        UserList(users = dummyUser)
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            CustomButton(title = "LogOut", onClick = {
                navController.popBackStack()
            }, modifier = Modifier
                .fillMaxWidth() // Make button take full width for better visibility
                .padding(10.dp) // Padding above the button
                .height(48.dp) // Ensure a good height for visibility
            )
        }
    }
}