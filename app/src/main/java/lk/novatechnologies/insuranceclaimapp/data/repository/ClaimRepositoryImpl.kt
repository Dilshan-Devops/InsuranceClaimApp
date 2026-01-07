package lk.novatechnologies.insuranceclaimapp.data.repository

import lk.novatechnologies.insuranceclaimapp.data.source.ClaimLocalDataSource
import lk.novatechnologies.insuranceclaimapp.domain.model.Claim
import lk.novatechnologies.insuranceclaimapp.domain.repository.ClaimRepository

class ClaimRepositoryImpl(private val localDataSource: ClaimLocalDataSource) : ClaimRepository {
    override suspend fun getClaims(): List<Claim> {
        return localDataSource.getClaims()
    }
}