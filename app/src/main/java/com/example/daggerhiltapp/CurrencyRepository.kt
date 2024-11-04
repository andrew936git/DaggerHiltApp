package com.example.daggerhiltapp

interface CurrencyRepository {
    fun getCurrencies(): List<Currency>
}