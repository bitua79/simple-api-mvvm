package com.example.apisample.domain

import com.example.apisample.data.repository.AnimeRepository
import javax.inject.Inject

class GetAllAnime @Inject constructor(
    private val repo:AnimeRepository
) {
    suspend operator fun invoke() = repo.getAllAnime()
}