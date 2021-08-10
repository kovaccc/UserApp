# UserApp
An application that displays a list of users

## About
Android project that has it's own API that allows communication of the application and User list API available on the web server. The API is based on the REST architecture and it is using Retrofit and OkHttpClient with method GET to get response from service. The results retrieved are structured in a JSON transport format.

## Features
The android app lets you:

- Get users from REST API
- Show users in a list 
- Get error messages in case of unsuccessful response
 
## Tech-stack
The project seeks to use recommended practices and libraries in Android development.
- MVVM architecture (Viewmodel + LiveData)
- Kotlin Android Extensions 
- Hilt dependency injection
- ...

## Screenshots
![image](https://user-images.githubusercontent.com/75457058/128920066-4b66357c-95fa-409a-9859-979b68e8f1d2.png)
![image](https://user-images.githubusercontent.com/75457058/128920117-94ebd9cf-2905-4d0e-8fb9-e7c4c1774de5.png)

## Setup
1. Clone the repository
```
https://github.com/kovaccc/UserApp.git
```
2. Open the project with your IDE/Code Editor
3. Run it on simulator or real Android device
