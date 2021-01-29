package com.atritripathi.runnable.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.atritripathi.runnable.R
import com.atritripathi.runnable.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()
}