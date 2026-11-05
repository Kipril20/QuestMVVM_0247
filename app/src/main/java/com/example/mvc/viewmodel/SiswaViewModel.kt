package com.example.mvc.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvc.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(1s: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(nama=1s[0], gender=1s[1], alamat=1s[2])
        }
    }
}