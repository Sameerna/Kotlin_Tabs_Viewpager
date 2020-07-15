package com.example.viewpagerex

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager):FragmentPagerAdapter(fm) {
    override fun getItem (position: Int): Fragment {
        return when (position){
                0->{
                    Home()
                }
            1->{
                BasicsFragment()
            }
            2->{
                Investments()
            }
            else ->{
                LoanFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return  when (position){
            0->"Finance Home"
            1->"Basics"
            2->"Investments"
            else->{
                return "Loan"
            }
        }
    }
}