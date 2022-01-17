package br.com.webmarmo.borutoapp.domain.use_cases.save_onboarding

import br.com.webmarmo.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed = completed)
    }
}