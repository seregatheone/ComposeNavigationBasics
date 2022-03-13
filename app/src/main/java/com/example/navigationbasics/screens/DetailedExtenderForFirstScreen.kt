package com.example.navigationbasics.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailedExtenderForFirstScreen(word:String){
    Text(text = "word -> $word", modifier = Modifier.padding(20.dp))
}