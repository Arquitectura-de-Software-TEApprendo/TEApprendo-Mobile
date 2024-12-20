package com.lmp.teapprendonav._api.repository

import com.lmp.teapprendonav._api.config.RetrofitInstance
import com.lmp.teapprendonav._model.data.TeachingUnit

class CurricularRepository {
    private val creditCardService = RetrofitInstance.curricularService

    suspend fun getTeachingUnits(): List<TeachingUnit> {
        return creditCardService.getTeachingUnits()
    }
}