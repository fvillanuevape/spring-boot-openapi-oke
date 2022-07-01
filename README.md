# Spring Boot Open API OKE
## Desarrollo de una API con Spring Boot usando Docker y Kuberntes. 
* Se desarrolló una API de articulos con una base de datos en memoria.
* Se usó docker para el despliegue de los contendores.
* Se usó docker compose para un entorno de desarrollo y desplegar los contenedores de manera sencilla en base a un archivo de configuración YAML.
* Se usó el servicio de Kubernetes Engine de Oracle Cloud (OKE), el cual despliega de manera automatica el servico Oracle Load Balancer para la publicación de la API de manera externa.
* Se usó OAS 3.0.1 para la documentación de la API.
* Se usó también el servicio de Oracle Cloud Registry. el cual es un repositorio para nuestras imagenes docker.


`Tener en cuenta que es una demo sobre como desplegar una API desarrollado en Spring Boot y desplegado en Kubernetes y de runtime de contenedor con Docker, ya que por lo general en un ambiente productivo se contaría con una arquitectura de solución con distinto servicos de cloud.`

## Detalle de API y OpenAPI

| Detalle     | Valor |
|-------------|-------|
| API Article |    http://localhost:8090/api/v1/article   |
| Swagger UI  |   http://localhost:8090/swagger-ui/index.html#/    |
| Open API    |    http://localhost:8090/v3/api-docs   |


## Documentación

**En los siguientes enlaces les dejo una documentación para conocer más sobre las tecnologias y servicios de cloud usadas.**
 
 * [Spring Boot with Docker](https://spring.io/guides/gs/spring-boot-docker/)
 * [Overview of Container Engine for Kubernetes](https://docs.cloud.oracle.com/es-ww/iaas/Content/ContEng/Concepts/contengoverview.htm)
 * [Desplegando servicios en contenedores utilizando Oracle Cloud Infrastructure (OCI) Container Engine for Kubernetes (OKE)](https://www.oracle.com/lad/technical-resources/articles/cloudcomp/oci-kubernetes.html)
 * [https://spring.io/guides/gs/spring-boot-kubernetes/](https://spring.io/guides/gs/spring-boot-kubernetes/)
 * [The OpenAPI Specification](https://github.com/OAI/OpenAPI-Specification)
 * [H2 Database Engine](https://www.h2database.com/html/main.html)
 * [Push an Image to Oracle Cloud Infrastructure Registry](https://www.oracle.com/webfolder/technetwork/tutorials/obe/oci/registry/index.html)
 
 