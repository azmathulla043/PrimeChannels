package com.example.mychannels.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mychannels.Model.BookRecording
import com.example.mychannels.Model.CancelResponse
import com.example.mychannels.Model.Channels
import com.example.mychannels.Repository.ChannelRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChannelViewModel @Inject constructor(private val channelRepository: ChannelRepository) :
    ViewModel() {

    val ChannelLiveData: MutableLiveData<List<Channels>> = MutableLiveData()
    val ResposeLiveData: MutableLiveData<List<BookRecording>> = MutableLiveData()
    val CancelResponseLiveData: MutableLiveData<List<CancelResponse>> = MutableLiveData()

    fun getChannel() {
        viewModelScope.launch {
            val response = channelRepository.getChannelData()
            ChannelLiveData.value = response

        }
    }

    fun getCancelResponse() {
        viewModelScope.launch {
            val response = channelRepository.getCancelResposnse()
            CancelResponseLiveData.value = response

        }
    }
        fun getRecordingResponse() {
            viewModelScope.launch {
                val response = channelRepository.getRecordingResponse()
                ResposeLiveData.value = response

            }
        }

}



