package cat.itb.damv2.m78.dbdemo.cat.itb.damv2.m78.dbdemo.model

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DatabaseViewModel : ViewModel() {
     val valor = mutableStateOf("hola")

    fun setValor(valor: String) {
        this.valor.value = valor
    }
}
