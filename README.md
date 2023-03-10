<h1>🎦Cinema-app🎦 </h1>
<h2>📝 Description:</h2>
This is a simple REST API of cinema service, with authentication and authorization. <br>
Users can buy movie tickets for different sessions, while admins can manage the cinema, create <br>
movie sessions and manage other useful functional for the cinema. <br>
Project was implemented according to SOLID principles and has N-tire architecture. <br>

# <h2>🔥 Features:</h2>
|  Role   | Possibility                                                                                                                  | Endpoints                                                                                                                                                                                                                                   |
|:-------:|:-----------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `ADMIN` | - Add/Get movies, cinema halls<br>- Add/Get and delete movie sessions<br>- Find users by email                               | GET: `/cinema-halls`<br/>POST: `/cinema-halls`<br/>GET: `/movies`<br/>POST: `/movies`<br/>GET: `/movie-sessions/available`<br/>POST: `/movie-sessions`<br/>PUT: `/movie-sessions/{id}`<br/>DELETE: `/movie-sessions/{id}`<br/>GET: `/users/by-email` |
| `USER`  | - Get movies, movie sessions and cinema halls<br>- Add tickets to shopping cart<br>- Complete orders<br>- Get orders history | GET: `/cinema-halls`<br/>GET: `/movies`<br/>GET: `/movie-sessions/available`<br/>GET: `/orders`<br/>POST: `/orders/complete`<br/>PUT: `/shopping-carts/movie-sessions`<br/>GET: `/shopping-carts/by-user`                                          |

## <h2>🎫 Project structure:</h2>
<h3>The project is based on the N-tier architecture</h3>

* Controllers (Presentation layer)
* Services (Application layer)
* DAO (Data access layer)
  <h3>📌Entities relations in database:</q></h3>
  <img src="img/relations.png" alt="drawing" width="60%">

## <h2>‍🔧 Tech stack:</h2>
* JDK 17
* Maven 4.0
* Spring (Web/Security) 5.2.2
* Hibernate 5.4.27
* Tomcat 9.0.69
* MySQL 8.0.24

## <h2>🔑 Standard credentials:</h2>
|  Role   |   Email    |   Password   |
|:-------:|:----------:|:------------:|
| `ADMIN` | admin@i.ua |    admin     |
| `USER`  | user@i.ua  |     user     |

To configure it use -> [DataInitializer](src/main/java/cinema/DataInitializer.java).

## <h2>🚀 How to launch this project:</h2>
1. Install MySQL 
2. Install TomCat 9.0.69 <br>
3. Install Postman <br>
   (for easy request management)
4. Clone project from GitHub
5. Configure [db.properties](src/main/resources/db.properties), to connect with DB. <br>
(Set fields: URL, USERNAME, PASSWORD, JDBC_DRIVER to ur own)
6. Configure TomCat for this project
7. 🚀 Run & Enjoy 😺
