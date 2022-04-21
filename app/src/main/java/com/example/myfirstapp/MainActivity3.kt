package com.example.myfirstapp

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.myfirstapp.R.layout.activity_main3)
    }

    //---------------------------Вычисления--------------------------------------------

    private fun defineChoiceGame(): String {  //Определяет выбор игры
        val arrayGame = arrayOf("Камень", "Ножницы", "Бумага")
        var choiceGame = arrayGame[(Math.random() * arrayGame.size).toInt()]
        return(choiceGame)
    }

    private fun defineResult(choiceUser: String): String {  //Определение победителя и генерация текста
        var choicePlayer = choiceUser
        var choiceGame = defineChoiceGame()
        var resultGame = if (choicePlayer == choiceGame) {
            (if (choiceGame == "Бумага") "Я тоже выбрал бумагу так что ничья, говнюк!" else "Я тоже выбрал $choiceGame так что ничья, говнюк!")
            }
            else if ((choicePlayer == "Ножницы" && choiceGame == "Бумага") ||
                (choicePlayer == "Бумага" && choiceGame == "Камень") ||
                (choicePlayer == "Камень" && choiceGame == "Ножницы")) {
            (if (choiceGame == "Бумага") "Я выбрал Бумагу, тебе повезло, скотина!" else "Я выбрал $choiceGame, тебе повезло, скотина!")
            }
            else {
            (if (choiceGame == "Бумага") "Я выбрал Бумагу и ты проиграл, паскудяра!" else "Я выбрал $choiceGame и ты проиграл, паскудяра!")
            }
        return(resultGame)
        }

    //-----------------------Вывод и кнопка назад--------------------------------------

    fun play1(view: View){  //Выводит результат, если пользователь выбрал "Камень"
        var result1 = defineResult("Камень")
        val choiceShow = Toast.makeText(this, result1, Toast.LENGTH_LONG).show()
    }

    fun play2(view: View){  //Выводит результат, если пользователь выбрал "Бумагу>"
        var result2 = defineResult("Бумага")
        val choiceShow = Toast.makeText(this, result2, Toast.LENGTH_LONG).show()
    }

    fun play3(view: View) {  //Выводит результат, если пользователь выбрал "Ножницы"
        var result3 = defineResult("Ножницы")
        val choiceShow = Toast.makeText(this, result3, Toast.LENGTH_LONG).show()
    }
    fun back2(view: View) {  // Кнопка назад
        val intent = Intent(this@MainActivity3, MainActivity::class.java)
        startActivity(intent)
    }

}
