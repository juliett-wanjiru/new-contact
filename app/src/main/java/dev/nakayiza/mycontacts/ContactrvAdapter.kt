package dev.nakayiza.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.nakayiza.mycontacts.databinding.ContactsListItemsBinding

class ContactrvAdapter(var contactList:List<Contacts>):
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding =
            ContactsListItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var context =holder.itemView.context
        var currentcontact = contactList.get(position)
//        var contactBinding = holder.binding
        with(holder.binding) {
            tvname.text = currentcontact.name
            tvphone.text = currentcontact.phone
            tvemail.text = currentcontact.email
            tvaddress.text = currentcontact.address
            Picasso.get()
                .load(currentcontact.image)
                .error(R.drawable.ic_baseline_error_outline_24)
                .centerCrop()
                .resize(300,320)
                .placeholder(R.drawable.ic_sharp_person_24)
                .into(imgcontact)

            holder.binding.cvcontacts.setOnClickListener {
                var intent=Intent(context,view_contact::class.java)
                intent.putExtra("NAME",currentcontact.name)
                intent.putExtra("PHONE NUMBER",currentcontact.phone)
                intent.putExtra("IMAGE",currentcontact.image)
                context.startActivity(intent)
            }
            holder.binding.imgcontact.setOnClickListener {
                Toast
                    .makeText(context,"You have clicked on my image",Toast.LENGTH_LONG)
                    .show()
            }
        }
    }


    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactsViewHolder(var binding: ContactsListItemsBinding):RecyclerView.ViewHolder(binding.root){
}
