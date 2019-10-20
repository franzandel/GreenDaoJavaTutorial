package com.example.greendaojavatutorial.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.greendaojavatutorial.R
import com.example.greendaojavatutorial.Repository
import com.example.greendaojavatutorial.database.User
import kotlinx.android.synthetic.main.activity_input.*


class InputActivity : AppCompatActivity() {

    private lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        repository = Repository()

        submit.setOnClickListener {
            //create new object
            val user = User()
            //set value to object attribute
            user.address = address.text.toString().trim()
            user.name = name.text.toString().trim()
            //insert data to database
            repository.addData(user)

            Toast.makeText(this@InputActivity, "Add user success", Toast.LENGTH_LONG).show()
        }
    }
}
