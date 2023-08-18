# HexagonalSpring_Modular

HSMB-v3 is a sample project that demonstrates the implementation strategy of a [HexagonalSpring_Modular](https://github.com/tsechelidisMichail/HexagonalSpring_Modular) 
aiming to resolve the remaining development requirements of it. 
The proposed architecture that the example is based upon aims to provide the project with the ability to later **cooporate** with Service Oriented Architectures.


## Table of Contents

- [Introduction](#introduction)
- [Architecture Overview](#architecture-overview)
- [Branches-Modules](#Branches-Modules)
- [Implementation Strategy](#Implementation-Strategy)
- [License](#license)

## Introduction

Hexagonal architecture is a good starting point for a Distributed System to identify its surrounding functionalites. By already having interfaces as ports, the indetification of the modules-to-be-created becomes easier.
 This means, that apart from the domain, there is the need for persistence and code that enables the communication with other systems, and those are seperated from each other.  
The modules in this repository have their own lifecycle compared to HexagonalSpring_Modular since now their respective artifacts are uploaded in Github packages.  
For more information about the arising questions see:  
- [M. Tsechelidis, N. Nikolaidis, T. Maikantis, and A. Ampatzoglou, "Modular Monoliths the Way to Standardization", 3rd Eclipse Security, AI, Architecture and Modelling Conference on Cloud to Edge Continuum (ESAAM 2023), Germany, 2023.](#esaam-link-TBA)
- [M. Tsechelidis, "Developing Distributed Systems with Modular Monoliths and Microservices", psepheda, University of Macedonia, Greece, 2023.](#BSc-link-TBA)
<a name="esaam-link-TBA"></a><a name="BSc-link-TBA"></a>

## Architecture Overview

![Example project as implementation of proposed architecture](https://github.com/tsechelidisMichail/HexagonalSpring_Modular/assets/82568995/08b2e58d-6e5d-4d7e-8ed3-5ab5895abf9c)  
  
  
While it may not seem apparent at first, with the help of Dependency Injection and a couple of patterns, the diagram is enforced to resemble a tree-like structure.  
The internal functionalities remain hidden from developers since those are provided at runtime and not compile time.

![Figure 1 - Modular Monolith vs Monolith drawio](https://github.com/tsechelidisMichail/HexagonalSpring_Modular/assets/82568995/af7b7cae-1e05-488a-a755-5933bb5c226a)


## Branches-Modules

- `main`: Initializer scanning in runtime the dependencies/services. It is the executable.
- `domain`: Global/core logic that any service can use (interface definitions only - like API).
- `domain_imp`: Implementation of domain, and any other class to support the exposed domain to the services.
- `web_account`: Inbound and outbound handling for account (service).
- `web_movies`: Inbound and outbound handling for movies (service).
- `queries`: Global/core queries that any service can use (interface definitions - like API).
- `databasePrimary`: Schemas, and queries implemention (used by account and movie).
- `databaseSecondary`: Schemas, and queries implemention (used by movie).

The following is an example diagram of how to structure the branches.  
![branches](https://github.com/tsechelidisMichail/HSMB-v3/assets/82568995/1e0c44d6-356a-4081-9d5a-b8010621fd49)

## License

This project is licensed under the [MIT License](LICENSE).

