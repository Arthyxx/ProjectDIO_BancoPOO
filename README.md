# Digital Bank with Java and Object-Oriented Programming

Project developed for the DIO challenge **“Criando um Banco Digital com Java e Orientação a Objetos”**.

---

## 🎯 Challenge Objective

Model a banking system where the bank provides:

- Conta Corrente  
- Conta Poupança  

### Mandatory Features
- Depósito  
- Saque  
- Transferência entre contas da mesma instituição  

---

## 🧠 OOP Concepts Applied

- **Abstraction**: The abstract class `Conta` represents the generic model of a bank account.  
- **Encapsulation**: Attributes are protected and accessed through controlled methods.  
- **Inheritance**: `ContaCorrente` and `ContaPoupanca` inherit from the base class `Conta`.  
- **Polymorphism**: Objects can be handled through references of type `Conta`.

---

## 🏗️ Project Structure

- `IConta` → Interface defining the banking operations contract.  
- `Conta` → Abstract class with base implementation.  
- `ContaCorrente` / `ContaPoupanca` → Specialized account types.  
- `Cliente` → Represents the account holder.

---

## ✅ Implemented Features (Challenge Requirements)

- `depositar(double valor)`  
- `sacar(double valor)`  
- `transferir(double valor, Conta contaDestino)`  
- Account information display  

---

## 🚀 Custom Implementation (Extra Feature)

In addition to the challenge requirements, a **billing system (fatura)** was implemented, including:

- Purchase value control  
- Accumulated bill generation  
- `pagarFatura()` method with balance validation  
- `comprar()` method to register purchases  
- `imprimirFatura()` method  

This feature simulates a **credit card–like behavior linked to the bank account**, adding more complexity to the object-oriented model.

---

## 🛠️ Technologies Used

- Java  
- Object-Oriented Programming (OOP)

---

DIO challenge completed with **custom feature extensions**, keeping method and class names in Portuguese to match the source code.
