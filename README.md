## INTERFACE 
<img width="1852" height="969" alt="image" src="https://github.com/user-attachments/assets/8c391ddc-8909-4d4a-8a60-a06a602dd576" />





#  Mobile Store REST API

Esta é uma API REST completa para o gerenciamento de vendas de telemóveis/celulares. O projeto permite realizar todas as operações de um CRUD (Create, Read, Update, Delete) através de uma interface web simples e intuitiva.

##  Tecnologias Utilizadas

* **Backend:** Java 17+ com **Spring Boot**
* **Banco de Dados:** H2 Database (Banco em memória para testes rápidos)
* **Persistência:** Spring Data JPA (Hibernate)
* **Frontend:** HTML5, CSS3 e JavaScript (Vanilla JS com Fetch API)
* **Gestão de Dependências:** Maven

##  Funcionalidades

- [x] **Listar:** Exibe todos os aparelhos cadastrados em tempo real.
- [x] **Cadastrar:** Adiciona novos modelos com marca e preço.
- [x] **Editar:** Atualiza informações de aparelhos já existentes.
- [x] **Remover:** Elimina um registo do sistema com confirmação.

##  Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/DyogoSI/mobile-store-rest-api.git](https://github.com/DyogoSI/mobile-store-rest-api.git)
    ```
2.  **Abra no IntelliJ IDEA:**
    - Importe o projeto como um projeto Maven.
3.  **Execute a aplicação:**
    - Localize a classe `VendaCelularesApplication` e clique no botão **Run**.
4.  **Aceda no Navegador:**
    - Interface Web: `http://localhost:8080/`
    - Dados JSON (API): `http://localhost:8080/celulares`

##  Estrutura de Endpoints (REST)

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| GET | `/celulares` | Retorna a lista de todos os celulares |
| POST | `/celulares` | Cria um novo celular |
| PUT | `/celulares/{id}` | Atualiza um celular existente |
| DELETE | `/celulares/{id}` | Remove um celular do sistema |

---
Desenvolvido por [DyogoSI](https://github.com/DyogoSI) 🚀
