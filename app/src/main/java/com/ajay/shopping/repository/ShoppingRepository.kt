package com.ajay.shopping.repository

import androidx.lifecycle.LiveData
import com.ajay.shopping.data.local.ShoppingItem
import com.ajay.shopping.data.remote.responses.ImageResponse
import com.ajay.shopping.other.Resource

interface ShoppingRepository {
    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

     fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

     fun observeTotalPrice(): LiveData<Float>

     suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}