package com.roy.compose.view

import android.widget.ImageView
import android.widget.ImageView.ScaleType.CENTER_CROP
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.viewinterop.AndroidView
import com.roy.compose.R
import com.roy.compose.R.drawable
import com.roy.compose.ui.theme.ComposeDemoActivityTheme

@Composable
fun GridProductCard(
  name: String = "Star War IIIStar War IIIStar War IIIStar War IIIStar War IIIStar War III",
  click: () -> Unit
) {
  ComposeDemoActivityTheme {
    // A surface container using the 'background' color from the theme
    Surface(color = MaterialTheme.colors.background) {

      Column(
        modifier = Modifier
          .padding(10.dp)
          .fillMaxWidth()
          .clickable {
            click.invoke()
          }
      ) {
        Box {
          Image(
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = drawable.ic_launcher_background),
            contentDescription = ""
          )

          Image(
            modifier = Modifier
              .align(Alignment.TopStart)
              .padding(all = 10.dp),
            painter = painterResource(id = drawable.baseline_check_circle_outline_red_300_24dp),
            contentDescription = ""
          )
//          Image(
//            modifier = Modifier
//              .align(Alignment.BottomEnd)
//              .padding(all = 10.dp),
//            painter = painterResource(id = drawable.baseline_thumb_up_cyan_300_24dp),
//            contentDescription = ""
//          )
          //嘗試使用 imageView 放在 compose 裡面
          AndroidView(
            factory = { context ->
              ImageView(context)
            },
            update = {
              it.setImageResource(R.drawable.baseline_thumb_up_cyan_300_24dp)
            },
            modifier = Modifier
              .align(Alignment.BottomEnd)
              .padding(all = 10.dp)
          )
        }


        Text(
          modifier = Modifier
            .padding(0.dp, 4.dp, 0.dp, 0.dp)
            .height(40.dp),
          fontSize = 14.sp,
          text = name,
          maxLines = 2,
          overflow = TextOverflow.Ellipsis
        )

        Row(modifier = Modifier.padding(0.dp, 4.dp)) {
          Text(text = "Shop Name", fontSize = 14.sp)
          Text(text = "・", fontSize = 14.sp)
          Text(text = "AD", fontSize = 14.sp)
        }
        Row() {
          Text(text = "NT$1,250", fontSize = 14.sp)
          Text(
            fontSize = 14.sp,
            text = "NT$5,000",
            style = TextStyle(textDecoration = TextDecoration.LineThrough),
            color = Color.Gray,
            modifier = Modifier.padding(10.dp, 0.dp)
          )
        }
      }

    }
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultProductPreview() {
  GridProductCard {

  }
}