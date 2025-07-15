<p align="center">
  <img src="https://emojipedia-us.s3.amazonaws.com/source/skype/289/red-apple_1f34e.png" width="100" alt="Logo FrutariaApp">
</p>

<h1 align="center">🍎 FrutariaApp</h1>
<p align="center">Sistema de cadastro de produtos usando <strong>Polimorfismo em Java</strong>.</p>

---

## 📘 Sobre o Projeto

O **FrutariaApp** é um sistema Java desenvolvido para praticar **Programação Orientada a Objetos**, com foco no uso de **polimorfismo**, **herança**, e **sobrescrita de métodos**. Permite cadastrar diferentes tipos de produtos (como frutas e verduras) em uma lista genérica, exibir seus dados de forma elegante com `toString()`, e usar `instanceof` para lógica condicional baseada no tipo.

---

## 🚀 Funcionalidades

- ✅ Cadastro de produtos (Fruta e Verdura)
- ✅ Armazenamento genérico com `List<Produto>`
- ✅ Exibição com `toString()` sobrescrito
- ✅ Alternativa de exibição com `instanceof`
- ✅ Estrutura pronta para novos tipos de produto

---

## 🧠 Conceitos Utilizados

### 👨‍👩‍👧‍👦 Polimorfismo

Permite usar uma lista genérica:

```java
List<Produto> lista = new ArrayList<>();

Mesmo sendo do tipo Produto, ela pode armazenar objetos de qualquer subclasse (Fruta, Verdura, etc.).

📝 Sobrescrita do Método toString()
Cada subclasse implementa sua versão:

java
Copiar
Editar
@Override
public String toString() {
    return "Fruta [nome=" + nome + ", tipo=" + tipo + ", preço=" + preco + "]";
}
E é chamada automaticamente com:

java
Copiar
Editar
System.out.println(produto); // Chama o toString da subclasse
🔍 Uso do instanceof
Permite verificar o tipo real do produto:

java
Copiar
Editar
if (produto instanceof Fruta fruta) {
    System.out.println("É uma fruta: " + fruta.getNome());
} else if (produto instanceof Verdura verdura) {
    System.out.println("É uma verdura: " + verdura.getNome());
}
📦 Tipos de Produtos
Produto	Classe	Atributos principais
🍎 Fruta	Fruta	nome, tipo, preço, quantidade
🥬 Verdura	Verdura	nome, orgânico (boolean), preço, quant

🧪 Exemplo de Uso
java
Copiar
Editar
Produto fruta = new Fruta("Maçã", "Vermelha", 2.50, 10);
Produto verdura = new Verdura("Alface", true, 1.75, 5);

lista.add(fruta);
lista.add(verdura);

for (Produto produto : lista) {
    System.out.println(produto); // Usa toString()
}
📈 Vantagens
✨ Código limpo e reutilizável

🤖 Aproveitamento do polimorfismo

🧩 Fácil adição de novos produtos

📚 Ideal para treinar conceitos de POO

🛠️ Sugestões de Melhorias
🔄 Edição e remoção de produtos

📋 Listagem separada por tipo

💾 Persistência em arquivos ou banco

🧱 Separação de camadas (MVC)

💡 Requisitos
Java 17+

IDE (Eclipse, IntelliJ ou VS Code com extensão)

📂 Estrutura de Classes
text
Copiar
Editar
Produto (abstract)
├── Fruta
└── Verdura
🧑‍💻 Autoria
Desenvolvido como prática de POO com Java
📚 Disciplina: Programação Orientada a Objetos
🏫 SENAI — Jaraguá do Sul

<p align="center"> <img src="https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/OOP-Prática-blue?style=for-the-badge"> </p> ```
