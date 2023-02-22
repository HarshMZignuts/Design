package com.example.onlydesigntask

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.onlydesigntask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var navController: NavController
    private lateinit var appBarConfig: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.bottomNavBar.background = null
//        binding.bottomNavBar.menu.getItem(2).isEnabled = false

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//
//            getWindow().setFlags(
//                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//            );
//        }
        val navHosteFragment = supportFragmentManager.findFragmentById(
            R.id.fragment
        ) as NavHostFragment


        navController = navHosteFragment.navController
        binding.customBottomNavBottomNav.setupWithNavController(navController)
        appBarConfig = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.appoinmentCalFragment,
                R.id.finianceFragment,
                R.id.chatsFragment,
                //R.id.chatFragment
            )
        )
        setOnClick()
        setCurrentDestinationListener()


    }

    private fun setOnClick(){
        binding.customNavCal.setOnClickListener {
            binding.customBottomNavBottomNav.selectedItemId = R.id.appoinmentCalFragment
        }
        binding.customNavFinice.setOnClickListener {
            binding.customBottomNavBottomNav.selectedItemId = R.id.finianceFragment
        }
        binding.customNavFavouritesFab.setOnClickListener {
            binding.customBottomNavBottomNav.selectedItemId = R.id.homeFragment
        }
        binding.customNavMsg.setOnClickListener {
            binding.customBottomNavBottomNav.selectedItemId = R.id.chatsFragment
        }
    }
    private fun setCurrentDestinationListener(){
        navController.addOnDestinationChangedListener{_, destination, _ ->
           deselectAllTabs()
            when(destination.id){
                R.id.homeFragment -> {
                    binding.customNavFavouritesFab.isSelected = true
                }
                R.id.appoinmentCalFragment -> {
                    binding.customNavCal.isSelected = true
                }
                R.id.finianceFragment -> {
                    binding.customNavFinice.isSelected =true
                }
                R.id.chatsFragment -> {
                    binding.customNavMsg.isSelected = true
                }
            }
            when(destination.id){
                    R.id.homeFragment,
                    R.id.appoinmentCalFragment,
                    R.id.finianceFragment,
                    R.id.chatsFragment-> {
                        binding.customBottomNavLinearLayout.isVisible = true
                        binding.customNavFavouritesFab.isVisible = true
                    }
                else ->{
                    binding.customBottomNavLinearLayout.isVisible = false
                    binding.customNavFavouritesFab.isVisible = false
            }

               }
        }

    }
    private fun deselectAllTabs(){

        binding.customNavCal.isSelected = false
        binding.customNavFinice.isSelected = false
        binding.customNavFavouritesFab.isSelected = false
        binding.customNavMsg.isSelected = false
    }

}