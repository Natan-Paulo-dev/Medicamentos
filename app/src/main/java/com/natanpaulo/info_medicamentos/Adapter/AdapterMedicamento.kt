package com.natanpaulo.info_medicamentos.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natanpaulo.info_medicamentos.R

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


        //evento de click dos itens da lista
        holder.nome.setOnClickListener{
          if (holder.nome.text == "dipirona"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Dipirona::class.java)
              context.startActivity(intent)

          }else if (holder.nome.text == "losartana"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Losartana::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "buscopan"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Buscopan::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "soro fisiológico"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.CloretoDeSodio::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "dipirona"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Dipirona::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "dorflex"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Dorflex::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "ibuprofeno"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Ibuprofeno::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "ozempic"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Ozempic::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "paracetamol"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Paracetamol::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "rivotril"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Rivotril::class.java)
              context.startActivity(intent)
          }else if (holder.nome.text == "tadalafila"){
              val intent = Intent(context, com.natanpaulo.info_medicamentos.Tadalafila::class.java)
              context.startActivity(intent)
          }
        }


    }

    override fun getItemCount() = listaMedicamentos.size

    inner class MedicamentoViewHolder(binding : MedicamentoItemBinding) : RecyclerView.ViewHolder(binding.root){
        val nome = binding.txtNome
        val foto = binding.ftMedicamento

    }
}





