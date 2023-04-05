package com.example.biodata

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var edittextnpm: EditText
    private lateinit var edittextnama: EditText
    private lateinit var edittextalamat: EditText
    private lateinit var radiogrup: RadioGroup
    private lateinit var lk: RadioButton
    private lateinit var pr: RadioButton
    private lateinit var belajar: CheckBox
    private lateinit var tidur: CheckBox
    private lateinit var btntampil: Button
    private lateinit var btnclear: Button
    private lateinit var texttampil: TextView

    private fun initcomponents() {
        edittextnpm = findViewById(R.id.editTextTextPersonName1)
        edittextnama = findViewById(R.id.editTextTextPersonName2)
        edittextalamat = findViewById(R.id.editTextTextPersonName3)
        radiogrup = findViewById(R.id.idgrup)
        lk = findViewById(R.id.radiolk)
        pr = findViewById(R.id.radiopr)
        belajar = findViewById(R.id.belajar)
        tidur = findViewById(R.id.tidur)
        btntampil = findViewById(R.id.btntampil)
        btnclear = findViewById(R.id.btnclear)
        texttampil = findViewById(R.id.texttampil)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initcomponents()

        btntampil.setOnClickListener {
            val npm = edittextnpm.text.toString()
            val nama = edittextnama.text.toString()
            val alamat = edittextalamat.text.toString()

            val jk = findViewById<RadioButton>(radiogrup.checkedRadioButtonId)
            val hobby=(if (belajar.isChecked)"Belajar, " else "")+
                    (if (tidur.isChecked)"tidur" else "")

                texttampil.text ="NPM : "+ npm + "\n" + "Nama : "+ nama + "\n" + "Alamat : " + alamat + "\n" + "Jenis Kelamin : "+jk.text + "\n" + "Hobby : "+ hobby +"\n"
            }

        btnclear.setOnClickListener {
            edittextnpm.setText("")
            edittextnama.setText("")
            edittextalamat.setText("")
            radiogrup.clearCheck()
            belajar.isChecked=false
            tidur.isChecked=false
            texttampil.text=""
        }
        }
    }
