package com.parmeet.solidprinciples.ocp;

/**
 * O in SOLID = Open-Closed Principle
 *
 * "Software components should be closed for modification, but open for extension"
 *
 * - Software entities should be open for extension but closed for modification
 * - Allows new changes without modifying existing code.
 *
 * Closed for modification:
 * New features getting added to the software component, should NOT have to modify existing code.
 *
 * Open for extension:
 * A software component should be extendable to add a new feature or to add a new behavior to it.
 *
 * Using abstraction (Use interfaces or abstract classes) - for decoupling.
 *
 * Key takeaways:
 * 1. Ease of adding new features.
 * 2. Leads to minimal cost of developing and testing software
 * 3. Open-Closed Principle often requires decoupling, which, in turn, automatically follows the Single Responsibility Principle.
 * 4. SOLID principles are all intertwined and interdependent.
 * 5. SOLID principles are most effective when they are combined together.
 * 6. It is important to get a wholesome view of all the SOLID principles.
 *
 * Caution:
 * 1. Do not follow the Open-Closed Principle blindly.
 * (
 * Avoid Over-Abstraction,
 * Subjective Decision-Making,
 * Balance Flexibility and Simplicity
 * )
 * 2. You will end up with a huge number of classes that can complicate your overall design.
 * 3. Make a subjective, rather than an objective decision. (Use OCP where it makes sense - when you expect that requirements
 * may evolve. Evaluate the likelihood of change versus the overhead of additional classes. If you're designing for a highly
 * volatile domain (like multiple invoice formats), abstraction is beneficial.
 *
 * -> Strive for a design that is flexible enough to accommodate change without making the system so fragmented
 * that understanding it becomes a challenge. This requires thoughtful judgment about the trade-offs between
 * extensibility and maintainability.
 */
public class OpenClosedPrinciple {
}
