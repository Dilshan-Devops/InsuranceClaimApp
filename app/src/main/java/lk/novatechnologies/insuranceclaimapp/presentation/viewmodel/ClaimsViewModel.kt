package lk.novatechnologies.insuranceclaimapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import lk.novatechnologies.insuranceclaimapp.domain.model.Claim
import lk.novatechnologies.insuranceclaimapp.domain.usecase.GetClaimsUseCase
import javax.inject.Inject

@HiltViewModel
class ClaimsViewModel @Inject constructor(
    private val getClaimsUseCase: GetClaimsUseCase
) : ViewModel() {

    private val _claims = MutableLiveData<List<Claim>>()
    val claims: LiveData<List<Claim>> = _claims

    fun getClaims() {
        viewModelScope.launch {
            _claims.value = getClaimsUseCase()
        }
    }
}