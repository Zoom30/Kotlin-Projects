package com.example.ageinmins

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private var selectedDateTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker: Button = findViewById<Button>(R.id.calculateButton)
        selectedDateTextView = findViewById<TextView>(R.id.dateText)
        btnDatePicker.setOnClickListener {
            clickDatePicker()
        }
    }

    fun clickDatePicker(){
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{
                    view, year, month, dateOfMonth ->
                val selectedDate = "$dateOfMonth/$month/$year"
                selectedDateTextView?.text = selectedDate



            }, year, month, day).show()
    }
}