package lk.novatechnologies.insuranceclaimapp.domain.usecase

import lk.novatechnologies.insuranceclaimapp.domain.model.Claim
import lk.novatechnologies.insuranceclaimapp.domain.repository.ClaimRepository

class GetClaimsUseCase(private val repository: ClaimRepository) {
    suspend operator fun invoke(): List<Claim> {
        return repository.getClaims()
    }
}