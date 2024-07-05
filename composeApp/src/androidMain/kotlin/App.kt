import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmpfirstapp.composeapp.generated.resources.Res
import kmpfirstapp.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }

        Column(
            Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Button(
                onClick = { showContent = !showContent },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue),
                shape = RoundedCornerShape(100)
                ) {
                Text(
                    text = "Click me!",
                    color = Color.White
                )
            }

            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier
                    .fillMaxWidth()
                    .padding(top=24.dp)
                    , horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}

