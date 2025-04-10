package com.seekho.base

import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.seekho.viewmodel.AnimeViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Ritik on: 09/04/25
 * The base fragment class for all fragments.
 */
@AndroidEntryPoint
open class BaseFragment : Fragment() {
    /**
     * Holds instance of view model.
     */
    val animeViewModel: AnimeViewModel by viewModels()

    /**
     * Shows toast message.
     */
    fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

}