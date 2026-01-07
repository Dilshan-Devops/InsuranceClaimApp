package lk.novatechnologies.insuranceclaimapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import lk.novatechnologies.insuranceclaimapp.data.repository.ClaimRepositoryImpl
import lk.novatechnologies.insuranceclaimapp.data.source.ClaimLocalDataSource
import lk.novatechnologies.insuranceclaimapp.domain.repository.ClaimRepository
import lk.novatechnologies.insuranceclaimapp.domain.usecase.GetClaimsUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideClaimLocalDataSource(): ClaimLocalDataSource {
        return ClaimLocalDataSource()
    }

    @Provides
    @Singleton
    fun provideClaimRepository(localDataSource: ClaimLocalDataSource): ClaimRepository {
        return ClaimRepositoryImpl(localDataSource)
    }

    @Provides
    @Singleton
    fun provideGetClaimsUseCase(repository: ClaimRepository): GetClaimsUseCase {
        return GetClaimsUseCase(repository)
    }
}