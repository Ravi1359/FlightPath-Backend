# Flight Simulator Backend

This repository contains the backend code for a flight simulator application. It provides functionality to find flight paths between airports and retrieve weather information for those paths.

## Technologies Used

- Java
- Spring Boot
- RESTful APIs
- Jackson JSON
- Lombok

## Setup

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/yourusername/backend-Flight-Sim.git
    ```

2. Open the project in your preferred IDE.

3. Build and run the project using Maven or your IDE's built-in tools.

## Configuration

### AppConfig

The `AppConfig` class is responsible for configuring Spring beans, including the `RestTemplate`.

### FlightController

The `FlightController` class defines REST endpoints for handling flight-related requests. It injects the `FlightService` dependency to process flight path requests.

### FlightService

The `FlightService` class contains business logic for finding flight paths and retrieving weather information. It communicates with external APIs to accomplish these tasks.

### DTOs and Mappers

Several DTO (Data Transfer Object) and mapper classes are used to structure and map data between the application and external services. These include `FlightDTO`, `SimpleWeatherResponse`, `WeatherResponse`, and various mapper classes.

## Usage

1. Send POST requests to `/api/flightPath` with a JSON payload containing start and end airport codes to find the flight path and weather information.

Example Request Body:
```json
{
  "start": "JFK",
  "end": "LAX"
}
