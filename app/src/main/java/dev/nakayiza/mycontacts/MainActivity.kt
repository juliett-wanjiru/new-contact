package dev.nakayiza.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nakayiza.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaycontacts()
    }
    fun displaycontacts(){
        var contact=Contacts("Julliet","0723932293","blackpearl@gmail.com","616 korongo","https://pbs.twimg.com/profile_images/1526199979093774339/Xo_RqbW9_400x400.jpg")
        var contact1=Contacts("Clare","0735294834","princessclare@gmail.com","123 djaaaa","https://i.pinimg.com/236x/e1/9d/9d/e19d9df6663eb1c026e2357ea58cac10.jpg")
        var contact2=Contacts("patricia","0752222439","patricia@gmail.com","345 budoo","https://i.pinimg.com/236x/ef/46/6d/ef466db84b5a883e3b910a71deaab59d.jpg")
        var contact3=Contacts("irene","0753023412","blackpearl@gmail.com","684 kirombe","https://i.pinimg.com/236x/fb/13/d4/fb13d4d2a8ac0d88c80b634b1dbcf984.jpg")
        var contact4=Contacts("oliver","07359233832","oliver@gmail.com","221 Kakoge","https://pbs.twimg.com/profile_images/1499807370184167424/v5T7efQL_400x400.jpg")

        var contactlist= listOf(contact,contact1,contact2,contact3,contact4)
        var contactsAdapter=ContactrvAdapter(contactlist)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        binding.rvcontacts.adapter=contactsAdapter
    }
}