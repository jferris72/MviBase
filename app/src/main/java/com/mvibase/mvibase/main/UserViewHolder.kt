package com.mvibase.mvibase.main

import android.support.v7.widget.RecyclerView
import android.view.View
import com.mvibase.mvibase.data.GithubUser
import kotlinx.android.synthetic.main.list_item_user.view.*


class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(user: GithubUser) = with(itemView) {
        login.text = user.login
        url.text = user.url
    }

}