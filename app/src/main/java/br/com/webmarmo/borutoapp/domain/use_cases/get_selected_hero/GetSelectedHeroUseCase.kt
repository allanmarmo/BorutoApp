package br.com.webmarmo.borutoapp.domain.use_cases.get_selected_hero

import br.com.webmarmo.borutoapp.data.repository.Repository
import br.com.webmarmo.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}