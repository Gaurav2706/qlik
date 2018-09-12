# qlik
-----Description about Implementation Architecture--------


It is a messaging service which allows users to post new messages , pull out all the messages posted , retrieve specific message
and to check the message as palindrome text or not. 

There are total 4 URIs to get all the information - 
-- post messages by users (Collection URI) : http://localhost:8080/messenger/webapi/messages/

Example -- 

Input--                                   
{
        "message": "nitin"
}

Output--

{
    "dateCreated": "2018-09-12T17:07:31.965",
    "id": 1,
    "message": "nitin",
    "palindrome": false
}



-- get all messages posted (Resource URI)  : http://localhost:8080/messenger/webapi/messages/

[
    {
        "dateCreated": "2018-09-12T17:07:31.965",
        "id": 1,
        "message": "nitin",
        "palindrome": false
    },
    {
        "dateCreated": "2018-09-12T17:09:05.692",
        "id": 2,
        "message": "Hello",
        "palindrome": false
    },
    {
        "dateCreated": "2018-09-12T17:09:11.569",
        "id": 3,
        "message": "Helllllll",
        "palindrome": false
    }
]
-- retrieve specific message with their     
   id's and check whether it is palindrome or not (Resource URI) : http://localhost:8080/messenger/webapi/messages/1
   
   {
    "dateCreated": "2018-09-12T17:07:31.965",
    "id": 1,
    "message": "nitin",
    "palindrome": true
}
-- delete the specific message (Resource URI) :  http://localhost:8080/messenger/webapi/messages/1

No content ok 

--------------------------------------------------------------------------------------------------

        get 1 or * msg
 USER ----------------
  |       delete msg            |          
  |                   |
  |Post * messgs      |     
  |                   |          
MESSAGE---------------



----------------------------------------------------------------------------------------------------

Building and deploying a Front end and Backednd application

-created a EC2 instance on Amazon and deploy the war file on Tomcat with jdk installed on Lunix machine. 
- up the tomcat server > Backend is running on server now. 

-- deploy the UI on same machine having URL 


Thank you.....
-----------------------------------------------------------------------------------------------------
