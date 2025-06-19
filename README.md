# ESCOLHA A SUA COR

## Color Picker feito em Android Studio com Jetpack Compose

Este projeto consiste numa aplicação desenvolvida no Android Studio em **Kotlin** com interface feita apenas com **Jetpack Compose**, que permite aos utilizadores, Selecionar cores a partir de uma imagem, copiar o respetico código em HEX de cada cor e visualizar o histórico das últimas cores escolhidas.

---

## Funcionalidades

- Tocar na Imagem para selecionar qualquer cor visível
- Mostrar o Código HEX quando escolhida a cor
- Botão para copiar o código HEX
- Visualização do histórico das últimas 5 cores selecionadas
- Reutilizar a cor do histórico (ou seja, clicar numa cor do historico faz com que a cor apareça)
- Interface feita 100% em **Jetpack Compose**

---

## Tecnologias Usadas

- Kotlin
- Jetpack Compose
- Material 3
- Android Studio

---

## Como instalar?

git clone https://github.com/migueldossantoscosta/CORPROJETO

---

## Estrutura relevante do projeto

app/

├── manifests/

│   └── AndroidManifest.xml

├── kotlin+java/

│   └── com.example.corprojeto/

│       ├── COR.kt

│       ├── MainActivity.kt

│       └── ui.theme/

├── res/

│   ├── drawable/

│   ├── mipmap/

│   ├── values/

│   └── xml/

---

## Notas

- Este projeto nao utiliza XML: toda a interface é construida através de Jetpack Compose
- O Sletor funciona melhor com imagens circulares com uma boa resolução preferencialmente 500x500
- O histórico é mantido em memória (não permanece entre sessões)

---

## Autor

- Nome: Miguel dos Santos Costa
- Email Institucional: 1706868@sal.ipg.pt
- GitHub: https://github.com/migueldossantoscosta
