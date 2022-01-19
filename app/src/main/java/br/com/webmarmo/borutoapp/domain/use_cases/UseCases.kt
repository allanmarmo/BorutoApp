package br.com.webmarmo.borutoapp.domain.use_cases

import br.com.webmarmo.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase
)