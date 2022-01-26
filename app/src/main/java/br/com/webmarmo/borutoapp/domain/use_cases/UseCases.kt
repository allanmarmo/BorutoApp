package br.com.webmarmo.borutoapp.domain.use_cases

import br.com.webmarmo.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase,
    val getSelectedHeroUseCase: GetSelectedHeroUseCase
)