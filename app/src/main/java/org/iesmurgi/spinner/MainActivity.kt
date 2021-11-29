package org.iesmurgi.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(){

    lateinit var spinnerLocalidades:Spinner
    lateinit var spinnerProvincias:Spinner

    lateinit var tvProvincias:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinnerProvincias=findViewById<Spinner>(R.id.spinnerProvincias)
        spinnerLocalidades=findViewById<Spinner>(R.id.spinnerLocalidades)

        val provincias = resources.getStringArray(R.array.provincias)
        val adaptadorProvincias = ArrayAdapter(this,android.R.layout.simple_spinner_item,provincias)

        spinnerProvincias.adapter=adaptadorProvincias

        spinnerProvincias.onItemSelectedListener=object:
        AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity,getString(R.string.provinciaSeleccionada)+" "+provincias[position],Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity,getString(R.string.provinciaSeleccionada)+" ",Toast.LENGTH_SHORT).show()
            }

        }



    }
}