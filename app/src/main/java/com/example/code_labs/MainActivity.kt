package com.example.code_labs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    //Create our four fragments object
    lateinit var homeFragment: home
    lateinit var puzzleFragment: puzzle
    lateinit var visaulizeFragment: visualizer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //now let's create our framelayout and bottomnav variables
        var bottomnav = findViewById<BottomNavigationView>(R.id.BottomNavMenu)
        var frame = findViewById<FrameLayout>(R.id.frameLayout)
        //Now let's the deffault Fragment
        homeFragment = home()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout,homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
        //now we will need to create our different fragemnts
        //Now let's add the menu evenet listener
        bottomnav.setOnNavigationItemSelectedListener { item ->
            //we will select each menu item and add an event when it's selected
            when(item.itemId){
                R.id.home -> {
                    homeFragment = home()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frameLayout,homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.favorite -> {
                    puzzleFragment = puzzle()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frameLayout,puzzleFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.profile -> {
                    visaulizeFragment = visualizer()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frameLayout,visaulizeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

            }

            true
        }
        //Now let's Run our App
    }
}