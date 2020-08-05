package com.binar.synrgyrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val clubOfEngland = arrayListOf(
        FootballClub("liverpool", 21),
        FootballClub("Manchester City", 21),
        FootballClub("Manchester United", 21),
        FootballClub("Chelsea", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21)
    )


    private val clubOfSpain = arrayListOf(
        FootballClub("Manchester City", 21),
        FootballClub("Manchester United", 21),
        FootballClub("Chelsea", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21),
        FootballClub("Liecester City", 21)
    )

    private val adapter1 = FootballClubAdapter(clubOfSpain)
    private val adapter2 = FootballClubAdapter(clubOfEngland)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup.setOnCheckedChangeListener { radioGroup, checkId ->
            when (checkId) {
                R.id.linear -> {
                    val layoutManagerLinear =
                        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                    recylerView.layoutManager = layoutManagerLinear
                    recylerView.adapter = adapter1
                }
                R.id.grid -> {
                    val layoutManagerGrid = GridLayoutManager(this, 3)
                    recylerView.layoutManager = layoutManagerGrid
                    recylerView.adapter = adapter2
                }
            }
        }
    }
}