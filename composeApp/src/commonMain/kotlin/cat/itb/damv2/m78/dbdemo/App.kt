package cat.itb.damv2.m78.dbdemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cat.itb.damv2.m78.dbdemo.cat.itb.damv2.m78.dbdemo.model.DatabaseViewModel

import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    viewModel:DatabaseViewModel= DatabaseViewModel(),
){
    MaterialTheme {
        val freeText=viewModel.valor.value

        var inputText by remember { mutableStateOf("") }

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(freeText)
            Button(onClick = {
                viewModel.setValor(inputText)
            }) {
                Text("Replace with...")
            }
            TextField(
                value = inputText,
                onValueChange = { inputText = it },
                label = { Text("Enter new text") }
            )
        }
    }
}