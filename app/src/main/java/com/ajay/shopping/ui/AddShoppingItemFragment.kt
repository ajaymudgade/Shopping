package com.ajay.shopping.ui

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.ajay.shopping.R
import com.ajay.shopping.viewmodel.ShoppingViewModel
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class AddShoppingItemFragment: Fragment(R.layout.fragment_add_shopping_item) {
    private val TAG = "ShoppingFragment"
    private lateinit var viewModel: ShoppingViewModel
    private lateinit var ivShoppingImage: ImageView
    private lateinit var etShoppingItemName: TextInputEditText
    private lateinit var etShoppingItemAmount: TextInputEditText
    private lateinit var etShoppingItemPrice: TextInputEditText
    private lateinit var btnAddShoppingItem: MaterialButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[ShoppingViewModel::class.java]

        ivShoppingImage = view.findViewById(R.id.ivShoppingImage)
        etShoppingItemName = view.findViewById(R.id.etShoppingItemName)
        etShoppingItemAmount = view.findViewById(R.id.etShoppingItemAmount)
        etShoppingItemPrice = view.findViewById(R.id.etShoppingItemPrice)
        btnAddShoppingItem = view.findViewById(R.id.btnAddShoppingItem)
    }
}