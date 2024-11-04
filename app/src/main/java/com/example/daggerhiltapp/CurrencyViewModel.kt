package com.example.daggerhiltapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CurrencyViewModel @Inject constructor(
    private val repository: CurrencyRepository
) : ViewModel() {

    private val _currencies = MutableLiveData<List<Currency>>()
    val currencies: LiveData<List<Currency>> = MutableLiveData(repository.getCurrencies())

    init {
        loadCurrencies()
    }

    fun loadCurrencies() {
        _currencies.value = repository.getCurrencies()
    }
}