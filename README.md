# Spring-Boot-GCP-MYSQL-DB
Spring-Boot-GCP-MYSQL-DB

### Spring Boot Application connect with MySQL DB

In this project used username, password, url for db connect

> Whitelisted static public address


Steps:

1. Simple Project created
2. Then SQL->create new instance -> MySQL DB
3. **Whitelisting IP address GCP UI** 
4. SQL->connections->Networking added IP address.
5. Add one simple DB for spring project like: new-db 
6. Check users in Users tab, also want to change password or view or update password.
7. Create normal spring boot project.
8. Use MySQL dependency
9. used username, password, URL (SQL instance public IP address: port number is optional)
10. ddl-auto should be update.

Knowing the static public IP address from any Linux system like: Codespaces, Docker-container, GCP Cloud shell
```
>ip=$(curl -s https://api.ipify.org)
>echo "Here is my address: $ip"
```

If you want to connect MySQL DB from GCP Cloud shell then

1. `>mysql -h 35.223.42.83 -u root -p`
2. `>show databases;`
3. `>use new-db;`
