package com.example.mianhua.ui.dashboard

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    fun onTakePhotoSucceed(context: Context, uri: Uri) {
        val bytes = context.contentResolver.openInputStream(uri)?.use {
            it.readBytes()
        } ?: return
        processImageBytes(bytes)
    }

    private fun processImageBytes(bytes: ByteArray) {
        // 处理算法逻辑
        Log.d("DashboardViewModel", "bytes size: ${bytes.size}")
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}