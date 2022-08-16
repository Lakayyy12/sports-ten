package com.application.tablayout.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil.setContentView
import com.application.Navigator
import com.application.Navigator.Companion.openPage
import com.application.earnmoneyhome.GuidesPage
import com.application.earnmoneyhome.R


class FragmentGuide : Fragment(), View.OnClickListener {

    private var gd1: Button? = null
    private var gd2: Button? = null
    private var gd3: Button? = null
    private var gd4: Button? = null
    private var gd5: Button? = null
    
    private var getView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        getView = inflater.inflate(R.layout.fragment_guide, container, false)
        initComponents()
        initListener()
        return getView
    }

    private fun initComponents(){
        gd1 = getView?.findViewById(R.id.gd1)
        gd2 = getView?.findViewById(R.id.gd2)
        gd3 = getView?.findViewById(R.id.gd3)
        gd4 = getView?.findViewById(R.id.gd4)
        gd5 = getView?.findViewById(R.id.gd5)
    }

    private fun initListener(){
        gd1?.setOnClickListener(this)
        gd2?.setOnClickListener(this)
        gd3?.setOnClickListener(this)
        gd4?.setOnClickListener(this)
        gd5?.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.gd1 -> openPage(context, GuidesPage::class.java, gd1?.text.toString(), "${getString(R.string.guides1)} ${getString(R.string.guide3)} ${getString(R.string.guide5)}")
            R.id.gd2 -> openPage(context, GuidesPage::class.java, gd2?.text.toString(), "${getString(R.string.guides2)} ${getString(R.string.guides1)}")
            R.id.gd3 -> openPage(context, GuidesPage::class.java, gd3?.text.toString(), "${getString(R.string.guide4)} ${getString(R.string.guide3)} ${getString(R.string.guides1)} ")
            R.id.gd4 -> openPage(context, GuidesPage::class.java, gd4?.text.toString(), "${getString(R.string.guide5)} ${getString(R.string.guide4)}")
            R.id.gd5 -> openPage(context, GuidesPage::class.java, gd5?.text.toString(), "${getString(R.string.guide3)} ${getString(R.string.guides2)}")
        }
    }
}