package com.example.mysqlroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mysqlroomdb.data.Product
import com.example.mysqlroomdb.data.ProductDB
import com.example.mysqlroomdb.data.ProductDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var dao : ProductDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnInsert)

        dao = ProductDB.getInstance(application).productDao

        btn.setOnClickListener(){
            val p = Product(0, "Apple", 1.50)



            CoroutineScope(IO).launch {
                //calling the ProductDao interface's function
                dao.insertProduct(p)
            }


        }


    }
}