package com.rockmanjoe.thespian.features

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.rockmanjoe.thespian.data.model.Actor
import com.rockmanjoe.thespian.data.model.ActorExampleRepository
import com.rockmanjoe.thespian.ui.theme.ThespianTheme

@Composable
fun PopularActors(modifier: Modifier = Modifier) {
    // TODO refactor to use viewmodel
    val repository = ActorExampleRepository()
    val actors = remember { mutableStateOf(emptyList<Actor>()) }

    LaunchedEffect(Unit) {
        actors.value = repository.getPopularActors()
    }

    ActorGrid(actors = actors.value)
}

@Composable
fun ActorGrid(actors: List<Actor>) {
    LazyColumn {
        items(actors) { actor ->
            ActorCard(actor = actor)
        }
    }
}

@Composable
fun ActorCard(actor: Actor) {
    Card(onClick = { /* TODO */ }) {
        Box(modifier = Modifier.fillMaxSize()) {
            AsyncImage(
                model = actor.imageUrl,
                contentDescription = actor.name,
                modifier = Modifier.size(128.dp))
            Box(
                modifier = Modifier.align(Alignment.BottomCenter)
                    .background(Color.Black)
                    .fillMaxWidth()
                    .height(40.dp)
                    .graphicsLayer { alpha = 0.3f }) {
            }
            Text(
                text = actor.name,
                modifier = Modifier.align(Alignment.BottomCenter)
                    .padding(8.dp),
//                style = MaterialTheme.typography.h6,
                color = Color.White
            )
        }
    }
}

@Composable
fun PopularActorsPreview() {
    ThespianTheme {
        PopularActors()
    }
}