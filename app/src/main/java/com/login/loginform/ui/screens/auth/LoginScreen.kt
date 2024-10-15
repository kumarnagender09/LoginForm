package com.login.loginform.ui.screens.auth

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.login.loginform.R
import com.login.loginform.ui.screens.components.CustomButton
import com.login.loginform.ui.theme.LoginFormTheme

@Composable
fun LoginScreen(){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.a), contentDescription = "App Logo" , modifier = Modifier.height(100.dp) )
        Spacer(modifier = Modifier.size(4.dp))
        Text(text = "Welcome to Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.size(4.dp))
        Text(text = "Login to your account")
        Spacer(modifier = Modifier.size(4.dp))

        OutlinedTextField(value = email, onValueChange = {
                                                         email = it
        }, label = {
            Text(text = "Email")
        })
        Spacer(modifier = Modifier.size(4.dp))
        OutlinedTextField(value = password, onValueChange = {
                                                            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.size(4.dp))
        CustomButton(title = "Login", onClick = {
            Log.i("Login Click", "Email is $email")
        })
        Spacer(modifier = Modifier.size(4.dp))
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Forgot Password")
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CustomButton(title = "FaceBook", onClick = {
                Log.i("Login Click", "Email is $email")
            })
            CustomButton(title = "Google", onClick = {
                Log.i("Login Click", "Email is $email")
            })
            CustomButton(title = "Twitter", onClick = {
                Log.i("Login Click", "Email is $email")
            })
        }

    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginFormTheme {
       LoginScreen()
    }
}