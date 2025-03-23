### Domain Classes (High Cohesion)
Each class in the domain is responsible for a single aspect of the invoicing process.

### Service Classes (Adhering to SRP)
Each service class has a single, focused responsibility

Each service is independent, interacting only through their well-defined interfaces.  This design makes it easier to 
modify one part of the system without affecting the others. For instance, if you need to change the way invoices are 
formatted, you only modify InvoiceFormatter. Or, if you switch to a different email provider, you simply implement a 
new version of EmailService without touching the rest of the system.

## Summary
### High Cohesion:
Each class in the system has one well-defined responsibility—whether it’s managing data (Invoice and InvoiceItem), 
performing calculations (InvoiceCalculator), formatting output (InvoiceFormatter), or handling email delivery (InvoiceMailer).

### Loose Coupling:
The service classes interact via well-defined interfaces (for example, EmailService). This makes it easier to modify or 
replace one part of the system (like switching email providers) without impacting the rest of the code.

### Adherence to SRP:
By isolating responsibilities into separate classes, the system becomes more maintainable, easier to test, and simpler 
to extend. Changes to one aspect (e.g., updating invoice formatting) don’t require changes to unrelated parts (e.g., the calculation logic).


## Summary
### OCP in Action:
Our invoicing system now uses an InvoiceFormatter interface to allow multiple formatting strategies (plain text, HTML, etc.) 
without altering existing invoice or calculation logic.

### Decoupling is Key:
OCP is achieved by decoupling the core functionality (invoice calculation) from the extensions (formatting), allowing each 
to evolve independently.

### Judicious Use of OCP:
While OCP enhances extensibility, overdoing it can lead to a huge number of classes and unnecessary complexity. 
Developers should make subjective decisions—assessing the potential for future changes and the cost of added 
abstraction—rather than applying the principle in every scenario.

This example demonstrates how combining SRP and OCP can lead to a robust, maintainable design that remains adaptable to
new requirements while avoiding the pitfalls of over-engineering.