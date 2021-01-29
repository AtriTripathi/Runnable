package com.atritripathi.runnable.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.atritripathi.runnable.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

}