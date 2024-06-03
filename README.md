# Spring with Circuit Breaker

## Introduction

This project uses Resilience4j, a fault tolerance library designed for Java8 and functional programming. Resilience4j provides several modules to help your application withstand failures in a distributed system, allowing you to build resilient applications.

## Modules

Resilience4j used configurations:

-  **slidingWindowType**: Type of Circuit Breaker based in request count.

-  **registerHealthIndicator**: Show address in health check.

-  **failureRateThreshold**: Sets rate limit failure in 50% to circuit breaker switch to open state.

-  **minimumNumberOfCalls**: Sets request amount 5 to circuit analysis.

-  **automaticTransitionFromOpenToHalfOpenEnabled**: Enable automatic state transition.

-  **waitDurationInOpenState**: Sets duration to 60s of state circuit open to avoid calls on service that has errors.

-  **permittedNumberOfCallsInHalfOpenState**: Sets 3 requests to analysis state to half opened.
