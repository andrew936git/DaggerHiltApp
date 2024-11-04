package com.example.daggerhiltapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerhiltapp.databinding.ActivityCurrencyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CurrencyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCurrencyBinding
    private val viewModel: CurrencyViewModel by viewModels()
    private lateinit var currencyAdapter: CurrencyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCurrencyBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        title = "Валюты мира"
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        currencyAdapter = CurrencyAdapter()
        binding.recyclerView.adapter = currencyAdapter

        viewModel.currencies.observe(this) { currencies ->
            currencyAdapter.setItems(currencies)
        }

        viewModel.loadCurrencies()

    }
}