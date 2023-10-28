package test.example.presentation.home

import test.example.domain.usecase.ShortenUrlUseCase
import test.example.presentation.common.ResultConverter
import javax.inject.Inject

class FavoritesConverter @Inject constructor(): ResultConverter<ShortenUrlUseCase.Response, List<String>>() {

    override fun convertSuccess(data: ShortenUrlUseCase.Response) =
        data.favorites.map {it.url}

}