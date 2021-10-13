package com.example.mychannels.Network

import com.example.mychannels.Model.BookRecording
import com.example.mychannels.Model.CancelResponse
import com.example.mychannels.Model.Channels
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("programs?channel_number=3")
    suspend fun getProgramChannel(): List<Channels>

    @POST("/recording?channel_number=1&program_id=1234")
    suspend fun cancelResponse(): List<CancelResponse>

      @POST("/recording?recording_id=3456")
      suspend fun bookRecording(): List<BookRecording>
}