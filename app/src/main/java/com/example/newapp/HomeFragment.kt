package com.example.newapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMembers = listOf<MemberModel>(
            MemberModel("Hoang The Luan", "9th buildind, 2nd floor, maldiv road, manali 9th buildind, 2ndfloor", "90%", "220"),
            MemberModel("Le Van Duy", "9th buildind, 2nd floor, maldiv road, manali 9th buildind, 2ndfloor", "70%", "220"),
            MemberModel("Tran Van Khang", "9th buildind, 2nd floor, maldiv road, manali 9th buildind, 2ndfloor", "80%", "220"),
            MemberModel("Nguyen Danh Huy", "9th buildind, 2nd floor, maldiv road, manali 9th buildind, 2ndfloor", "89%", "220"),
            MemberModel("Le Van Thao", "9th buildind, 2nd floor, maldiv road, manali 9th buildind, 2ndfloor", "45%", "220"),
        )

        val adapter = MemberAdapter(listMembers)

        val recycler = requireView().findViewById<RecyclerView>(R.id.recycler_member)

        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}