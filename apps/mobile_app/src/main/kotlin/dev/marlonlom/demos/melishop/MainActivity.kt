package dev.marlonlom.demos.melishop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.marlonlom.demos.melishop.ui.theme.MelishopTheme

/**
 * Main activity class.
 *
 * @author marlonlom
 */
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MelishopTheme {
        // A surface container using the 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          Greeting("Android")
        }
      }
    }
  }
}

/**
 * Greeting composable screen page.
 *
 * @param name
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

/**
 * Greeting composable preview screen page.
 *
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  MelishopTheme {
    Greeting("Android")
  }
}
