package com.example.chanon.ex01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun plusFunction(int1: Int, int2: Int):Int{
            return int1 + int2
        }
        fun minusFunction(int1: Int, int2: Int):Int{
            return int1 - int2
        }
        fun multiplyFunction(int1: Int, int2: Int):Int{
            return int1*int2
        }
        fun divideFunction(int1: Float, int2: Float):Float{
            if(int2 < 1) Toast.makeText(this,"divide by zero",Toast.LENGTH_SHORT).show()
            return int1/int2
        }
        fun showplus(int1: Int, int2: Int){
            Toast.makeText(this,plusFunction(int1,int2).toString(),Toast.LENGTH_SHORT).show()
            labelText.text = plusFunction(int1,int2).toString()
        }
        fun showminus(int1: Int, int2: Int){
            Toast.makeText(this,minusFunction(int1,int2).toString(),Toast.LENGTH_SHORT).show()
            labelText.text = minusFunction(int1,int2).toString()
        }
        fun showmul(int1: Int, int2: Int){
            Toast.makeText(this,multiplyFunction(int1,int2).toString(),Toast.LENGTH_SHORT).show()
            labelText.text = multiplyFunction(int1,int2).toString()
        }
        fun showdiv(int1: Float, int2: Float){
            Toast.makeText(this,divideFunction(int1,int2).toString(),Toast.LENGTH_SHORT).show()
            if(int2.toString() == "0") labelText.text = "divide_by_zero"
            else labelText.text = divideFunction(int1,int2).toString()
        }
//        labelText.text = "hello chanon"

        plusBtn.setOnClickListener {
            showplus(editText.text.toString().toInt(),editText2.text.toString().toInt())
            Log.d("Test","Check Click Event")
        }
        minusBtn.setOnClickListener {
            showminus(editText.text.toString().toInt(),editText2.text.toString().toInt())
            Log.d("Test","Check Click Event")
        }
        multiplyBtn.setOnClickListener {
            showmul(editText.text.toString().toInt(),editText2.text.toString().toInt())
            Log.d("Test","Check Click Event")
        }
        divideBtn.setOnClickListener {
            showdiv(editText.text.toString().toFloat(),editText2.text.toString().toFloat())
            Log.d("Test","Check Click Event")
        }
    }
}
