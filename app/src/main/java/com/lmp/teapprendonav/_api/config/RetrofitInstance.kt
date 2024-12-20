package com.lmp.teapprendonav._api.config

import com.lmp.teapprendonav._api.service.CurricularService
import com.lmp.teapprendonav._api.util.ApiConstants.BASE_URL
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object RetrofitInstance {
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val curricularService: CurricularService by lazy {
        retrofit.create(CurricularService::class.java)
    }
}