# Red-Pen-Green-Pen-Switch-Count
The "Red Pen Green Pen Switch Count" problem is a simple logic-based task where you, as a teacher, write a sequence of  𝑁 N numbers on the whiteboard. You switch between two pens based on the parity of the numbers. A green pen is used for odd numbers, while a red pen is used for even numbers.
Explanation of the Code
Initialization: switchCount keeps track of green-to-red switches, and isGreen keeps track of the current pen state based on the parity of the first number.
Iteration: For each number, we check if it requires a green or red pen. A switch occurs when we go from a green pen (odd) to a red pen (even).
Update: After each check, we update isGreen to reflect the current pen state.
Output: Finally, the switchCount is printed, indicating the number of green-to-red switches.
