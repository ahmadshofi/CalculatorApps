package com.ahmad.calculatorapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*
import kotlin.collections.HashMap


class MainActivity : AppCompatActivity(){

    val stack = Stack<String>()
    val p = Stack<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSatu.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "1")}
        btnDua.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "2") }
        btnTiga.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "3") }
        btnEmpat.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "4") }
        btnLima.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "5") }
        btnEnam.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "6") }
        btnTujuh.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "7") }
        btnDelapan.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "8") }
        btnSembilan.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "9") }
        btnNol.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "0") }
        btnKoma.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + ".") }

        btnTambah.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "+") }
        btnKali.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "*") }
        btnKurang.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "-") }
        btnBagi.setOnClickListener { tv_masukan.setText(tv_masukan.text.toString() + "/") }


        btnSamaDengan.setOnClickListener {
            stack.push("(")
            var q = tv_masukan.text.toString()
            var p = Stack<String>()
            q.forEach {
                if (it.equals("(")){
                    stack.push(it.toString())
                }else if (it.equals(")")){
                    while (stack.peek() != "("){
                        p.push(stack.pop())
                    }
                    if (stack.peek() == "(") stack.pop()
                }else if (it.equals("+") || it.equals("-") || it.equals("*") || it.equals("/")){
//                    while (stack.peek() == "+" || stack.peek() == "-" || stack.peek() == "*" || stack.peek() == "/")
                }
            }
               tv_keluaran.setText(p.peek())

        }

        btnReset.setOnClickListener { tv_masukan.setText("")
            tv_keluaran.setText("")}
    }

}