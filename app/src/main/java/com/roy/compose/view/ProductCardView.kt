package com.roy.compose.view

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView

class ProductCardView @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet?,
  defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

  var text by mutableStateOf<String>("")
  var onClick by mutableStateOf<() -> Unit>({})

  fun setData(btnText: String, onClickListener: () -> Unit) {
    this.text = btnText
    this.onClick = onClickListener
  }

  @Composable
  override fun Content() {
    GridProductCard(text, onClick)
  }
}