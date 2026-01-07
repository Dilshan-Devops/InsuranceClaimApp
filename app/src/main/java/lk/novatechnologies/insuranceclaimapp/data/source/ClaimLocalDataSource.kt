package lk.novatechnologies.insuranceclaimapp.data.source

import kotlinx.coroutines.delay
import lk.novatechnologies.insuranceclaimapp.domain.model.Claim

class ClaimLocalDataSource {
    suspend fun getClaims(): List<Claim> {
        // For now, we'll return a hardcoded list of claims.
        delay(1500) // Simulate network delay
        return listOf(
            Claim("1", "POL123", "Accident", "Pending"),
            Claim("2", "POL456", "Theft", "Approved"),
            Claim("3", "POL789", "Accident", "Rejected")
        )
    }
}