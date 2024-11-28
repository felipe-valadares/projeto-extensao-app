# Controle de Estoque - Mercado Rezendão

Este repositório contém o código fonte para o aplicativo de controle de estoque desenvolvido para o *Mercado Rezendão*. O objetivo principal é fornecer uma solução simples e eficaz para o controle de inventário de um pequeno comércio, permitindo que os donos registrem itens, verifiquem a quantidade disponível e gerenciem o estoque de forma prática.

## Funcionalidades

- Cadastro de novos itens no estoque com nome e quantidade.
- Visualização dos itens cadastrados e suas quantidades.
- Interface amigável e fácil de usar para gerenciar o estoque.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação utilizada para o desenvolvimento do aplicativo.
- **Android Studio**: Ambiente de desenvolvimento utilizado para a criação do aplicativo.

## Como Executar o Projeto

1. **Clone este repositório**:
https://github.com/felipe-valadares/projeto-extensao-app.git

2. **Abra o projeto no Android Studio**:
- Certifique-se de que você tem o Android Studio instalado.
- Abra o Android Studio e selecione "Open" para abrir o projeto clonado.

3. **Execute o projeto**:
- Conecte um dispositivo Android ou use um emulador.
- Clique em "Run" no Android Studio para compilar e rodar o aplicativo.

## Estrutura do Projeto

- `MainActivity.kt`: Atividade principal que exibe a lista de itens no estoque.
- `Item.kt`: Classe de dados para representar cada item no estoque.
- `ItemAdapter.kt`: Adaptador personalizado para exibir a lista de itens na interface.
- `AddItemActivity.kt`: Atividade para adicionar novos itens ao estoque.
- `activity_main.xml`: Layout da tela principal.
- `activity_add_item.xml`: Layout da tela de adição de itens.
- `item_view.xml`: Layout para exibição de um item no estoque.

## Como Contribuir

1. **Fork este repositório**.

2. **Crie uma nova branch** para suas alterações:
git checkout -b feature/novo-recurso

3. **Faça as alterações e commit**:
git commit -am 'Adiciona novo recurso'

4. **Envie para o repositório remoto**:
git push origin feature/novo-recurso

5. **Abra um Pull Request**.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

