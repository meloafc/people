# People

Comando docker para iniciar um servidor mysql:
```bash
docker run -d --name mysql-people -p 3306:3306 --restart=always -e MYSQL_DATABASE=people -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=root -e MYSQL_PASSWORD=root mysql/mysql-server:5.7
```
