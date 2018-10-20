package com.example.dell.fragmentos


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class PrimerFragment : Fragment() {
    lateinit var btn:Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val vw:View=inflater.inflate(R.layout.fragment_primer, container, false)
        btn=vw.findViewById(R.id.btnFragment)
        btn.setOnClickListener {
            val intent:Intent=Intent(context,SecondActivity::class.java)
            startActivity(intent)
        }
        return vw
    }


}
