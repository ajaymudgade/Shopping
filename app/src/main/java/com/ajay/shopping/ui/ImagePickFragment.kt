package com.ajay.shopping.ui

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.ajay.shopping.R
import com.ajay.shopping.viewmodel.ShoppingViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class ImagePickFragment: Fragment(R.layout.fragment_image_pick) {

    private val TAG = "ShoppingFragment"
    private lateinit var viewModel: ShoppingViewModel
    private lateinit var etSearch: TextInputEditText
    private lateinit var rvImages: RecyclerView
    private lateinit var progressBar: ProgressBar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[ShoppingViewModel::class.java]

        etSearch = view.findViewById(R.id.etSearch)
        rvImages = view.findViewById(R.id.rvImages)
        progressBar = view.findViewById(R.id.progressBar)
    }
}