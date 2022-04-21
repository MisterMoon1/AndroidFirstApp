package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button: Button = findViewById(R.id.button3)
        button.setOnClickListener {
            val inflater = layoutInflater
            val container = findViewById<ViewGroup>(R.id.custom_toast_container)
            val layout: View = inflater.inflate(R.layout.custom_toast, container)
            val text: TextView = layout.findViewById(R.id.text)
            text.text = "Спасибо,\nчто потрогал меня!"
            with (Toast(applicationContext)) {
                setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                duration = Toast.LENGTH_LONG
                view = layout
                show()
            }
        }
    }

    fun back1(view: View) {
        val intent = Intent(this@MainActivity2, MainActivity::class.java)
        startActivity(intent)
    }

    fun watch(view: View) {
        val inflater = layoutInflater
        val container = findViewById<ViewGroup>(R.id.custom_toast_container)
        var layout: View = inflater.inflate(R.layout.custom_toast, container)
        val text: TextView = layout.findViewById(R.id.text)
        text.text = "?????????"
        with(Toast(applicationContext)) {
            duration = Toast.LENGTH_LONG
            show()
        }
    }
}

            /*val intent = Intent(this@MainActivity_2, MainActivity_4::class.java)
            startActivity(intent)

            val message = "Вы потрогали Епифанцева. Спасибо"
            val myToast = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT)
            myToast.show()

            /*myToast.gravity

            val toastContainer = myToast.view as LinearLayout
            val image = ImageView(this)
            image.setImageResource(R.drawable.epifantsev)
            toastContainer.addView(image, 1)
            myToast.show()


            myToast.gravity

            val image = (R.drawable.epifantsev)
            print(image)
            val myToast = Toast.makeText(this, image, Toast.LENGTH_SHORT)
            myToast.show()
            but.setImageResource(R.drawable.epifantsev ..  R.drawable.alan_1))

        }
    }
}
*/