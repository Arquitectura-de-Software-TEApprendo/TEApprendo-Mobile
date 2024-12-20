package com.lmp.teapprendonav._api.service

import com.lmp.teapprendonav._api.util.ApiConstants
import com.lmp.teapprendonav._model.data.TeachingUnit
import retrofit2.http.GET

interface CurricularService {
    @GET(ApiConstants.CURRICULAR_END_POINT)
    suspend fun getTeachingUnits() : List<TeachingUnit>
}