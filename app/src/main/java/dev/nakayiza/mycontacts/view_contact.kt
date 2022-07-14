package dev.nakayiza.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.telecom.Call
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.nakayiza.mycontacts.databinding.ActivityViewContactBinding

class view_contact : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras=intent.extras
        var name=extras?.getString("NAME","")
        var phone=extras?.getString("PHONE NUMBER","")
        var email=extras?.getString("EMAIL","")
        var address=extras?.getString("ADDRESS","")
        var moreOperations=extras?.getString("MoreOperations","")
        var voiceChat=extras?.getString("VoiceChat","")
        var videoChat=extras?.getString("VideoChat","")
        var favourites=extras?.getString("Favourites","")
        var block=extras?.getString("Block","")
        var call=extras?.getString("Call","")
        var message=extras?.getString("Message","")
        var image=binding.imgperson


        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        Toast.makeText(this,email,Toast.LENGTH_LONG).show()
        Toast.makeText(this,address,Toast.LENGTH_LONG).show()
        Toast.makeText(this,voiceChat,Toast.LENGTH_LONG).show()
        Toast.makeText(this,videoChat,Toast.LENGTH_LONG).show()
        Toast.makeText(this,favourites,Toast.LENGTH_LONG).show()
        Toast.makeText(this,block,Toast.LENGTH_LONG).show()
        Toast.makeText(this,call,Toast.LENGTH_LONG).show()
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()

        binding.tvmoreoptions.text=moreOperations
        binding.tvvoicecall.text=voiceChat
        binding.tvvideocall.text=videoChat
        binding.tvfavourites.text=favourites
        binding.tvblock.text=block
        binding.tvcall.text=call
        binding.tvmessage.text=message

        Picasso.get()
            .load(intent.getStringExtra("IMAGE"))
            .centerCrop()
            .resize(300,320)
            .placeholder(R.drawable.ic_sharp_person_24)
            .into(image)


    }


    }