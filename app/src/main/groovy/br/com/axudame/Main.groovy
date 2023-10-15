package br.com.axudame

def pessoa = [
        nome: "Issao",
]

def mostraNoTerminal(pessoa) {
    println("Nome: ${pessoa.nome}")
}

def escreveNoArquivo(pessoa) {
    def arquivo = new File("/tmp/pessoa.txt")
    arquivo.text = "Nome: ${pessoa.nome}"
    "gedit /tmp/pessoa.txt".execute()
}

mostraNoTerminal(pessoa)
escreveNoArquivo(pessoa)