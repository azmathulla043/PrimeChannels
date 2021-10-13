package com.example.mychannels.Repository

import com.example.mychannels.Model.BookRecording
import com.example.mychannels.Model.CancelResponse
import com.example.mychannels.Model.Channels
import com.example.mychannels.Network.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class ChannelRepository @Inject
constructor(private val apiService: ApiService) {

    suspend fun getChannelData(): List<Channels> {
        return apiService.getProgramChannel()
    }

    suspend fun getRecordingResponse(): List<BookRecording> {
        return apiService.bookRecording()
    }


    suspend fun getCancelResposnse(): List<CancelResponse> {
        return apiService.cancelResponse()
    }


}