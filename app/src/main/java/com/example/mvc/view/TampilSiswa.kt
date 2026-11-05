package com.example.mvc.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.example.mvc.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    //edit 1 : parameter statusSiswa
    statusUiSiswa: Siswa,
    onBackButtonClicked:()-> Unit
){}