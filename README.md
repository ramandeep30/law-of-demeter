### LAW OF DEMETER

This laws says our function should only access the classes/objects that it has direct access to which are:

               i. Objects in class parameter
               ii. The object in function parameter
               iii. The object in class members
               iv. Objects created inside the function body.

This code briefly explains what would happen if violates this law.
Also, contains both the wrong and the correct way to implement this law.