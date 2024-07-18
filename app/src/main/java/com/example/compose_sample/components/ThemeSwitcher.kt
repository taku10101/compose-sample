import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_sample.ui.theme.ComposeSampleTheme

@Composable
fun ThemeSwitcher() {
	var isDarkTheme by remember { mutableStateOf(false) }

	ComposeSampleTheme(darkTheme = isDarkTheme) {
		Surface(
			color = MaterialTheme.colorScheme.primary,
			modifier = Modifier.fillMaxSize()
		) {
			Column(
				horizontalAlignment = Alignment.CenterHorizontally,
				verticalArrangement = Arrangement.Center,
				modifier = Modifier.fillMaxSize()
			) {
				Spacer(modifier = Modifier.height(16.dp))
				Switch(
					checked = isDarkTheme,
					onCheckedChange = { isDarkTheme = it }
				)
				Spacer(modifier = Modifier.height(16.dp))
				Text(text = if (isDarkTheme) "Switch to Light Theme" else "Switch to Dark Theme")
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	ThemeSwitcher()
}

@Composable
fun ThemedText() {
	Text(
		text = "Hello, Jetpack Compose!",
		color = MaterialTheme.colorScheme.primary
	)
	ThemeSwitcher()
}