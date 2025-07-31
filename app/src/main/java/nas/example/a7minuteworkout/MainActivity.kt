package nas.example.a7minuteworkout

import android.content.Intent
import android.os.Bundle
//import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import nas.example.a7minuteworkout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private  var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //val flStartButton : FrameLayout = findViewById(R.id.flStart)
        binding?.flStart?.setOnClickListener {
            val intent= Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
                //Toast.makeText(
                    //this@MainActivity,
                    //"HERE WE WILL START THE EXERCISE.",
                  //  Toast.LENGTH_SHORT
                //).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}