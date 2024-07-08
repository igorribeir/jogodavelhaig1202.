package com.example.jogodavelhaig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import com.example.jogodavelhaig.databinding.ActivityMainBinding

import kotlin.random.Random

class MaquinaActivity : AppCompatActivity() {
    // Variável de ligação para acesso às views
    private lateinit var binding: ActivityMainBinding

    // Vetor bidimensional que representará o tabuleiro de jogo
    val tabuleiro = arrayOf(
        arrayOf("A", "B", "C"),
        arrayOf("D", "E", "F"),
        arrayOf("G", "H", "I")
    )

    // Método onCreate que é chamado quando a Activity é criada
    // Entrada: savedInstanceState - o estado salvo da Activity
    // Saída: Nenhuma
    override fun onCreate(savedInstanceState: Bundle?) {
        // Infla o layout usando o binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Método para ativar bordas
        setContentView(binding.root) // Define o layout da Activity como a raiz do binding
    }

    // Função que será chamada quando um botão for clicado
    // Entrada: view - a view que foi clicada
    // Saída: Nenhuma
    fun buttonClick(view: View){
        // Converte a view recebida para um botão
        val buttonSelecionado = view as Button

        // Define o texto do botão clicado como "X"
        buttonSelecionado.setBackgroundResource(R.drawable.goat)

        // Desativa o botão para que não possa ser clicado novamente
        buttonSelecionado.isEnabled = false

        // Atualiza o tabuleiro com "X" na posição correspondente ao botão clicado
        when(buttonSelecionado.id){
            binding.buttonZero.id -> tabuleiro[0][0] = "X"
            binding.buttonUm.id -> tabuleiro[0][1] = "X"
            binding.buttonDois.id -> tabuleiro[0][2] = "X"
            binding.buttonTres.id -> tabuleiro[1][0] = "X"
            binding.buttonQuatro.id -> tabuleiro[1][1] = "X"
            binding.buttonCinco.id -> tabuleiro[1][2] = "X"
            binding.buttonSeis.id -> tabuleiro[2][0] = "X"
            binding.buttonSete.id -> tabuleiro[2][1] = "X"
            binding.buttonOito.id -> tabuleiro[2][2] = "X"
        }

        // Gera posições aleatórias para o próximo movimento do computador
        var rX = Random.nextInt(0, 3)
        var rY = Random.nextInt(0, 3)

        // Tenta encontrar uma posição vazia no tabuleiro
        var i = 0
        while (i < 9) {
            rX = Random.nextInt(0, 3)
            rY = Random.nextInt(0, 3)

            if (tabuleiro[rX][rY] != "X" && tabuleiro[rX][rY] != "O") {
                break // Sai do loop se encontrar uma posição vazia
            }

            i++
        }

        // Marca a posição encontrada com "O"
        tabuleiro[rX][rY] = "O"

        // Converte a posição bidimensional para uma posição linear
        val posicao = rX * 3 + rY

        // Atualiza o texto e estado do botão correspondente no layout
        when(posicao){
            0 -> {
                binding.buttonZero.setBackgroundResource(R.drawable.penaldo)
                binding.buttonZero.isEnabled = false

            }
            1 -> {
                binding.buttonUm.setBackgroundResource(R.drawable.penaldo)
                binding.buttonUm.isEnabled = false
            }
            2 -> {
                binding.buttonDois.setBackgroundResource(R.drawable.penaldo)
                binding.buttonDois.isEnabled = false
            }
            3 -> {
                binding.buttonTres.setBackgroundResource(R.drawable.penaldo)
                binding.buttonTres.isEnabled = false
            }
            4 -> {
                binding.buttonQuatro.setBackgroundResource(R.drawable.penaldo)
                binding.buttonQuatro.isEnabled = false
            }
            5 -> {
                binding.buttonCinco.setBackgroundResource(R.drawable.penaldo)
                binding.buttonCinco.isEnabled = false
            }
            6 -> {
                binding.buttonSeis.setBackgroundResource(R.drawable.penaldo)
                binding.buttonSeis.isEnabled = false
            }
            7 -> {
                binding.buttonSete.setBackgroundResource(R.drawable.penaldo)
                binding.buttonSete.isEnabled = false
            }
            8 -> {
                binding.buttonOito.setBackgroundResource(R.drawable.penaldo)
                binding.buttonOito.isEnabled = false
            }
        }
    }
}