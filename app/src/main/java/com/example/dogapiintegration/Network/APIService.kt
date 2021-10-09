package com.example.dogapiintegration.Network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getDogByBreeds(@Url url:String): Response<DogResponse>
}