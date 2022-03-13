package com.example.navigationbasics.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController : NavController){
    val testArr = listOf("second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second","second")
    Scaffold() {
        LazyColumn{
            testArr.withIndex().map {
                item { Text(text = "${it.index} text-> ${it.value}",modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .clickable { navController.navigate("detailed/${it.value}") })}
            }
        }
    }
}
