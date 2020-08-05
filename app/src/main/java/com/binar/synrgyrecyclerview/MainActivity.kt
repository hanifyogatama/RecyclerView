package com.binar.synrgyrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val clubOfEngland = arrayListOf(
        FootballClub("Manchester United", "Menchester",R.drawable.epl),
        FootballClub("Manchester City", "Menchester",R.drawable.epl),
        FootballClub("Liverpool", "Liverpool",R.drawable.epl),
        FootballClub("Chelsea", "Lodon",R.drawable.epl),
        FootballClub("Arsenal", "London",R.drawable.epl),
        FootballClub("Leicester City", "Leicester",R.drawable.epl),
        FootballClub("Tottenham Hotspurs", "Tottenham",R.drawable.epl),
        FootballClub("Wolves", "Wolves",R.drawable.epl),
        FootballClub("Everton", "London",R.drawable.epl),
        FootballClub("Southamton", "Southamton",R.drawable.epl),
        FootballClub("West Ham United", "Stratford",R.drawable.epl)
    )


    private val clubOfSpain = arrayListOf(
        FootballClub("Real Madrid", "Madrid",R.drawable.ic_laliga),
        FootballClub("Fc Barcelona", "Barcelona",R.drawable.ic_laliga),
        FootballClub("Atletico de Madrid", "Madrid",R.drawable.ic_laliga),
        FootballClub("Atletico Bilbao", "Bilbao",R.drawable.ic_laliga),
        FootballClub("Villareal", "Vilareal",R.drawable.ic_laliga),
        FootballClub("Sevilla", "Sevilla",R.drawable.ic_laliga),
        FootballClub("Valencia", "Valencia",R.drawable.ic_laliga),
        FootballClub("Getafe", "Getafe",R.drawable.ic_laliga),
        FootballClub("Granada", "Granada",R.drawable.ic_laliga),
        FootballClub("Espanyol", "Espanyol",R.drawable.ic_laliga)
    )

    private val adapter1 = FootballClubAdapter(clubOfEngland)
    private val adapter2 = FootballClubAdapter(clubOfSpain)

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