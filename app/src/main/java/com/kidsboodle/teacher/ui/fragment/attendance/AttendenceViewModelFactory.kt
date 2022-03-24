package com.kidsboodle.teacher.ui.fragment.attendance

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.kidsboodle.teacher.data.Resource
import com.kidsboodle.teacher.data.api.ApiHelper
import com.kidsboodle.teacher.data.model.login.LoginRequest
import com.kidsboodle.teacher.data.repository.MainRepository
import kotlinx.coroutines.Dispatchers

class AttendenceViewModelFactory(private val apiHelper: ApiHelper) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        AttendanceViewModel(MainRepository(apiHelper)) as T
}