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
 *
 * Solution 1: (racing car example)
 * Break the hierarchy if it fails the substitution test.
 *
 * Solution 2: (in-house product example)
 * Tell, don't ask. (restructure the code)
 */
public class LiskovSubstitutionPrinciple {
}
