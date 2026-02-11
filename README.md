# Criando um Banco Digital com Java e Orientação a Objetos (DIO)

Projeto desenvolvido para o desafio **“Criando um Banco Digital com Java e Orientação a Objetos”** da DIO.

## 🎯 Objetivo do Desafio
Modelar um sistema bancário onde o banco oferece:
- Conta Corrente
- Conta Poupança

Funcionalidades obrigatórias:
- Depósito
- Saque
- Transferência entre contas da mesma instituição

## 🧠 Conceitos de POO Aplicados
- **Abstração:** Classe abstrata `Conta` representa o modelo genérico de uma conta bancária.
- **Encapsulamento:** Atributos protegidos e acesso controlado via métodos.
- **Herança:** Contas específicas herdam da classe base `Conta`.
- **Polimorfismo:** Objetos podem ser tratados por referência do tipo `Conta`.

## 🏗️ Estrutura do Projeto
- `IConta` → Interface com o contrato das operações bancárias.
- `Conta` → Classe abstrata com implementação base.
- `ContaCorrente` / `ContaPoupanca` → Especializações.
- `Cliente` → Representa o titular da conta.

## ✅ Funcionalidades Implementadas (Requisito do Desafio)
- `depositar(double valor)`
- `sacar(double valor)`
- `transferir(double valor, Conta contaDestino)`
- Impressão das informações da conta

## 🚀 Implementação Autoral (Funcionalidade Extra)

Além do solicitado no desafio, implementei um **sistema de fatura**, adicionando:

- Controle de valor de compras
- Geração de fatura acumulada
- Método `pagarFatura()` com validação de saldo
- Método `comprar()` para registrar compras
- Método `imprimirFatura()`

Essa funcionalidade simula um comportamento semelhante a cartão de crédito vinculado à conta, agregando maior complexidade ao modelo orientado a objetos.

## 🛠️ Tecnologias Utilizadas
- Java
- Programação Orientada a Objetos (POO)

---

Desafio DIO concluído com extensão autoral de funcionalidades.