package com.login.loginform.ui.screens.components

import android.widget.Button
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun CustomButton(
    title: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enable: Boolean = true,
){
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enable,

    ) {
        Text(text = title)
    }
}