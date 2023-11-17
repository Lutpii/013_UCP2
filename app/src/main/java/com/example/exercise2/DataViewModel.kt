package com.example.exercise2

import androidx.lifecycle.ViewModel
import com.example.exercise2.data.UIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class DataViewModel : ViewModel(){
    private val _stateUI = MutableStateFlow(UIState())
    val stateUI: StateFlow<UIState> = _stateUI.asStateFlow()

    fun setnamaMahasiswa(nama: String, nim: String, konsentrasi: String, judul: String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                namaMhs = nama,
                nim = nim,
                konsentrasi = konsentrasi,
                judul = judul
            )
        }
    }
}
