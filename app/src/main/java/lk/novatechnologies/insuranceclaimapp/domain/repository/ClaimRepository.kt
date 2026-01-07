package lk.novatechnologies.insuranceclaimapp.domain.repository

import lk.novatechnologies.insuranceclaimapp.domain.model.Claim

interface ClaimRepository {
    suspend fun getClaims(): List<Claim>
}