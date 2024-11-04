package com.example.daggerhiltapp

import javax.inject.Inject

class CurrencyRepositoryImpl @Inject constructor() : CurrencyRepository {
    override fun getCurrencies(): List<Currency> {
        return listOf(
            Currency("USD", R.drawable.dolar),
            Currency("EUR", R.drawable.euro),
            Currency("JPY", R.drawable.jpy),
            Currency("JPY", R.drawable.cny),
            Currency("JPY", R.drawable.rup),
            Currency("JPY", R.drawable.rub),
            Currency("JPY", R.drawable.gbp),
            Currency("JPY", R.drawable.viethnam_dong),
        )
    }
}
