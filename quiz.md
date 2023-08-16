How do you get all tour ratings for tour 3 sorted by the customer identifier number, lowest to highest?
- GET
  http://localhost:8080/tours/3/ratings?sort=pk.customerId,asc

How do you get all tour ratings for tour 3 sorted by the comment in alphabetical order?
- GET
  http://localhost:8080/tours/3/ratings?sort=comment,asc

What mapping annotation denotes a method for deleting information?
- @DeleteMapping 

What mapping annotation denotes a method for fetching information?
- @GetMapping

What mapping annotation denotes a method for creation?
- @PostMapping

Why would you choose Spring Web MVC over Spring Data REST?
- require business layer service
- hide internal data model(Entity Schema)
- not using Spring data repositories
