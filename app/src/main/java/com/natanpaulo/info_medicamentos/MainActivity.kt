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
        val medicamento1 = Medicamento(R.drawable.dipirona,"dipirona")
        listaMedicamentos.add(medicamento1)

        val medicamento2 = Medicamento(R.drawable.dorflex,"dorflex")
        listaMedicamentos.add(medicamento2)

        val medicamento3 = Medicamento(R.drawable.paracetamol,"paracetamol")
        listaMedicamentos.add(medicamento3)

        val medicamento4 = Medicamento(R.drawable.tadalafila,"tadalafila")
        listaMedicamentos.add(medicamento4)

        val medicamento5 = Medicamento(R.drawable.losartana,"losartana")
        listaMedicamentos.add(medicamento5)

        val medicamento6 = Medicamento(R.drawable.rivotril,"rivotril")
        listaMedicamentos.add(medicamento6)

        val medicamento7 = Medicamento(R.drawable.cloreto,"soro fisiológico")
        listaMedicamentos.add(medicamento7)

        val medicamento8 = Medicamento(R.drawable.ibuprofeno,"ibuprofeno")
        listaMedicamentos.add(medicamento8)

        val medicamento9 = Medicamento(R.drawable.buscopan,"buscopan")
        listaMedicamentos.add(medicamento9)

        val medicamento10 = Medicamento(R.drawable.ozempic,"ozempic")
        listaMedicamentos.add(medicamento10)



    }
}