package com.example.jogodavelhaig

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.example.jogodavelhaig.databinding.ActivityModoBinding


class ModoActivity : AppCompatActivity () {

    private lateinit var binding: ActivityModoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityModoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoPVP.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            //Início da proxima atividade.
            startActivity(intent)

        }

        binding.botaoMaquina.setOnClickListener {

            val intent = Intent(this, MaquinaActivity::class.java)
            //Início da proxima atividade.
            startActivity(intent)


        }
    }
}