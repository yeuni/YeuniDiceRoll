package www.yeuni.yeunidiceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
yeuniRoll()

    }
    fun yeuniRoll(){

        val diceRange = 1..6
        val randomNumber = diceRange.random()
        println("Random number: ${randomNumber}")
        Log.e("davies90","Random number: "+randomNumber)
    }
}