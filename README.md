# BookMyShow System
* An online booking system allows purchasing movie show seats online.
* A system that allows customers to browse movies currently being played and book seats, anywhere and any time.

## Goals and Requirements:
### Functional Requirements:
1. The system should be able to list down different cities where its affiliate theaters are located.
2. Once the user selects the city, the service should display the movies released in that particular city.
3. Once the user selects the movie, the service should display the theaters running that movie and its available shows.
4. The user should be able to select the show at a particular theater and book their tickets.
5. The service should be able to show the user the seating arrangement of the theater hall and the user should be able to select multiple seats according to their preference.
6. The user should be able to distinguish available seats from the booked ones.
7. Users should be able to put a hold on the seats for five minutes before they make a payment to finalize the booking.
8. The user should be able to wait if there is a chance that seats might become available – e.g. when holds by other users expire.
Waiting customers should be serviced fairly in a first come first serve manner.

### Non-Functional Requirements:
1. The system would need to be highly concurrent. 
2. There will be multiple booking requests for the same seat at any particular point in time. The service should handle this gracefully and fairly.
3. The core thing of the service is ticket booking which means financial transactions. This means that the system should be secure and the database ACID compliant.



[design-bookmyshow-link](https://astikanand.github.io/techblogs/high-level-system-design/design-bookmyshow)
