# Weather API & MockServer Demo
The purpose of this simple project is to show how to use MockServer for Component testing in a microservices architecture.

## Requirements
* Docker runtime

## Running
To start the Weather Service just

```
$ docker compose up
```

## Testing

```
$ curl http://localhost:8080/current
```
or 
```
$ curl http://localhost:8080/forecast
```

## Editing expectations

Just open the `mock-configuration/initializerJson.json` file and change it as you wish.
