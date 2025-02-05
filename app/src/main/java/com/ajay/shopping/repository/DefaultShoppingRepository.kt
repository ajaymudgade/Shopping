package com.ajay.shopping.repository

import androidx.lifecycle.LiveData
import com.ajay.shopping.data.local.ShoppingDao
import com.ajay.shopping.data.local.ShoppingItem
import com.ajay.shopping.data.remote.PixabayAPI
import com.ajay.shopping.data.remote.responses.ImageResponse
import com.ajay.shopping.other.Resource
import javax.inject.Inject

class DefaultShoppingRepository @Inject constructor(
    private val shoppingDao: ShoppingDao, private val pixabayAPI: PixabayAPI)
    : ShoppingRepository{
    override suspend fun insertShoppingItem(shoppingItem: ShoppingItem) {
        shoppingDao.insertShoppingItem(shoppingItem)
    }

    override suspend fun deleteShoppingItem(shoppingItem: ShoppingItem) {
        shoppingDao.deleteShoppingItem(shoppingItem)
    }

    override fun observeAllShoppingItems(): LiveData<List<ShoppingItem>> {
        return shoppingDao.observeAllShoppingItems()
    }

    override fun observeTotalPrice(): LiveData<Float> {
        return shoppingDao.observeTotalPrice()
    }

    override suspend fun searchForImage(imageQuery: String): Resource<ImageResponse> {
        return try {
            val response = pixabayAPI.searchForImage(imageQuery)
            if (response.isSuccessful){
                response.body()?.let {
                    return@let Resource.Success(it)
                } ?: Resource.Error("An unknown error occurred", null)
            }else{
                Resource.Error("An unknown error occurred", null)
            }
        }catch (e: Exception){
            Resource.Error("Couldn't reach the server. Check your internet connection", null)
        }
    }

}