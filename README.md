# Calculator
The ConsoleCalculator program is a basic Java console-based calculator that performs arithmetic operations like addition, subtraction, multiplication, and division. It allows users to perform multiple calculations until they choose to exit.
 Key Features:
1. User Input Using Scanner:
The program uses Scanner to read input values (numbers and operator) from the user via the console.

2. Modular Design with Methods:
Four separate methods are defined for each arithmetic operation:
add(double a, double b)
subtract(double a, double b)
multiply(double a, double b)
divide(double a, double b)
This improves readability, reusability, and modularity of the code.

3. Control Flow Using switch:
Based on the operator input (+, -, *, /), the corresponding method is called using a switch-case structure.

4. Loop for Repeated Calculations:
A do-while loop ensures the calculator runs continuously until the user types "no" when prompted to perform another calculation.
This makes the application interactive and user-friendly.

5. Error Handling:
Division by zero is handled gracefully using an if check inside the divide() method.

6. Exit Option:
After each calculation, the user is asked whether they want to continue. Typing no exits the program.

After each calculation, the user is asked whether they want to continue. Typing no exits the program.

