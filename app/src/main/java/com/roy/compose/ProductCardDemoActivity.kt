package com.roy.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.roy.compose.ui.theme.ComposeDemoActivityTheme
import com.roy.compose.view.GridProductCard

class ProductCardDemoActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ProductCardDemoUi()
    }
  }
}

@Composable
fun ProductCardDemoUi() {
  ComposeDemoActivityTheme {
    Surface(color = MaterialTheme.colors.background) {
      GridProductCard {

      }
    }

  }
}

@Preview(showBackground = true)
@Composable
fun DefaultProductCardDemoUiPreview() {
  ProductCardDemoUi()
}