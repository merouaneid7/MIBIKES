package com.example.mibikesp1.database

import androidx.room.*
import com.example.mibikesp1.model.Product


@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(product: Product)

    @Query("SELECT * FROM products")
    suspend fun getAllProducts(): List<Product>

    @Delete
    suspend fun deleteProduct(product: Product)
}