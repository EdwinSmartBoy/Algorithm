package com.edwin.algorithm.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.edwin.algorithm.R
import com.edwin.algorithm.tree.BSTree

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tree = BSTree<Int>()
        tree.preOrder(null)
    }
}
