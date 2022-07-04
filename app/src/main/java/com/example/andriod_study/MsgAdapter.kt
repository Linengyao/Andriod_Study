package com.example.andriod_study

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.IllegalArgumentException

class MsgAdapter(private val msgList : List<Msg>) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    inner class LeftViewHolder(view:View):RecyclerView.ViewHolder(view){
        val leftMsg:TextView = view.findViewById(R.id.leftMsg)
    }

    inner class RightViewHolder(view:View):RecyclerView.ViewHolder(view){
        val rightMsg:TextView = view.findViewById(R.id.rightMsg)
    }

    override fun getItemCount() = msgList.size

    override fun getItemViewType(position: Int): Int {
        return msgList[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = if(viewType == Msg.TYPE_RECV){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_left_item_layout, parent, false)
            LeftViewHolder(view)
        }else{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.msg_right_item_layout2,parent, false)
            RightViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val msg = msgList[position]
        when(holder){
            is LeftViewHolder -> holder.leftMsg.text = msg.content
            is RightViewHolder ->holder.rightMsg.text = msg.content
            else -> throw  IllegalArgumentException()
        }
    }
}