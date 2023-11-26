package com.bn2002.contactfragment.ContactDetail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bn2002.contactfragment.R

class ContactDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)
        val fragment = ContactDetailFragment()
        fragment.arguments = intent.extras
        supportFragmentManager.beginTransaction()
            .add(R.id.contact_detail_fragment, fragment)
            .commit()
    }
}