package com.rockmanjoe.thespian.data.model

class ActorExampleRepository : ActorRepository {
    override suspend fun getPopularActors(): List<Actor> {
        return listOf(
            Actor(
                id = 1,
                name = "Tom Cruise",
                imageUrl = "https://image.tmdb.org/t/p/w500/3WZTxpgscsmoUk81TuECXdFOD0R.jpg",
                popularity = 100.0
            ),
            Actor(
                id = 2,
                name = "Tom Hanks",
                imageUrl = "https://image.tmdb.org/t/p/w500/3WZTxpgscsmoUk81TuECXdFOD0R.jpg",
                popularity = 99.0
            ),
            Actor(
                id = 3,
                name = "Tom Hardy",
                imageUrl = "https://image.tmdb.org/t/p/w500/3WZTxpgscsmoUk81TuECXdFOD0R.jpg",
                popularity = 98.0
            ),
            Actor(
                id = 4,
                name = "Tom Holland",
                imageUrl = "https://image.tmdb.org/t/p/w500/3WZTxpgscsmoUk81TuECXdFOD0R.jpg",
                popularity = 97.0
            ),
            Actor(
                id = 5,
                name = "Tom Felton",
                imageUrl = "https://image.tmdb.org/t/p/w500/3WZTxpgscsmoUk81TuECXdFOD0R.jpg",
                popularity = 96.0
            ),
            Actor(
                id = 6,
                name = "Tom Cruise",
                imageUrl = "https://image.tmdb.org/t/p/w500/3WZTxpgscsmoUk81TuECXdFOD0R.jpg",
                popularity = 95.0
            ),
            Actor(
                id = 7,
                name = "Tom Hanks",
                imageUrl = "https://image.tmdb.org/t/p/w500/3WZTxpgscsmoUk81TuECXdFOD0R.jpg",
                popularity = 94.0
            ),
            Actor(
                id = 8,
                name = "Tom Hardy",
                imageUrl = "https://image.tmdb.org/t/p/w500/3WZTxpgscsmoUk81TuECXdFOD0R.jpg",
                popularity = 93.0
            )
        )
    }
}