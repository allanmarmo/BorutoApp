package br.com.webmarmo.borutoapp.di

import android.content.Context
import br.com.webmarmo.borutoapp.data.repository.DataStoreOperationsImpl
import br.com.webmarmo.borutoapp.data.repository.Repository
import br.com.webmarmo.borutoapp.domain.repository.DataStoreOperations
import br.com.webmarmo.borutoapp.domain.use_cases.UseCases
import br.com.webmarmo.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import br.com.webmarmo.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository),
            searchHeroesUseCase = SearchHeroesUseCase(repository),
            getSelectedHeroUseCase = GetSelectedHeroUseCase(repository)
        )
    }
}