# Login UI Package - README

## Overview

The `com.login.loginform.ui.screens.auth` package provides a simple login UI built with Jetpack Compose for Android applications. This login screen includes fields for email and password, a login button, a forgot password option, and social media login buttons for Facebook, Google, and Twitter.

## Features

- **Email and Password Input**: Text fields for user input with email validation and password masking.
- **Login Button**: Custom login button to trigger login action.
- **Forgot Password**: Text button to navigate users to the forgot password flow.
- **Social Media Login**: Buttons for logging in with Facebook, Google, or Twitter.
- **Compose Preview**: UI preview using Jetpack Compose's `@Preview` annotation.
- **Screenshots**: Shows example images of the UI.

## Installation

1. Clone the repository or copy the code to your project.
2. Ensure you have the required dependencies for Jetpack Compose and Material3 components.

### Dependencies

Make sure to include the following dependencies in your `build.gradle` file:

```gradle
implementation "androidx.compose.material3:material3:1.0.0"
implementation "androidx.compose.ui:ui:1.1.0"
implementation "androidx.compose.runtime:runtime:1.1.0"
```

## Usage

### 1. **Displaying the Login Screen**

To display the login screen, you just need to call the `LoginScreen()` function in your composable function:

```kotlin
@Composable
fun MyApp() {
    LoginScreen()
}
```

### 2. **Customizing Buttons**

The `CustomButton` component is used for both the login and social media buttons. You can replace the click handlers with your actual login logic.

Example:
```kotlin
CustomButton(title = "Login", onClick = {
    // Add login functionality here
})
```

### 3. **Forgot Password**

You can add your forgot password logic by modifying the `TextButton`:

```kotlin
TextButton(onClick = { 
    // Add forgot password logic here 
}) {
    Text(text = "Forgot Password")
}
```

### 4. **Handling Social Logins**

The social media login buttons currently log the email to the console. You can integrate your authentication APIs here:

```kotlin
CustomButton(title = "Google", onClick = {
    // Add Google login functionality here
})
```

### 5. **Previewing the UI**

You can preview the UI in Android Studio using the `@Preview` annotation provided in the code:

```kotlin
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginFormTheme {
        LoginScreen()
    }
}
```

## Code Explanation

- **Email and Password Fields**: The email and password are managed using `remember` and `mutableStateOf` to store the input.
- **Password Masking**: `PasswordVisualTransformation` is used to hide the password input.
- **Button Click Handlers**: `CustomButton` handles clicks and logs the email using `Log.i()`. Replace these with real logic as needed.
- **Image**: The app logo is displayed using the `Image` composable, referencing a drawable resource.

## Folder Structure

```
com/
└── login/
    └── loginform/
        └── ui/
            └── screens/
                └── auth/
                    └── LoginScreen.kt
```

## Customization

- **App Logo**: Replace the image resource `R.drawable.a` with your app's logo.
- **Text Styles**: Modify the `Text` composables for custom text styles (e.g., font size, weight).
- **Social Logins**: Integrate real authentication flows for Facebook, Google, and Twitter.
