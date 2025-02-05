package com.ajay.shopping.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.ajay.shopping.R
import com.ajay.shopping.viewmodel.ShoppingViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textview.MaterialTextView

class ShoppingFragment: Fragment(R.layout.fragment_shopping) {

    private val TAG = "ShoppingFragment"
    private lateinit var viewModel: ShoppingViewModel
    private lateinit var rvShoppingItems: RecyclerView
    private lateinit var tvShoppingItemPrice: MaterialTextView
    private lateinit var fabAddShoppingItem: FloatingActionButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[ShoppingViewModel::class.java]

        rvShoppingItems = view.findViewById(R.id.rvShoppingItems)
        tvShoppingItemPrice = view.findViewById(R.id.tvShoppingItemPrice)
        fabAddShoppingItem = view.findViewById(R.id.fabAddShoppingItem)
    }
}