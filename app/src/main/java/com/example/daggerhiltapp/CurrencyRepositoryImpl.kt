package com.example.daggerhiltapp

import javax.inject.Inject

class CurrencyRepositoryImpl @Inject constructor() : CurrencyRepository {
    override fun getCurrencies(): List<Currency> {
        return listOf(
            Currency("Доллар", R.drawable.dolar),
            Currency("Евро", R.drawable.euro),
            Currency("Йена", R.drawable.jpy),
            Currency("Юань", R.drawable.cny),
            Currency("Рупий", R.drawable.rup),
            Currency("Рубль", R.drawable.rub),
            Currency("Фунт Стерлингов", R.drawable.gbp),
            Currency("Вьетнамский донг", R.drawable.viethnam_dong),
        )
    }
}
