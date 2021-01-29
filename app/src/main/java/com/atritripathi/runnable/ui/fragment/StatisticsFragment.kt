package com.atritripathi.runnable.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.atritripathi.runnable.R
import com.atritripathi.runnable.ui.viewmodel.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}