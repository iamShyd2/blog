package com.example.blog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private val posts: ArrayList<Post>): RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val category = itemView.findViewById<TextView>(R.id.category)
        val title = itemView.findViewById<TextView>(R.id.title)
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val postView = inflater.inflate(R.layout.post, parent, false)
        return ViewHolder(postView)
    }

    override fun onBindViewHolder(holder: PostAdapter.ViewHolder, position: Int) {
        val post = posts[position]
        holder.category.text = post.category
        holder.title.text = post.title
        holder.imageView.setImageResource(post.image)
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}