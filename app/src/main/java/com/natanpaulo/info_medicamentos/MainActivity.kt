package com.natanpaulo.info_medicamentos

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.natanpaulo.info_medicamentos.Adapter.AdapterMedicamento
import com.natanpaulo.info_medicamentos.databinding.ActivityMainBinding
import com.natanpaulo.info_medicamentos.model.Medicamento

class MainActivity : AppCompatActivity() {

    private lateinit var bc : ActivityMainBinding;
    private lateinit var adapterMedicamento: AdapterMedicamento
    private val  listaMedicamentos : MutableList<Medicamento> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        bc = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bc.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    val recyclerMedicamentos = bc.recyclerMedicamentos
        recyclerMedicamentos.layoutManager =  LinearLayoutManager(this)
        recyclerMedicamentos.setHasFixedSize(true)
        adapterMedicamento = AdapterMedicamento(this,listaMedicamentos)
        recyclerMedicamentos.adapter = adapterMedicamento
        getMedicamentos()

    }

    private fun getMedicamentos(){
        val medicamento1 = Medicamento(R.drawable.dipirona,"Dipirona")
        listaMedicamentos.add(medicamento1)

        val medicamento2 = Medicamento(R.drawable.dorflex,"Dorflex")
        listaMedicamentos.add(medicamento2)

        val medicamento3 = Medicamento(R.drawable.paracetamol,"Paracetamol")
        listaMedicamentos.add(medicamento3)

        val medicamento4 = Medicamento(R.drawable.tadalafila,"Tadalafila")
        listaMedicamentos.add(medicamento4)

        val medicamento5 = Medicamento(R.drawable.losartana,"Losartana")
        listaMedicamentos.add(medicamento5)

        val medicamento6 = Medicamento(R.drawable.rivotril,"Rivotril")
        listaMedicamentos.add(medicamento6)
    }
}