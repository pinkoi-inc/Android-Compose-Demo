package com.roy.compose.ui.theme

import androidx.compose.material.OutlinedTextField

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.roy.compose.R

@Composable
fun HelloContent() {
  Column(modifier = Modifier.padding(16.dp)) {
    Text(
      text = "Hello!",
      modifier = Modifier.padding(bottom = 8.dp),
      style = MaterialTheme.typography.h5
    )
    OutlinedTextField(
      value = "",
      onValueChange = { },
      label = { Text("Name") }
    )
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultHelloContentPreview() {
  HelloContent(

  )
}


