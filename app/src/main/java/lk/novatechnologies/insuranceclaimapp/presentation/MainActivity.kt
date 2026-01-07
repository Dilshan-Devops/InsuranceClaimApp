package lk.novatechnologies.insuranceclaimapp.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import lk.novatechnologies.insuranceclaimapp.R
import lk.novatechnologies.insuranceclaimapp.databinding.ActivityMainBinding
import lk.novatechnologies.insuranceclaimapp.presentation.adapter.ClaimsAdapter
import lk.novatechnologies.insuranceclaimapp.presentation.viewmodel.ClaimsViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: ClaimsViewModel by viewModels()
    private lateinit var claimsAdapter: ClaimsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        observeViewModel()

        viewModel.getClaims()
    }

    private fun setupRecyclerView() {
        claimsAdapter = ClaimsAdapter(emptyList())
        binding.claimsRecyclerView.apply {
            adapter = claimsAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun observeViewModel() {
        viewModel.claims.observe(this) {
            claimsAdapter.updateClaims(it)
        }
    }
}