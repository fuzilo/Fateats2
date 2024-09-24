package com.fatec.fateats2.dao

import androidx.compose.runtime.mutableStateListOf
import com.fatec.fateats2.model.Product

class ProductDao {
        //companion object é uma função private
    companion object{
        private val products = mutableStateListOf<Product>()
    }

    fun products() = products.toList()

    fun save(product: Product){
        products.add(product)
    }

//    fun update(product: Product){
//        products.update(product)
//    }
//
//    fun delete(product: Product){
//        products.drop(product)
//    }
}