package com.example.madpractical4_20012011003

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import com.example.madpractical4_20012011003.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBrowse.setOnClickListener {
//            Toast.makeText(this, "Browse Button Clicked", Toast.LENGTH_SHORT).show()
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://uvpce.guni.ac.in")).apply {
                startActivity(this)
            }
        }

        binding.buttonCall.setOnClickListener {
//            Toast.makeText(this, "Call Button Clicked", Toast.LENGTH_SHORT).show()
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:1234567890")).apply {
                startActivity(this)
            }
        }
        binding.buttonContact.setOnClickListener {
//            Toast.makeText(this, "Contact Button Clicked", Toast.LENGTH_SHORT).show()
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply {
                startActivity(this)
            }
        }
        binding.buttonCallLog.setOnClickListener {
//            Toast.makeText(this, "Call_Log Button Clicked", Toast.LENGTH_SHORT).show()
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply {
                startActivity(this)
            }

        }
        binding.buttonGallery.setOnClickListener {
//            Toast.makeText(this, "Gallery Button Clicked", Toast.LENGTH_SHORT).show()
            Intent(Intent.ACTION_VIEW).setType("image/*").apply {
                startActivity(this)
            }
        }
        binding.buttonCamera.setOnClickListener {
//            Toast.makeText(this, "Camera Button Clicked", Toast.LENGTH_SHORT).show()
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply {
                startActivity(this)
            }
        }
        binding.buttonAlarm.setOnClickListener {
//            Toast.makeText(this, "Alarm Button Clicked", Toast.LENGTH_SHORT).show()
            Intent(AlarmClock.ACTION_SHOW_ALARMS).apply {
                startActivity(this)
            }
        }
    }
}