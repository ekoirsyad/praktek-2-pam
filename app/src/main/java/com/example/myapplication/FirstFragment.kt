package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    private fun submitData(){
        val userName = binding.editUsername.text.toString()
        val email = binding.editEmail.text.toString()
        val phone = binding.editPhone.text.toString()
        val password = binding.editPassword.text.toString()

        Log.d("Name", userName)
        Log.d("Email", email)
        Log.d("Phone", phone)
        Log.d("Password", password)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSubmit.setOnClickListener {
            submitData()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}