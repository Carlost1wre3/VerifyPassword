# VerifyPassword - Security Logic 🔐

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Finalizado-green?style=for-the-badge)
![Logic](https://img.shields.io/badge/Logic-Validation-blue?style=for-the-badge)

Este repositório contém o desenvolvimento de um sistema de validação de segurança para palavras-passe. O projeto foca na construção de uma lógica robusta para garantir que as credenciais dos utilizadores cumpram os requisitos modernos de complexidade.

## 🚀 Sobre o Projeto

O objetivo deste projeto é aplicar conhecimentos de lógica de programação e manipulação de strings para criar um verificador de integridade. A aplicação analisa diferentes critérios de segurança, fornecendo um diagnóstico preciso sobre a força da senha inserida.

### 🧠 Regras de Validação Aplicadas

* **Length Check:** Validação de comprimento mínimo para evitar ataques de força bruta.
* **Character Diversity:** Verificação obrigatória de letras maiúsculas e minúsculas.
* **Numeric Integrity:** Garantia de que a senha contém caracteres numéricos.
* **Special Characters:** Exigência de símbolos especiais (ex: `@`, `#`, `$`) para aumentar a entropia.
* **Boolean Feedback:** Retorno lógico claro sobre o estado de conformidade da senha.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Ferramentas:** Lógica de Regex (Expressões Regulares) para validação de padrões.

## 🏁 Como Executar

1. **Importe em sua IDE:** Abra o projeto no IntelliJ, Eclipse ou VS Code como um projeto Java padrão.
2. **Compile o código:** Certifique-se de que o JDK está configurado corretamente.
3. **Inicie a aplicação:** Execute a classe principal (geralmente `Main.java` ou `App.java`).
4. **Teste a lógica:** Insira diferentes combinações de caracteres no terminal para visualizar os resultados da validação.

# Desenvolvido por Carlos

## 📌 Exemplo de Validação

> **Input:** `Senha123!`  
> **Resultado:** ✅ Palavra-passe Segura!

> **Input:** `12345`  
> **Resultado:** ❌ Fraca (Faltam letras e caracteres especiais).

---

## ✒️ Autor

Desenvolvido por **Carlos** - [Perfil no GitHub](https://github.com/Carlost1wre3)

---
*Este projeto foi criado para fins de estudo e prática de lógica de programação.*
