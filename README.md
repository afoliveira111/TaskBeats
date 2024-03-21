# Android TaskBeats

Este README fornece uma visão geral do projeto Android TaskBeats, incluindo as principais tecnologias e bibliotecas utilizadas.

## Tecnologias
- Android: O projeto é desenvolvido na plataforma Android, usando a linguagem Kotlin para programação.
- Retrofit: O Retrofit é uma biblioteca utilizada para fazer solicitações HTTP à API de notícias.
- ViewModel: A arquitetura ViewModel é empregada para gerenciar a obtenção de dados da API de notícias.
- RecyclerView: O RecyclerView é usado para exibir listas de notícias e tarefas de forma eficiente.
- LiveData: O LiveData é empregado para atualizar a interface do usuário com dados em tempo real.
- Room: O Room é utilizado para a persistência de dados locais, permitindo o armazenamento e recuperação de tarefas do aplicativo.

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
