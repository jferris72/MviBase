package com.mvibase.mvibase.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.mvibase.mvibase.R
import com.mvibase.mvibase.data.GithubUser


class UserAdapter(
    val users: List<GithubUser>
) : RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): UserViewHolder {
        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_user, parent, false))
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(viewHolder: UserViewHolder, position: Int) {
        viewHolder.bind(users[position])
    }
}