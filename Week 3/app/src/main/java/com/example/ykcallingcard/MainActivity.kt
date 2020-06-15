package com.example.ykcallingcard

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    internal var shares = 0

    internal lateinit var shareButton: Button
    internal lateinit var shareText: TextView

    companion object {
        private const val SHARE_KEY = "SHARE_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shareButton = findViewById(R.id.shareBtn)
        shareText = findViewById(R.id.shareTextView)

        shareButton.setOnClickListener { view ->
            incrementShare()
        }

        if (savedInstanceState != null) {
            shares = savedInstanceState.getInt(SHARE_KEY)
        } else {
            resetShare()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.aboutDev) {
            showInfo()
        }
        return true
    }

    private fun showInfo() {
        val dialogTitle = getString(R.string.aboutTitle, BuildConfig.VERSION_NAME)
        val dialogMessage = getString(R.string.aboutMessage)

        val builder = AlertDialog.Builder(this)
        builder.setTitle(dialogTitle)
        builder.setMessage(dialogMessage)
        builder.create().show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(SHARE_KEY, shares)
    }

    private fun resetShare() {
        shares = 0
        shareText.text = getString(R.string.shareTextView, shares)
    }

    private fun incrementShare() {
        shares += 1
        val newShareNumber = getString(R.string.shareTextView, shares)
        shareText.text = newShareNumber

        val blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink)
        shareText.startAnimation(blinkAnimation)
    }
}
