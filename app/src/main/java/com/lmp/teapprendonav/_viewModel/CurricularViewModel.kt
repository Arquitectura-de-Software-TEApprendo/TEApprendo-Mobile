package com.lmp.teapprendonav._viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lmp.teapprendonav._api.repository.CurricularRepository
import com.lmp.teapprendonav._model.data.TeachingUnit
import kotlinx.coroutines.launch

class CurricularViewModel : ViewModel() {
    private val repository = CurricularRepository()
    private val _teachingUnits = MutableLiveData<List<TeachingUnit>>()
    val teachingUnits: LiveData<List<TeachingUnit>> = _teachingUnits

    fun fetchTeachingUnits() {
        viewModelScope.launch {
            try {
                val cards = repository.getTeachingUnits()
                _teachingUnits.value = cards
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
} 