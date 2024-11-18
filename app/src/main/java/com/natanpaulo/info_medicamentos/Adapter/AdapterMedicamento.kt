package com.natanpaulo.info_medicamentos.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natanpaulo.info_medicamentos.databinding.MedicamentoItemBinding
import com.natanpaulo.info_medicamentos.model.Medicamento

class AdapterMedicamento (private val context: Context,private val listaMedicamentos : MutableList<Medicamento>) :
    RecyclerView.Adapter<AdapterMedicamento.MedicamentoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicamentoViewHolder {
       val itemLista = MedicamentoItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MedicamentoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: MedicamentoViewHolder, position: Int) {
        holder.nome.text = listaMedicamentos[position].nome
        holder.foto.setImageResource(listaMedicamentos[position].foto!!)
    }

    override fun getItemCount() = listaMedicamentos.size

    inner class MedicamentoViewHolder(binding : MedicamentoItemBinding) : RecyclerView.ViewHolder(binding.root){
        val nome = binding.txtNome
        val foto = binding.ftMedicamento
    }
}





