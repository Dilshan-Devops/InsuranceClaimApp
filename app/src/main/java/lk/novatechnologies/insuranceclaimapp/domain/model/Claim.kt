package lk.novatechnologies.insuranceclaimapp.domain.model

data class Claim(
    val id: String,
    val policyNumber: String,
    val description: String,
    val status: String
)