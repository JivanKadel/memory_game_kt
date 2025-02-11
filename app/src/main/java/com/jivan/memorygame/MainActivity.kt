package com.jivan.memorygame

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBoard: RecyclerView;
    private lateinit var tvNumOfMoves: TextView;
    private lateinit var tvNumOfPairs: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rvBoard = findViewById(R.id.recyclerViewBoard);
        tvNumOfMoves = findViewById(R.id.textViewNumOfMoves);
        tvNumOfPairs = findViewById(R.id.textViewNumOfPairs);

        rvBoard.adapter = MemoryBoardAdapter(this, 8);
        rvBoard.setHasFixedSize(true);
        rvBoard.layoutManager = GridLayoutManager(this, 2);

    }
}