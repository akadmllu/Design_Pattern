# Observer Design Pattern

The Observer pattern is a software design pattern in which an object called the subject, maintains a list of its dependents called observers and notifies them automatically of any state changes, usually by calling one of their method.
 
When to Use the Observer Pattern

When you need many other objects to receive an update when another object changes

	e.g : 
	Stock market with thousands of stocks need to send updates to object representing individual stocks.
	
	The subject(publisher) sends many stocks to the observers.
	
	The observers(subscribers) takes the ones they want and use tham.
	
Loose compling is a benefit
	The subject(publisher) doesn't need to know anything about the objservers(subscribers)
	
Disadvantages : The subject(publisher) may send updates that don't matter to the observers(subscribers)