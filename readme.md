#Legacy Games

## como lanzar la bases de datos

```
docker run --name postgres-container --rm  -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -e POSTGRES_USER=default -d postgres
```