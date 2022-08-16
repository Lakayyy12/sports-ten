package com.application.tablayout.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.application.Navigator
import com.application.earnmoneyhome.R


class FragmentWay : Fragment(), View.OnClickListener {

    private var wayView: View? = null
    private var ways001: ImageButton? = null
    private var ways002: ImageButton? = null
    private var ways003: ImageButton? = null
    private var ways004: ImageButton? = null
    private var ways005: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        wayView = inflater.inflate(R.layout.fragment_way, container, false)
        initComponents()
        initListener()
        return wayView
    }
    private fun initComponents(){
        ways001 = wayView?.findViewById(R.id.ways001)
        ways002 = wayView?.findViewById(R.id.ways002)
        ways003 = wayView?.findViewById(R.id.ways003)
        ways004 = wayView?.findViewById(R.id.ways004)
        ways005 = wayView?.findViewById(R.id.ways005)
    }

    private fun initListener(){
        ways001?.setOnClickListener(this)
        ways002?.setOnClickListener(this)
        ways003?.setOnClickListener(this)
        ways004?.setOnClickListener(this)
        ways005?.setOnClickListener(this)
    }
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.ways001 -> Navigator.showContent(context, getString(R.string.ways1))
            R.id.ways002 -> Navigator.showContent(context, getString(R.string.ways2))
            R.id.ways003 -> Navigator.showContent(context, getString(R.string.ways3))
            R.id.ways004 -> Navigator.showContent(context, getString(R.string.ways4))
            R.id.ways005 -> Navigator.showContent(context, getString(R.string.ways5))
        }
    }
}