package edu.phystech.cis.android

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToProfileButton(view : View) {
        val myIntent = Intent(this, Profile::class.java)
        startActivityForResult(myIntent, 1 /*tmp code*/)
    }

    fun composeEmail(view : View) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:") // only email apps should handle this
            putExtra(Intent.EXTRA_EMAIL, arrayOf("emailfornotification@gmail.com"))
            putExtra(Intent.EXTRA_SUBJECT, "Отправлено из приложения Анроид hw3")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

}
