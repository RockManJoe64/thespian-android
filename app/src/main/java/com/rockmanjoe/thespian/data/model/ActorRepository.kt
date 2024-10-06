package com.rockmanjoe.thespian.data.model

interface ActorRepository {
    suspend fun getPopularActors(): List<Actor>
}