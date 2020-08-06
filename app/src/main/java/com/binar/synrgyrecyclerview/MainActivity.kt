package com.binar.synrgyrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val clubOfEngland = arrayListOf(
        FootballClub("Manchester United", "Manchester",R.drawable.manchester_united),
        FootballClub("Manchester City", "Manchester",R.drawable.manchester_city),
        FootballClub("Liverpool", "Liverpool",R.drawable.liverpool),
        FootballClub("Chelsea", "London",R.drawable.chelsea),
        FootballClub("Arsenal", "London",R.drawable.arsenal),
        FootballClub("Leicester City", "Leicester",R.drawable.leicester),
        FootballClub("Tottenham Hotspurs", "Tottenham",R.drawable.tot),
        FootballClub("Wolves", "Wolves",R.drawable.wolves),
        FootballClub("Everton", "London",R.drawable.everton),
        FootballClub("Southamton", "Southamton",R.drawable.soton),
        FootballClub("West Ham United", "Stratford",R.drawable.westham)
    )

//    private val clubOfSpain = arrayListOf(
//        FootballClub("Manchester United", "Manchester",R.drawable.manchester_united),
//        FootballClub("Manchester City", "Manchester",R.drawable.manchester_city),
//        FootballClub("Liverpool", "Liverpool",R.drawable.liverpool),
//        FootballClub("Chelsea", "London",R.drawable.chelsea),
//        FootballClub("Arsenal", "London",R.drawable.arsenal),
//        FootballClub("Leicester City", "Leicester",R.drawable.leicester),
//        FootballClub("Tottenham Hotspurs", "Tottenham",R.drawable.tot),
//        FootballClub("Wolves", "Wolves",R.drawable.wolves),
//        FootballClub("Everton", "London",R.drawable.everton),
//        FootballClub("Southamton", "Southamton",R.drawable.soton),
//        FootballClub("West Ham United", "Stratford",R.drawable.westham)
//    )

    private val adapter1 = FootballClubAdapter(clubOfEngland)
   // private val adapter2 = FootballClubAdapter(clubOfSpain)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup.setOnCheckedChangeListener { radioGroup, checkId ->
            when (checkId) {
                R.id.linear -> {
                    val layoutManagerLinear = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                    recylerView.layoutManager = layoutManagerLinear
                    recylerView.adapter = adapter1
                }
                R.id.grid -> {
                    val layoutManagerGrid = GridLayoutManager(this, 3)
                    recylerView.layoutManager = layoutManagerGrid
                    recylerView.adapter = adapter1
                }
            }
        }
    }
}