# spring-data-jpa-masterclass

## A good understanding of the usage of spring-data with REST Service and using MySQL as local Database

### Software Required
* [Java 1.8](https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html)
* [Spring tool Suite](https://spring.io/tools) or [Eclipse](https://www.eclipse.org/downloads/packages/)
* [Apache Maven](https://maven.apache.org/download.cgi)
* [Git Bash](https://git-scm.com/downloads)
* [MySQL](https://dev.mysql.com/downloads/mysql/) - Download the Community Edition. If it is a problem then you can download another one as provided below
* [DBeaver](https://dbeaver.io/download/) - DBeaver. A MySQL Client
* [Postman](https://www.postman.com/downloads/)

### Steps to execute the DB Scripts
Run the below scripts in any of the software either in MySQL Workbench or in SQLYog

* create_database.sql - It will create the database named as <strong>spring</strong>
* drop_database.sql - It will delete the database <strong>spring</strong> 

But don't run it before the create_database.sql, otherwise it will throw the error stating `No database is present with this name`

* create_table.sql - It will create the table <strong>User</strong> under <strong>spring</strong> schema

But though it is not required to execute, because when you run the application as Spring Boot and try to call the <strong>POST</strong> method it will automatically create the table <strong>User</strong> under <strong>spring</strong> database

* drop_table.sql - To delete the <strong>User</strong> table

### Steps to clone and run the application
* Install MySQL. Complete installation steps of [MySQL Workbench](https://www.sqlshack.com/how-to-install-mysql-database-server-8-0-19-on-windows-10/) are provided
* If you face any problem while installing MySQL Workbench, then you can install SQLYog as mentioned in the Software Required steps
* After installing the MySQL search in the Start command with MySQL and you will found the MySQL Command Line Client.
* Hit the Enter button it will open a Command Prompt and opt for password.
* Provide the password MySQL Server will get connected.
* Open Git Bash or even you can open Command Prompt (if you are using Windows) or Terminal (if you are using MAC) in your machine
* Clone the application from github.com as   
<code>git clone https://github.com/c86amik/spring-data-jpa-masterclass.git</code>
* Open either <strong>STS</strong> or <strong>Eclipse</strong> and import the application as <strong>Maven</strong> project
* After the application got successfully imported in either <strong>STS</strong> or <strong>Eclipse</strong>
* Right Click on the application, select the <strong>Run As</strong> option, and then select <strong>Spring Boot App</strong>
* The application will start in the port <strong>7110</strong>
* Open the Postman and test the REST Endpoints

### Testing using Postman
<ol>
<li><strong>Get All Users</strong> - localhost:7110/allUsers</li>
<li><strong>Save an User</strong> - localhost:7110/saveUser</li>
<li><strong>Update an User</strong> - localhost:7110/updateUser/{id}. Here <strong>{id}</strong> is the id of the record stored in MySQL DB</li>
<li><strong>Delete an User</strong> - localhost:7110/deleteUser/{id}</li>
<li><strong>Get user by firstName</strong> - localhost:7110/getUserByFirstName/{firstName}</li>
<li><strong>Get user by lastName</strong> - localhost:7110/getUserByLastName/{lastName}</li>
<li><strong>Get user by mobileNo</strong> - localhost:7110/getUserByMobileNo/{mobileNo}</li>
<li><strong>Get user by Email</strong> - localhost:7110/getUserByEmail/{email}</li>
<li><strong>Get user by panNo</strong> - localhost:7110/getUserByPan/{panNo}</li>
<li><strong>Get user by name</strong> - localhost:7110/getUserByName/{firstName}/{lastName}. Here <strong>name</strong> is the combination of <strong>firstName</strong> and <strong>lastName</strong></li>
</ol>

#### Dummy JSON object
* Body for the <strong>POST</strong> Method   
<code>{
	"firstName" : "First Name",
	"middleName" : "",
	"lastName" : "Last Name",
	"mobileNo" : "1234567890",
	"email" : "test@email.com",
	"panNo" : "ABCDE1234F"
}</code>
* Body for the <strong>PUT</strong> method
<code>{
	"userId" : "1",
	"firstName" : "First Name",
	"middleName" : "",
	"lastName" : "Last Name",
	"mobileNo" : "1234567890",
	"email" : "test@email.com",
	"panNo" : "ABCDE1234F"
}</code>

	