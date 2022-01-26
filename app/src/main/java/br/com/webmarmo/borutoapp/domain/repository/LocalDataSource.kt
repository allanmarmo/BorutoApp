package br.com.webmarmo.borutoapp.domain.repository

import br.com.webmarmo.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}