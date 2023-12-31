package com.example.activity4

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.activity4.data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUser : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var alamat : String by mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    var statusM : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm : String, tlp: String, jk : String, almt: String, eml: String, sts: String){
        namaUser = nm
        noTlp = tlp
        jenisKl = jk
        alamat = almt
        email = eml
        statusM = sts


    }
    fun setJenisK(pilihJK : String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }

    }

    fun setStatus(pilihSt : String){
        _uiState.update { currentState -> currentState.copy(status = pilihSt) }

    }

}