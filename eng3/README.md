# Estudo de Design Patterns (Engenharia de Software 3)

Este projeto tem como objetivo demonstrar de forma prática a implementação de padrões de projeto (Design Patterns) e compará-los com suas respectivas abordagens de "Anti-Padrão".

## 🚀 Padrões Implementados

O projeto está dividido em duas categorias principais:

### 1. Strategy
Localizado em `strategy/`, demonstra um sistema de pagamento.
*   **Padrão:** Usa interface e composição para permitir a troca da forma de pagamento (Dinheiro, Pix, Cartão) em tempo de execução.
*   **Anti-Padrão:** Demonstra o uso incorreto de herança rígida para tentar resolver o mesmo problema.

### 2. Observer
Localizado em `observer/`, demonstra um sistema de notificações (Newsletter).
*   **Padrão:** Usa o modelo Publicador/Assinante (Subject/Observer) para manter o sistema desacoplado.
*   **Anti-Padrão:** Demonstra o acoplamento forte, onde a classe principal conhece todas as classes de destino.
