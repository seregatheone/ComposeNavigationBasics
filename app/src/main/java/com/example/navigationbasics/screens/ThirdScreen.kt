package com.example.navigationbasics.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun ThirdScreen(){
    Scaffold(topBar ={Text(text = "NestedGraph", modifier = androidx.compose.ui.Modifier.fillMaxSize().padding(20.dp), textDecoration = TextDecoration.Underline)
    } ){

    }
}