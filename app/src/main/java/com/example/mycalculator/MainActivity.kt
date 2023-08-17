package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            if (binding.edtNo1.text.toString() !="" && binding.edtNo2.text.toString() !=""){

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()

                val sum = no1+no2

                Toast.makeText(this,"Sum = $sum",Toast.LENGTH_LONG).show()


            } else {
                Toast.makeText(this,"Enter Number First !",Toast.LENGTH_LONG).show()

            }
        }

        binding.btnSub.setOnClickListener {
            if (binding.edtNo1.text.toString() !="" && binding.edtNo2.text.toString() !=""){

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()

                val diff = no1-no2
                Toast.makeText(this,"Difference = $diff",Toast.LENGTH_LONG).show()


            } else {
                Toast.makeText(this,"Enter Number First !",Toast.LENGTH_LONG).show()

            }
        }

        binding.btnMul.setOnClickListener {
            if (binding.edtNo1.text.toString() !="" && binding.edtNo2.text.toString() !=""){

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()

                val prod = no1*no2

                Toast.makeText(this,"Product = $prod ",Toast.LENGTH_LONG).show()


            } else {
                Toast.makeText(this,"Enter Number First !",Toast.LENGTH_LONG).show()

            }
        }

        binding.btnDiv.setOnClickListener {
            if (binding.edtNo1.text.toString() !="" && binding.edtNo2.text.toString() !=""){

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()

                val qt = no1/no2

                Toast.makeText(this,"Quotient = $qt",Toast.LENGTH_LONG).show()



            } else {
                Toast.makeText(this,"Enter Number First !",Toast.LENGTH_LONG).show()

            }
        }
    }
}