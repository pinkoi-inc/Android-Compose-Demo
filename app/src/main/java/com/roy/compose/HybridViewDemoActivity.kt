package com.roy.compose

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.roy.compose.ui.theme.ComposeDemoActivityTheme
import com.roy.compose.view.GridProductCard
import com.roy.compose.view.ProductCardView

class HybridViewDemoActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hybrid_view_demo)
    findViewById<Button>(R.id.btn_finish).setOnClickListener { finish() }
    findViewById<ProductCardView>(R.id.product_card).setData(
      "測試從 activity 賦值"
    ) {
      Toast.makeText(this, "click product card", Toast.LENGTH_SHORT).show()
    }
  }
}

