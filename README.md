# People
Api Rest para gerenciamento de pessoas.

## Instalação Rápida

**1. Instalar Git**

**2. Instalar Docker**

**3. Instalar Docker compose**

**4. Clonar a aplicação**
```bash
git clone https://github.com/meloafc/people.git
```
**5. Navegar para a aplicação clonada**
```bash
cd people
```
**6. Executar o docker compose**
```bash
docker-compose up --build
```

O docker irá instalar e configurar todas as dependências necessárias para executar a aplicação, depois de alguns segundos a aplicação estará execultando em:

+ api: <http://localhost:8080/swagger-ui.html>

## Instalação Manual
### Requisitos backend

1. Java - 1.8.x
2. Maven - 3.x.x
3. Mysql - 5.x.x

### Etapas para a instalação

**1. Clonar a aplicação**

```bash
git clone https://github.com/meloafc/people.git
```

**2. Configurar o Mysql**
```bash
create database people
```

**3. Configurar usuário e senha do Mysql**

+ Abrir `pom.xml`

+ Trocar `DATASOURCE.URL`, `DATASOURCE.USERNAME` e `DATASOURCE.PASSWORD` por sua configuração.

**4. Executar o backend**

```bash
cd people
mvn spring-boot:run
```

ou
```bash
cd people
mvn spring-boot:run -DDATASOURCE.URL=jdbc:mysql://localhost:3306/people?useSSL=false -DDATASOURCE.USERNAME=root -DDATASOURCE.PASSWORD=root
```

O backend começará a ser executado em <http://localhost:8080/swagger-ui.html>.

### Tecnologias utilizadas
+ Spring boot
+ Mysql
+ Docker

### Outros
Comando docker para iniciar um servidor mysql:
```bash
docker run -d --name mysql-people -p 3306:3306 --restart=always -e MYSQL_DATABASE=people -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=root -e MYSQL_PASSWORD=root mysql/mysql-server:5.7
```
