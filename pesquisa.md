# Pesquisa - Comandos Git e Repositórios Remotos

## Comandos Git

**git rm** — Remove arquivos do diretório de trabalho e da área de staging, marcando-os para exclusão no próximo commit.

**git checkout** — Usado para alternar entre branches ou restaurar arquivos para um estado anterior específico.

**git reset --soft** — Desfaz o commit, mas mantém as alterações na área de staging (index).

**git reset --mixed** — Desfaz o commit e remove as alterações da área de staging, mas mantém no diretório de trabalho (é o comportamento padrão do reset).

**git reset --hard** — Desfaz o commit e descarta completamente as alterações, tanto da staging area quanto do diretório de trabalho.

**git remote rename** — Renomeia um repositório remoto já configurado (ex: mudar "origin" para outro nome).

**git remote remove** — Remove a referência de um repositório remoto configurado localmente.

**git clone** — Copia (clona) um repositório remoto para uma máquina local, criando uma cópia completa do histórico.

**git commit --amend** — Permite modificar o último commit realizado, seja alterando a mensagem ou adicionando novas alterações a ele.

**git branch** — Lista, cria ou deleta branches (ramificações) dentro do repositório.

**git merge** — Une o histórico de duas branches diferentes, combinando as alterações em uma única branch.

**git rebase** — Reaplica commits de uma branch sobre outra, reorganizando o histórico de forma linear (alternativa ao merge).

## Repositórios Remotos

**GitLab** — Plataforma de hospedagem de repositórios Git que oferece controle de versão, CI/CD integrado e ferramentas de gerenciamento de projetos, podendo ser usada na nuvem ou instalada em servidores próprios.

**TFS (Team Foundation Server)** — Ferramenta da Microsoft para gerenciamento de código-fonte, controle de versão, rastreamento de tarefas e integração contínua, muito usada em ambientes corporativos com .NET.

**Azure Repos** — Serviço da Microsoft Azure DevOps para hospedagem de repositórios Git ou TFVC, com suporte a pull requests, branches e integração com pipelines de CI/CD.

**Bitbucket** — Plataforma da Atlassian para hospedagem de repositórios Git, integrada com outras ferramentas como Jira e Trello, muito usada em times que já utilizam o ecossistema Atlassian.
