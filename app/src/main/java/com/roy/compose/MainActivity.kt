package com.roy.compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roy.compose.ui.theme.ComposeDemoActivityTheme
import com.roy.compose.view.GridProductCard

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MainUi()
    }
  }
}

@Composable
fun MainUi() {
  val context = LocalContext.current
  ComposeDemoActivityTheme {
    Surface(color = MaterialTheme.colors.background) {
      Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.padding(16.dp)
      ) {

        Button(onClick = {
          context.startActivity(Intent(context, ProductCardDemoActivity::class.java))
        }) {
          Text(text = "compose product card demo")
        }
        Button(onClick = {
          context.startActivity(Intent(context, HybridViewDemoActivity::class.java))
        }) {
          Text(text = "hybrid xml and compose demo")
        }
      }
    }

  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  MainUi()
}