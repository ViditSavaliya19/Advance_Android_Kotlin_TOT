package com.example.advance_android_kotlin_tot.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.advance_android_kotlin_tot.App
import com.example.advance_android_kotlin_tot.DetailsActivity
import com.example.advance_android_kotlin_tot.R
import com.example.advance_android_kotlin_tot.databinding.FragmentChatBinding
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class ChatFragment : Fragment() {
    lateinit var binding: FragmentChatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatBinding.inflate(layoutInflater)

        var mode = AppCompatDelegate.getDefaultNightMode()

        if (mode == AppCompatDelegate.MODE_NIGHT_YES) {
            binding.switchTheme.isChecked = true
        }


        binding.switchTheme.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //Dark
                App.changeTheme(isChecked)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                //Light
                App.changeTheme(isChecked)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        initCarousel()

        binding.btnChat.setOnClickListener {
            var intent = Intent(activity, DetailsActivity::class.java)
            intent.putExtra("data", "Hello")
            startActivity(intent)

            Toast.makeText(activity, "Chat is Click", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

    private fun initCarousel() {

        var list = mutableListOf<CarouselItem>()

        list.add(
            CarouselItem(
                "https://i0.wp.com/picjumbo.com/wp-content/uploads/beautiful-nature-mountain-scenery-with-flowers-free-photo.jpg?w=600&quality=80",
                "Image 1"
            )
        )
        list.add(
            CarouselItem(
                "https://img.freepik.com/free-photo/wide-angle-shot-single-tree-growing-clouded-sky-during-sunset-surrounded-by-grass_181624-22807.jpg",
                "Image 2"
            )
        )
        list.add(
            CarouselItem(
                "https://media.istockphoto.com/id/584248074/photo/sunrise-over-mt-hood-at-trillium-lake.jpg?s=612x612&w=0&k=20&c=SphRF0izMKMS-efnhwdzn9anM9HtzXEhGAb2fKdkHY8=",
                "Image 3"
            )
        )
        list.add(
            CarouselItem(
                "https://media.istockphoto.com/id/1301592082/photo/beautiful-meadow-field-with-fresh-grass-and-yellow-dandelion-flowers-in-nature.webp?b=1&s=170667a&w=0&k=20&c=NQ7187Kjw4ND93c-oSw1S-U0-JGgA6KE6CxJx71Ah64=",
                "Image 4"
            )
        )

        binding.carousel.setData(list)

    }


}