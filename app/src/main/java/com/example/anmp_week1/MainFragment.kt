package com.example.anmp_week1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.anmp_week1.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding //nama fragment harus sama. Dan binding ini wajib ada di setiap fragment dan Activity sodara
    override fun onCreateView( //ngeloading layput
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //diapnggil stlh layout ter loaded. Jadi wajib ada func ini
        super.onViewCreated(view, savedInstanceState)

        binding.btnOption.setOnClickListener{
            val action = MainFragmentDirections.actionOptionFragment() //artinya btnStart diklik, dia mengarah dari fragmentMain ke fragmentGame
            Navigation.findNavController(it).navigate(action)
        }
        binding.btnStart.setOnClickListener{
            val name = binding.editName.text.toString()
            val action = MainFragmentDirections.actionGameFragment(name) //artinya btnStart diklik, dia mengarah dari fragmentMain ke fragmentGame
            Navigation.findNavController(it).navigate(action)
        }
    }

}