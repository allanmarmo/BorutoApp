package br.com.webmarmo.borutoapp.domain.repository

import androidx.paging.PagingData
import br.com.webmarmo.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHeroes(): Flow<PagingData<Hero>>
}