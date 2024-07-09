package com.example.compose_sample.ui.theme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun IconSampleGrid() {
	val icons = listOf(
		Icons.Default.Home,
		Icons.Default.Favorite,
		Icons.Default.AccountCircle,
		Icons.Default.Notifications,
		Icons.Default.Settings,
		Icons.Default.Search,
		Icons.Default.ShoppingCart,
		Icons.Default.Phone,
		Icons.Default.Email,
		Icons.Default.Info,
		Icons.Filled.Person,
	)

	LazyVerticalGrid(
		columns = GridCells.Adaptive(80.dp),
		contentPadding = PaddingValues(16.dp),
		modifier = Modifier.fillMaxSize()
	) {
		items(icons) { icon ->
			IconItem(icon)
		}
	}
}

@Composable
fun IconItem(icon: ImageVector) {
	Column(
		modifier = Modifier
			.padding(8.dp)
			.width(80.dp),
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Icon(
			imageVector = icon,
			contentDescription = null,
			modifier = Modifier
				.size(48.dp)
				.padding(8.dp),
			tint = MaterialTheme.colorScheme.primary
		)
		Text(
			text = icon.name,
			style = MaterialTheme.typography.bodyLarge

		)
	}
}

// Extension property to get the name of the ImageVector
val ImageVector.name: String
	get() = when (this) {
		Icons.Default.Add -> "Add"
		Icons.Default.Clear -> "Clear"
		Icons.Default.Close -> "Close"
		Icons.Default.Menu -> "Menu"
		Icons.Default.MoreVert -> "More Vert"
		Icons.Default.Home -> "Home"
		Icons.Default.Favorite -> "Favorite"
		Icons.Default.AccountCircle -> "Account"
		Icons.Default.Notifications -> "Notifications"
		Icons.Default.Settings -> "Settings"
		Icons.Default.Search -> "Search"
		Icons.Default.ShoppingCart -> "Cart"
		Icons.Default.Phone -> "Phone"
		Icons.Default.Email -> "Email"
		Icons.Default.Info -> "Info"
		Icons.Default.Person -> "Person"

		else -> "Unknown"
	}


@Composable
@Preview
fun IconSampleGridPreview() {
	ComposesampleTheme {
		IconSampleGrid()
	}
}