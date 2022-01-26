package br.com.webmarmo.borutoapp.data.repository

import br.com.webmarmo.borutoapp.data.local.BorutoDatabase
import br.com.webmarmo.borutoapp.domain.model.Hero
import br.com.webmarmo.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase) : LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}