# Java-Project

## School Management System

[Strictly adhere to the object oriented programming specifications given in the problem statement. Template code is provided to ease the input output process. Template code will not compile. You need to fill in the missing code.]

#### Business Requirement:

Your task is to create a basic School management System where students can register to courses, and view the course assigned to them.

#### Work-Flow:

Only students with right credentials can login. Otherwise, a message is display stating: “Wrong Credentials”.

1. Valid students are able to see the courses they are registered.
2. Valid students are able to register to any course in the system.

### Requirement 1:

![screen shot 2018-09-05 at 6 05 06 pm](https://user-images.githubusercontent.com/29616111/45124142-3973ad00-b137-11e8-98af-e72e539b511b.png)

### Requirement 2:
#### Model Class:

Create a package in the src folder named: CoreJava.Models, in this package you will create every model class.

Every Model class must contain the following general two requirements:

First constructor takes no parameters and it initializes every members to an initial value.
Second constructor must initialize every private member with a parameter provided to the constructor.
Create a class Student with the private member variables specified in TABLE 1. These private members must have GETTERS and SETTERS methods.

The purpose of the Student class is to carry data related to one student.

![screen shot 2018-09-05 at 6 06 32 pm](https://user-images.githubusercontent.com/29616111/45124147-3973ad00-b137-11e8-86b5-e09e76d8549c.png)

### Requirement 3:
#### Data Access Objects

Under the package named: CoreJava.DAO, create a class and call it StudentDAO. This class is going to be used to search the csv files for student’s information only.

![screen shot 2018-09-05 at 6 06 55 pm](https://user-images.githubusercontent.com/29616111/45124143-3973ad00-b137-11e8-8071-382a71302d66.png)

Under the package named: CoreJava.DAO, create a class and call it CourseDAO. This class is going to be use to query the database for course’s information only.
![screen shot 2018-09-05 at 6 07 15 pm](https://user-images.githubusercontent.com/29616111/45124144-3973ad00-b137-11e8-8b9c-389bc8221316.png)

Under the package named: CoreJava.DAO, create a class and call it AttendingDAO. This class is going to be use to query the database for Attending’s information.
![screen shot 2018-09-05 at 6 07 30 pm](https://user-images.githubusercontent.com/29616111/45124145-3973ad00-b137-11e8-80e7-0e08708dcf6c.png)

### Requirement 4:
#### Main Entry

Inside the package named: CoreJava.MainEntryPoint, there is a class named: MainRunner. When your code is complete, this class will be used to run the School Management System. None of the code in this class should be modified, and it should therefore only be used to test your code after you’ve finalized everything.

In the same package, there is also a class named TestRunner. Feel free to use this class to test your code as much as you’d like. Feel free to make changes. The content of the TestRunner class will not be factored into or used at all for your grade. Feel free to copy any of the code fromMainRunner into this class if you’d like to try making any modifications.

Sample: Students. Once a student is logged in, the student is able to see all the courses she/he is registered to. Two options are available 1. Register to Class and 2. Logout. If option 1 is selected, then the student is able to see all the courses and register to any of them.

![screen shot 2018-09-05 at 6 08 01 pm](https://user-images.githubusercontent.com/29616111/45124146-3973ad00-b137-11e8-9bd8-c0372f04f728.png)
# JavaBasicOOP-DAO
