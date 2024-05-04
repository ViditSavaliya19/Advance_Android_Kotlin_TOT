package com.example.advance_android_kotlin_tot

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.advance_android_kotlin_tot.adapter.TabAdapter
import com.example.advance_android_kotlin_tot.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class MainActivity : AppCompatActivity() {

    lateinit var bindings: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindings.root)

        initDrawer()

        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        var viewPager = findViewById<ViewPager2>(R.id.viewPager)

        tabLayout.addTab(tabLayout.newTab().setText("Chat"))
        tabLayout.addTab(tabLayout.newTab().setText("Status"))

        var adapter = TabAdapter(this)
        viewPager.adapter = adapter

        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(p0: TabLayout.Tab?) {
                viewPager.currentItem = p0!!.position
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabReselected(p0: TabLayout.Tab?) {

            }
        })

    }

    private fun initDrawer() {

        bindings.imgMenu.setOnClickListener {
            bindings.drawerLayout.openDrawer(Gravity.END)
        }

        bindings.navL1.setOnClickListener {
            Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show()
        }


    }


}

//        bindings.navView.setNavigationItemSelectedListener {
//
//            if(it.itemId == R.id.navHome)
//            {
//                Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show()
//            }else if(it.itemId == R.id.navProfile)
//            {
//                Toast.makeText(this@MainActivity, "Profile", Toast.LENGTH_SHORT).show()
//            } else if(it.itemId == R.id.navSettings)
//            {
//                Toast.makeText(this@MainActivity, "Settings", Toast.LENGTH_SHORT).show()
//            }else if(it.itemId == R.id.navAboutUs)
//            {
//                Toast.makeText(this@MainActivity, "About US", Toast.LENGTH_SHORT).show()
//            }
//
//            return@setNavigationItemSelectedListener true
//        }