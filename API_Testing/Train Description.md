Description


INSTRUCTION TO SUBMIT CODE TO TEKSTAC CODE EDITOR

This activity needs to be done in Postman 9.30.x version installed in your local machine.

Once the exercise is completed, follow the steps given below to submit the file to Tekstac editor.

STEP 1:

Export the collection as file by clicking the option shown below.





STEP 2 :

Export the collection as collection 2.1 JSON. Save the file.



STEP 3 :

Open the file in a notepad OR notepad++.  Copy the file content.





STEP 4 :

Paste the content on to the Tekstac code editor.





Let us continue with the exercise,


The given API,
        URL  :   https://webapps.tekstac.com/TrainAPI

provides various services like BookingService, PassengerService and TrainService which helps in viewing, creating, updating and deleting corresponding elements.

In this problem you need to,
a)   Identify the name of the passenger by the mobile number.
b)  Identify a particular train and check the total passenger count within the given duration.
c) Add booking and re-check total passenger count.

1) Create a new Collection  "Train Booking 1"
-         Add a new request  "FindPassenger"
-         Method :  GET           
-         Set the Request Header to Accept as application/json
           URL   :  
           https://webapps.tekstac.com/TrainAPI/PassengerService/viewPassengerByNameMobile/Rakesh/1234567890

-       Add postman(pm.test) test script to test,     

          Add a test  to find name of the Passenger with given mobile number.
          Store the passenger name in the global variable "PassengerName"
          Assert that the Passenger Name "to equals" "Rakesh"
          Testcase Name : "FindPassenger"

2) Add new request  "CheckPassengerCount"
-         Method  :  GET
-         Set the Request Header to Accept as application/json

            URL  : 
            https://webapps.tekstac.com/TrainAPI/BookingService/viewBookingList

-       Add postman(pm.test) test script to test,     

        Add the test  to check the count of passengers in the trains from Chennai to Coimbatore.
        Store the value in the global variable "InitialCount"
        Assert that the Passenger Count "to equals" 1
        Testcase Name  :  "CheckPassengerCount"


3) Add new request "ReCheckPassengerCount"
-        Method  :   POST
-         Set the Request Header to Accept as application/json
           
            URL : 
            https://webapps.tekstac.com/TrainAPI/BookingService/addBooking

-        Body:

vpl3171_img1.png

-       Add postman(pm.test) test script to test,  
        Add the test  to re check the count of passengers in the trains from Chennai to Coimbatore.
        Store the value in the global variable "IntrimCount"
        Assert that the Passenger Count "to equals" 4
        Testcase Name : "ReCheckPassengerCount"

4) Add new request "DeleteBooking"
-      Method  :  DELETE
-         Set the Request Header to Accept as application/json

            URL  :  
            https://webapps.tekstac.com/TrainAPI/BookingService/deleteBookingById/1003

-       Add postman(pm.test) test script to test,    
         Add the test to check the initial and final count of passengers in the trains from Chennai to Coimbatore is same.    
         Store the value in the global variable "FinalCount".
         Assert that both InitialCount and FinalCount are equals.
         Testcase : "ValidatePassengerCount"