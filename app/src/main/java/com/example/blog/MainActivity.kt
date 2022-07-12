package com.example.blog

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val posts = ArrayList<Post>()

        posts.add(Post("Make design systems people want to use", "UI Design", R.drawable.one))
        posts.add(Post("Become a master in color palette", "UI Design", R.drawable.two))

        posts.add(Post("Become a master in color palette", "Backend Engineering", R.drawable.three))


        val rv = binding.rv
        rv.adapter = PostAdapter(posts)
        rv.layoutManager = LinearLayoutManager(this)

    }
}