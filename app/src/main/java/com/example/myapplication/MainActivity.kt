package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main2.* // Make sure to import your
layout
class MainActivity2 : AppCompatActivity0 i
override fun onCreate(savedlnstanceState: Bundle?) t
super.onCreate(savedinstancestate)
setContentview/R.layout.activity main2)
button2.setOnClicklistener
val unitsConsumed = editTextNumber.text.toString0.tolntOrNull0
if (unitsConsumed != null)
val fixedCharge =150.0
val unitCost = 29.0
val vatRate =0.15
unitCost * unitsConsumed
val energyCharge
val vat = (fixedCharge + energyCharge) * vatRate
val totalBill fixedCharge + energyCharge + vat
textView.text = "Electricity Bill $totalBill LKR"
else
textView.text "Please enter valid units"