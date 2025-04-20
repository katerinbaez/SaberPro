# 🧠 Sistema Saber Pro

    Sistema académico diseñado para la gestión de evaluaciones tipo Saber Pro, desarrollado con Spring MVC y JPA. Permite administrar estudiantes, coordinador, resultados y reportes.

---

## 📌 Estado del Proyecto

✅ Proyecto finalizado
✅ Proyecto Desplegado

El sistema ha sido completamente implementado con arquitectura MVC, persistencia de datos mediante JPA y una interfaz web amigable. Está listo para su uso.

---

## 🛠️ Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)
- Thymeleaf
- Bootstrap 5
- Base de datos MongoDB 
- Maven

---

## 📚 Funcionalidades Principales

- Registro y gestión de estudiantes
- Administración de evaluadores
- Registro y visualización de resultados
- Reportes por estudiante Y general
- Login de usuarios con roles
- Validaciones y manejo de errores

---

## 🏗️ Estructura del Proyecto

```plaintext
src
└── main
    ├── java
    │   └── com
    │       └── saberpro
    │           ├── controller        # Controladores Spring MVC
    │           ├── model             # Entidades JPA
    │           ├── repository        # Interfaces JPA para acceso a datos
    │           ├── service           # Lógica de negocio
    │           └── SaberProApplication.java  # Clase principal
    └── resources
        ├── templates                # Vistas Thymeleaf
        ├── static                   # CSS, JS, imágenes
        └── application.properties   # Configuración general
```
## ⚙️ Configuración de la Base de Datos
Para usar MongoDB, asegúrate de tener el servidor ejecutándose localmente o en la nube, y configura application.properties así:

```properties
spring.data.mongodb.uri=mongodb://localhost:8013/saberpro
spring.data.mongodb.database=saberpro
spring.thymeleaf.cache=false

```
---

## 🚀 ¿Cómo ejecutar el proyecto?
Pasos claros para ejecutar el proyecto localmente:

1. Clonar el repositorio.

2. Abrirlo en SpirngBoot.

3. Configura la base de datos.

4. Ejecutar los micorservicios.

5. Accede a la aplicacion: http://localhost:8013
   
