package io.jmdg.spanlyapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.jmdg.spanly.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample usage
        tvHelloWorld.text = Spanly()
            .append("The", italic())
            .append(" ")
            .append("Quick Brown", bold())
            .append(" ")
            .append("Fox", italic())
            .append(" ")
            .append("Jumps", bold(), strike(), sup(), italic())
            .append(" ")
            .append("Over", strike())
            .append(" ")
            .append("The", strike(), underline())
            .append(" ")
            .append("Lazy", sup())
            .append(" ")
            .append("Dog", underline())
            .build()
    }
}