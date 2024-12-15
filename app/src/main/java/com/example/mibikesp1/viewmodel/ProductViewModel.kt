package com.example.mibikesp1.viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.mibikesp1.database.ProductDatabase
import com.example.mibikesp1.model.Product
import com.example.mibikesp1.repository.ProductRepository

class ProductViewModel(private val repository: ProductRepository) : ViewModel() {


    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products


    fun getAllProducts() {
        viewModelScope.launch {
            try {
                _products.value = repository.getAllProducts()
            } catch (e: Exception) {

                _products.value = emptyList()
            }
        }
    }


}
