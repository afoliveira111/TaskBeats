# Aplicativo TaskBeats

Aplicativo para criar lista de tarefas com um link de noticias do mundo.

## :camera_flash: Screenshots
<table>
  <tr>
    <td><img src="/result/IMG_1.png" width="260"></td><td><img src="/result/IMG_2.png" width="260"></td><td><img<td><img src="/result/IMG_3.png" width="260"></td><td><img src="/result/IMG_4.png" width="260"></td>
  </tr>
</table>

Este README fornece uma visão geral do projeto Android TaskBeats, incluindo as principais tecnologias e bibliotecas utilizadas.

## Tecnologias
- Android: O projeto é desenvolvido na plataforma Android, usando a linguagem Kotlin para programação.
- Retrofit
- ViewModel
- RecyclerView
- LiveData
- Room

## Testes Unitários
- **Mockito-Kotlin: Para simular dependências nos testes.**
- **JUnit: Para estruturar e executar testes unitários.**

## Bibliotecas
### Retrofit
- RetrofitModule: Configura o cliente Retrofit para fazer solicitações à API de notícias.

### ViewModel e LiveData
- NewsListViewModel: Gerencia a obtenção de dados de notícias da API e fornece LiveData para observar as atualizações dos dados.

### RecyclerView e Adapter
- NewsListAdapter: Um adaptador usado com o RecyclerView para exibir uma lista de notícias.

### Room
- AppDataBase: Classe que representa o banco de dados local do aplicativo para armazenamento de tarefas.
- TaskDao: Interface para acessar e gerenciar o banco de dados local do aplicativo para tarefas.

## Classes e Estruturas de Dados
- TaskAction: Representa ações relacionadas a tarefas.
- Atividades e Fragmentos
  - MainActivity: Atividade principal do aplicativo, com navegação entre listas de tarefas e notícias.
  - NewsListFragment: Fragmento que exibe a lista de notícias.
  - TaskDetailActivity: Atividade para adicionar ou atualizar tarefas.
- Outros Componentes
  - ActionType: Enumeração que define tipos de ações em tarefas, como excluir, atualizar ou criar.

