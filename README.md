# Connect-L: Modified Connect-4 Game

## Overview
Connect-L is a Java-based implementation of a modified Connect-4 game. Players aim to form an "L-shaped" line of pieces to win the game. The game supports customizable board dimensions, adjustable difficulty levels, and a graphical user interface (GUI) for interactive gameplay.

## Features
- **Customizable Board Size:** Choose board dimensions ranging from 4x4 to 8x8.
- **Adjustable Win Conditions:** Define the required length of the "L" shape to win.
- **Single Player Mode:** Play against an AI opponent with four difficulty levels:
  - Level 0: Random moves.
  - Level 1: Looks ahead by one move.
  - Level 2: Looks ahead by two moves.
  - Level 3: Looks ahead by three moves.
  - Level 4: Full game simulation (available for smaller boards).
- **Hint System:** Get guidance for optimal moves based on current board conditions.
- **GUI-Based Gameplay:** Play interactively using mouse clicks.
- **Simple AI:** An algorithm that evaluates possible moves and provides a challenging gameplay experience.

## How to Play
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Compile the code:
   ```bash
   javac Game.java Board.java
   ```

3. Run the game:
   ```bash
   java Game
   ```

4. Follow the on-screen instructions to:
   - Select board dimensions.
   - Set the win condition.
   - Choose the AI difficulty level.
   - Decide whether to play as Red or Blue.
   
5. Play using mouse clicks (GUI mode) or terminal inputs.

## Files in the Project
- **Game.java**: Contains the main game logic and GUI implementation.
- **Board.java**: Includes core game mechanics such as board creation, move validation, and win detection.
- **BoardTest.java**: (Optional, if available) Unit tests to ensure the correctness of the Board class functions.

## Technologies Used
- **Programming Language:** Java
- **GUI Framework:** Swing

## Future Enhancements
- Add a scoring system to track player performance over multiple games.
- Implement more advanced AI for higher difficulty levels.
- Extend the hint system to provide strategic insights.

## Credits
- **Developer:** Dhruv Pujara  
  CPSC 233 W24 Assignment 1
- **Instructor:** Jonathan Hudson

---

Feel free to suggest further improvements or report bugs by opening an issue in this repository!
