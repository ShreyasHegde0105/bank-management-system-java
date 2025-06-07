# bank-management-system-java
# Bank Management System (Java OOP Project)

A simple console-based Bank Management System developed in Java using Object-Oriented Programming (OOP) principles. This project demonstrates core Java concepts like inheritance, encapsulation, abstraction, and polymorphism.

## Features

- Create Savings and Current accounts
- Deposit and withdraw money
- Check account balance
- Overdraft limit for current accounts
- Menu-driven console interface for ease of use

## Technologies Used

- Java (Core)
- OOP Concepts: Inheritance, Polymorphism, Abstraction, Encapsulation
- Console input/output with `Scanner`

## Project Structure
bank-management-system-java/
├── Bank Management System/
│   ├── Account.java
│   ├── SavingsAccount.java
│   ├── CurrentAccount.java
│   ├── Bank.java
│   └── Main.java
├── README.md
└── .gitignore


## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/bank-management-system-java.git

2. Navigate into the project directory:
   cd bank-management-system-java
   
3. Compile Java source files from the src directory:
   javac Bank Management System/*.java

4. Run the program:
   java -cp Bank Management System Main

## Usage 
Use the console menu to:
 i.   Create new savings or current accounts
 ii.  Deposit money
 iii. Withdraw money (respecting overdraft limits for current accounts)
 iv.  Check account balances

## Example Usage
Select operation:
1. Add Account
2. Deposit
3. Withdraw
4. Check Balance
5. Exit
Enter choice: 1

Choose account type:
1. Savings
2. Current
Enter choice: 1

Enter account holder name: Shreyas
Enter initial deposit: 5000

Account created successfully!

Enter choice: 2
Enter account number: 1001
Enter deposit amount: 1500
Amount deposited successfully!

Enter choice: 4
Enter account number: 1001
Balance: 6500.0

Enter choice: 5
Exiting program. Thank you!

## Author
Shreyas Hegde \n
B.Tech CSE (Blockchain) student @ Presidency University
Learning Java, Python, Golang
https://github.com/ShreyasHegde0105
