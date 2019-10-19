How I’m developing my application in Java: Phase one
A.
1.	Name of the application GreenShop
2.	Define the scope of the application:
What the application should do?
-	Add products in store
-	Add users in GreenShop
-	User can add products in GreenShop cart
3.	Designing the application
a.	Define the Classes and their packages
(See structure from Marinela: https://docs.google.com/document/d/1gMK9ZwsvTES477wDI71VRxvdl9NNFXE1tixLckvc5IE/edit)
Package: com.UG
Package: model
Package: db
Package: constants
Package: controller
Package: repository

Class: Product
Class: Client

b.	Define the fields (or instance variables)
(https://www.homeandlearn.co.uk/java/field_variables.html)
DOB: https://www.joda.org/joda-time/

Class Product:
Id
ProductName
Unit
Quantity
Price

Class Client:
Id
FirstName
LastName
Location
UserName
Password
4.	IJ
a.	Create classes: fields, methods
b.	JDBC – create table greenshop
c.	Persistence.xml
 connection with db
d.	Pom.xml
Properties..

e.	scenebuilder






c.	Define the methods inside the classes.
B.

SB - Date of birth – Date Picker
https://code.makery.ch/blog/javafx-8-date-picker/
SB – Year – spinner
https://medium.com/@joshwickham/creating-an-integer-spinner-in-javafx-f8fda8d12ae5
https://stackoverflow.com/questions/31214745/how-to-configure-javafx-numeric-spinner-in-scenebuilder-8
QA:

1.	Diagrams
2.	File – Add
3.	Edit - > update
4.	Validation
5.
