package com.nazlicanaltintas.hesapmakinesi   //HESAP MAKİNESİ UYGULAMASI

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nazlicanaltintas.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var number1: Double? = null
    var number2: Double? = null
    var result: Double? = null

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun mySum(view: View){
        number1 = binding.number1.text.toString().toDoubleOrNull()
        number2 = binding.number2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){
            result = number1!! + number2!!
            binding.resultText.text = "Result: $result"
        }else{
            binding.resultText.text = "Enter number please!"
        }
    }
    fun mySub(view: View){
        number1 = binding.number1.text.toString().toDoubleOrNull()
        number2 = binding.number2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){
            result = number1!! - number2!!
            binding.resultText.text = "Result: $result"
        }else{
            binding.resultText.text = "Enter number please!"
        }
    }
    fun myMulti(view: View){
        number1 = binding.number1.text.toString().toDoubleOrNull()
        number2 = binding.number2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){
            result = number1!! * number2!!
            binding.resultText.text = "Result: $result"
        }else{
            binding.resultText.text = "Enter number please!"
        }
    }
    fun myDiv(view: View){
        number1 = binding.number1.text.toString().toDoubleOrNull()
        number2 = binding.number2.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){
            result = number1!! / number2!!
            binding.resultText.text = "Result: $result"
        }else{
            binding.resultText.text = "Enter number please!"
        }
    }
}