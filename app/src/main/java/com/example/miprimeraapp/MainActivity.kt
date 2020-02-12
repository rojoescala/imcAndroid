package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var num:Int=0
    var aux:Int=0
    var punto:Int=1
    var inicio:Int=0
    var fin:Int=100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label:TextView = findViewById(R.id.etiqueta) as TextView
        val down: Button = findViewById(R.id.down) as Button
        val up: Button = findViewById(R.id.up) as Button
        val generated: Button = findViewById(R.id.generated) as Button
        val listo: Button = findViewById(R.id.listo) as Button

        generated.setOnClickListener{

            //num = Random.nextInt(0,100)num = Random.nextInt(fin,num)
            //
            //            label.setText("" +num+ "")
            num = Random.nextInt(inicio,fin)//00 //100

            //aux=fin
            //aux=inicio

            label.setText("" +num+ "") //22
        }

        up.setOnClickListener{

                //aux=num//22

                num = Random.nextInt(num,fin)//22 //100  //48 //65

                label.setText("" + num + "") //65



            }

        down.setOnClickListener{


                num = Random.nextInt(inicio, num) //00 //65

                label.setText("" + num + "")//48




        }

        listo.setOnClickListener{

            label.setText("We made it!!!")

        }


    }
}
