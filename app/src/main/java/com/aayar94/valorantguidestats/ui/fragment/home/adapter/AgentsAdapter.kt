package com.aayar94.valorantguidestats.ui.fragment.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.aayar94.valorantguidestats.data.models.Agent
import com.aayar94.valorantguidestats.data.models.BaseModel
import com.aayar94.valorantguidestats.databinding.RowLayoutAgentsBinding

class AgentsAdapter(private val onClick: (agent: Agent) -> Unit) :
    RecyclerView.Adapter<AgentsAdapter.AgentsViewHolder>() {
    private var agentsList: MutableList<Array<Agent>> = mutableListOf()


    inner class AgentsViewHolder(private val binding: RowLayoutAgentsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.carouselImageView.load(agentsList[0][position].fullPortrait)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgentsViewHolder {
        val binding =
            RowLayoutAgentsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AgentsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return agentsList.count()
    }

    override fun onBindViewHolder(holder: AgentsViewHolder, position: Int) {
        holder.bind(position)
    }

    fun setData(list: BaseModel<Array<Agent>>) {
        agentsList = mutableListOf(list.data)
    }
}