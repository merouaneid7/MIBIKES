package com.example.mibikesp1.repository

import com.example.mibikesp1.database.ProductDao
import com.example.mibikesp1.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductRepository(private val productDao: ProductDao) {


    suspend fun insertProduct(product: Product) = withContext(Dispatchers.IO) {
        productDao.insertProduct(product)
    }


    suspend fun getAllProducts(): List<Product> = withContext(Dispatchers.IO) {
        productDao.getAllProducts()
    }


    suspend fun deleteProduct(product: Product) = withContext(Dispatchers.IO) {
        productDao.deleteProduct(product)
    }


}