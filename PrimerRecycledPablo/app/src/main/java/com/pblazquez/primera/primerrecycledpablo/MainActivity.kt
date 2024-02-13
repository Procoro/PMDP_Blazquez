package com.pblazquez.primera.primerrecycledpablo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectorecycled.Person
import com.example.proyectorecycled.PersonAdapter
import com.pblazquez.primera.primerrecycledpablo.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personList = generatePersonList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val personAdapter = PersonAdapter(personList)
        recyclerView.adapter = personAdapter
    }

    private fun generatePersonList(): List<Person> {
        return listOf(
            Person("Alberto","Ruiz","Cadiz"),
            Person("Juan","Perez","Jaén"),
            Person("Eva","Garcia","Málaga"),
            Person("Alberto","Bertoal","Almeria"),
            Person("Laura","Jimenez","Albacete"),
            Person("Cristina","Lopez","Murcia"),
            Person("Isabel","Zaragoza","Berlin"),
            Person("Pedro", "Moreno","Huelva"),
            Person("Jose","Android","Jaén"),
            Person("Manuel", "Oracle","Getafe"),
            Person("Diana","Hibernate","Barcelona"),


            )
    }
}
