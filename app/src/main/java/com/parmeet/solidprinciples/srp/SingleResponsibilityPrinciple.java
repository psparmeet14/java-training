package com.parmeet.solidprinciples.srp;

/**
 * SOLID principles:
 * These principles help developers build systems that are easier to modify and extend over time
 *
 * S in SOLID = Single Responsibility Principle
 *
 * Every software component should have one and only one responsibility.
 * - component can be a class, a method, or a module.
 *
 * As per uncle Bob:
 * Every software component should have one and only one reason to change
 *
 * SRP enhances
 * - modularity (each class or module has one clear purpose)
 * - testability
 * - ease of understanding
 * - maintainability
 * - scalability
 * - extensibility
 *
 * Cohesion
 * - Cohesion is the degree to which the various parts of a software component are related
 * - degree of relation
 * - Aim for high cohesion
 * - Higher cohesion helps attain better adherence to the Single Responsibility Principle
 * - low cohesion is bad
 *
 * Coupling
 * - Coupling is defined as the level of inter-dependency between various software components
 * - Loose coupling helps attain better adherence to the Single Responsibility Principle
 * - tight coupling - undesirable feature
 * - Aim for loose coupling
 *
 * Aim for high cohesion. (each class does one well-defined job)
 * Aim for loose coupling. (each class interacts with others through simple, well-defined interfaces)
 *
 * Following Single Responsibility Principle can lead to considerable software maintenance costs.
 * An overly strict application can lead to a scattered codebase with too many tiny components, making integration,
 * debugging, and overall system comprehension more difficult.
 * It is important to strike a balance between the two.
 * The Single Responsibility Principle is a guideline, not a rule.
 * It is important to use your judgment to determine the right level of granularity for your software components.
 */
public class SingleResponsibilityPrinciple {


}


