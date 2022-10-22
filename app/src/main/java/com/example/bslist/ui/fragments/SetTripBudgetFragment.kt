package com.example.bslist.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bslist.R
import com.example.bslist.databinding.FragmentSetBudgetBinding

/**
 * @author : Mingaleev D
 * @data : 22/10/2022
 */

class SetTripBudgetFragment:Fragment(R.layout.fragment_set_budget) {

   private var mBinding:FragmentSetBudgetBinding? = null
   private val binding get() = mBinding!!

   override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?
   ): View {
      mBinding = FragmentSetBudgetBinding.inflate(inflater, container, false)
      return binding.root
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)

   }

   override fun onDestroy() {
      super.onDestroy()
      mBinding = null
   }
}