package com.bn2002.contactfragment

import java.io.Serializable

data class ContactModel(var id: Int, var name: String, var phoneNumber: String, var email: String, var isExpand: Boolean = false){
}