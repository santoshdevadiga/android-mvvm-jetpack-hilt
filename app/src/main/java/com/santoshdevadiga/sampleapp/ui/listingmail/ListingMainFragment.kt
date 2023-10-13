package com.santoshdevadiga.sampleapp.ui.listingmail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.santoshdevadiga.sampleapp.R

class ListingMainFragment : Fragment() {

    companion object {
        fun newInstance() = ListingMainFragment()
    }

    private lateinit var viewModel: ListingMainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_listing_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ListingMainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}