package com.parmeet.solidprinciples.lsp;

/**
 * L in SOLID = Liskov Substitution Principle
 *
 * - "Objects should be replaceable with their subtypes without affecting the correctness of the program"
 * - "Objects of a superclass should be replaceable with the objects of a subclass without affecting the correctness
 * of the program"
 * - "Sub classes / Derived classes must be substitutable for their base classes without affecting the correctness of
 * the program"
 *
 *
 *
 * Inheritance = Is-A way of thinking.
 *
 * Liskov Substitution Principle changes the 'Is-A' way of thinking
 *
 * "If it looks like a duck and quacks like a duck but it needs batteries, you probably have the wrong abstraction!"
 * Caution when using LSP:
 * - Careful Inheritance: Inheritance must be used only when the subclass truly conforms to the base class's contract.
 * - Testing the Substitution
 * - Balance with Other Principles: While LSP (and SOLID in general) drives modular and flexible design, applying these
 * principles blindly can lead to unnecessary complexity. Sometimes a simpler design (even if less "pure") is more practical.
 * Make a subjective decision based on hte domain requirements and the likelihood of change.
 * Avoid creating an explosion of classes where each tiny variation gets its own subclass unless you have a strong
 * reason to expect future extensions.
 * - Prefer composition over inheritance: In many cases, using composition (having objects hold other objects that implement
 * behavior) can achieve similar flexibility without the risks that come with a deep or fragile inheritance hierarchy.
 *
 * Solution 1: (racing car example)
 * Break the hierarchy if it fails the substitution test.
 *
 * Solution 2: (in-house product example)
 * Tell, don't ask. (restructure the code)
 */
public class LiskovSubstitutionPrinciple {
}
