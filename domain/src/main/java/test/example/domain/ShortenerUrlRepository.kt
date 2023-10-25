package test.example.domain

import kotlinx.coroutines.flow.Flow
import test.example.domain.entity.Alias
import test.example.domain.entity.Favorite

interface ShortenerUrlRepository {
    fun shortenUrl(favorite: Favorite): Flow<List<Alias>>
    fun findUrlByAlias(id: String): Flow<Favorite>
}