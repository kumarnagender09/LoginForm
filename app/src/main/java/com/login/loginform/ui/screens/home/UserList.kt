package com.login.loginform.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.login.loginform.data.model.User
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
@Composable
fun UserList(users: List<User>){
    LazyColumn(
        modifier = Modifier.fillMaxWidth().height(400.dp)
    ) {
        items(users) {
            UserRow(user = it)
            Divider()

        }
    }
}

@Composable
fun UserRow(user:User){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(text = user.name, style = MaterialTheme.typography.bodyLarge)
        Text(text = user.email, style = MaterialTheme.typography.bodySmall)
    }
}