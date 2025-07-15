<p align="center">
  <img src="https://emojipedia-us.s3.amazonaws.com/source/skype/289/red-apple_1f34e.png" width="100" alt="Logo FrutariaApp">
</p>

<h1 align="center">🍎 FrutariaApp</h1>

<p align="center">
  Sistema de cadastro de produtos usando <strong>Polimorfismo em Java</strong>
</p>

---

## 📘 Sobre o Projeto

O **FrutariaApp** é um sistema Java desenvolvido para praticar **Programação Orientada a Objetos (POO)**, com foco no uso de **polimorfismo**, **herança** e **sobrescrita de métodos**.  

Ele permite cadastrar diferentes tipos de produtos (como frutas e verduras) em uma lista genérica, exibir seus dados de forma elegante usando o método `toString()`, e aplicar lógica condicional com `instanceof` para identificar o tipo real dos objetos.

---

## 🚀 Funcionalidades

- ✅ Cadastro de produtos (Fruta e Verdura)
- ✅ Armazenamento genérico com `List<Produto>`
- ✅ Exibição personalizada com sobrescrita do método `toString()`
- ✅ Uso de `instanceof` para identificação do tipo de produto
- ✅ Estrutura extensível para inclusão de novos tipos de produtos

---

## 🧠 Conceitos Utilizados

### 👨‍👩‍👧‍👦 Polimorfismo

Permite usar uma lista genérica que armazena objetos de diferentes subclasses:

List<Produto> lista = new ArrayList<>();
// Pode armazenar Fruta, Verdura, etc.

📝 Sobrescrita do Método toString()
Cada subclasse implementa sua própria versão para exibir os dados:

@Override
public String toString() {
    return "Fruta [nome=" + nome + ", tipo=" + tipo + ", preço=" + preco + "]";
}

Ao imprimir:

System.out.println(produto); // Chama automaticamente o toString da subclasse

🔍 Uso do instanceof
Permite verificar o tipo real do objeto para lógica condicional:

if (produto instanceof Fruta fruta) {
    System.out.println("É uma fruta: " + fruta.getNome());
} else if (produto instanceof Verdura verdura) {
    System.out.println("É uma verdura: " + verdura.getNome());
}

# 📦 Tipos de Produtos

| Produto  | Classe  | Atributos principais                      |
|----------|---------|------------------------------------------|
| 🍎 Fruta   | Fruta   | nome, tipo, preço, quantidade             |
| 🥬 Verdura | Verdura | nome, orgânico (boolean), preço, quantidade |

---

📈 Vantagens
✨ Código limpo e reutilizável

🤖 Aproveitamento do polimorfismo para tratamento genérico

🧩 Fácil extensão para novos tipos de produtos

📚 Excelente prática para aprendizado de POO em Java

🛠️ Sugestões de Melhorias
🔄 Implementar edição e remoção de produtos

📋 Listagem separada por tipo de produto

💾 Persistência em arquivos ou banco de dados

🧱 Aplicar arquitetura em camadas (MVC)

💡 Requisitos
Java 17 ou superior

IDE recomendada: Eclipse, IntelliJ IDEA ou VS Code com extensão Java


# 🧪 Exemplo de Uso

```java
Produto fruta = new Fruta("Maçã", "Vermelha", 2.50, 10);
Produto verdura = new Verdura("Alface", true, 1.75, 5);

lista.add(fruta);
lista.add(verdura);

for (Produto produto : lista) {
    System.out.println(produto); // Usa o toString() sobrescrito
}

🧑‍💻 Autoria
Desenvolvido como prática de Programação Orientada a Objetos em Java
Disciplina: Programação Orientada a Objetos
Instituição: SENAI — Jaraguá do Sul


