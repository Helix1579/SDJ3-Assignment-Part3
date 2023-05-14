# Slaughterhouse Assignment SDJ3

This repository contains the implementation of a simulation system for a nearby slaughterhouse. The system simulates the operations involved in the slaughterhouse process, including animal arrival, cutting into smaller parts, and packaging of products for distribution.

## Description
The Slaughterhouse Simulation System is a Java-based project developed for the SDJ3 course at VIA University. It simulates the workflow of a slaughterhouse, enabling the management of animal arrival, part cutting, and product packaging. The system ensures accurate tracking and registration of animals and their corresponding parts throughout the process.

## Project Parts
The project was divided into four parts, and each part was successfully implemented:

1. **Part 1: System Architecture Design**: A domain model of the slaughterhouse and an architectural overview of the system were created. This helped visualize the key entities and their relationships, as well as the communication patterns between different components of the system.

2. **Part 2: Animal Registration System**: An Animal Registration System was implemented as a RESTful web service. It allows for the registration of animals, storing their details such as date, weight, registration number, and origin. Functionality to retrieve specific animal information and filter animals by date and origin was also provided.

3. **Part 3: Information Retrieval Service**: An Information Retrieval Service was developed using gRPC. The service enables the retrieval of information about animals and products, including registration numbers for animals involved in a product and all products associated with a specific animal. It is integrated with a database for efficient data storage and retrieval.

4. **Part 4: Complete System Implementation**: The entire slaughterhouse simulation system was implemented by integrating the Animal Registration System, Information Retrieval Service, and Product Packaging Subsystem. The documentation was updated to reflect the complete system implementation, and comprehensive testing was performed to validate the functionality and integrity of the system.


