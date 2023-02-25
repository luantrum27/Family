package com.example.newapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberAdapter(private val listMembers: List<MemberModel>) : RecyclerView.Adapter<MemberAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return this.listMembers.size
    }

    override fun onBindViewHolder(holder: MemberAdapter.ViewHolder, position: Int) {
        val item = listMembers[position]
        holder.userName.text = item.userName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.item_member, parent, false)
        return ViewHolder(item)
    }

    class ViewHolder(private val item: View) : RecyclerView.ViewHolder(item) {
        val userAvatar = item.findViewById<ImageView>(R.id.user_avatar)
        val userName = item.findViewById<TextView>(R.id.user_name)
    }
}