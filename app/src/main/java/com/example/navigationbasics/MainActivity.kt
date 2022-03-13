package com.example.navigationbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationbasics.ui.theme.NavigationBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    val bottomItems = listOf("first","second","third")
                    Scaffold(bottomBar = {
                        BottomNavigation {
                            bottomItems.forEach { screen->
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = {navController.navigate(screen)},
                                    label = {Text(screen)},
                                    icon = {}
                                )
                            }
                        }
                    }){
                        NavHost(navController = navController, startDestination = "first"){
                            composable("first"){ Text("FirstScreen", modifier = Modifier.padding(20.dp)) }
                            composable("second"){ Text("SecondScreen", modifier = Modifier.padding(20.dp)) }
                            composable("third"){ Text("ThirdScreen", modifier = Modifier.padding(20.dp)) }
                        }
                    }
                }
            }
        }
    }
}
