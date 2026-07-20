# Archeville Super-Archy Tournament

## Overview

This is a Java console application that simulates the **Archeville Super-Archy Tournament**.

The application:

- Reads participating teams and players.
- Processes round-by-round archery scores.
- Calculates:
  - Individual player scores
  - Team scores
  - Bonus points for synchronized hits
- Displays the scoreboard after every round.
- Stops automatically when a team reaches the winning score (60 points). If multiple teams cross 60 in the same round, the team with the highest score is declared the winner.

## Prerequisites

- Java 17 or later (Java 11+ also works)


---

## Compile the Project

Navigate to the project root directory.

### Windows
Compile: javac Main.java
Run : java Main

---

## Expected Output

The application prints the scoreboard after every round, including:

- Current round
- Team scores
- Individual player scores
- Bonus points
- Winner announcement once the game ends

Example:

```
Round 1

Team Scores
----------------
Gyrhuna: 9
Achni: 5
Bathar: 1

Individual Scores
----------------
János Diák: 5
Süsü: 4
...

Bonus Points
----------------
Gyrhuna: 0
Achni: 0
Bathar: 0

...

Game Over. Gyrhuna won!!
```

---

## Design Highlights

- Object-Oriented Design (OOP)
- Follows Single Responsibility Principle (SRP)
- Uses Java Enums for scoring logic
- Business logic separated from presentation
- Easily extensible for:
  - Different winning score
  - Additional teams
  - Different bonus rules
  - External input sources (JSON/CSV/Text)

---

## Assumptions

- Every team has exactly two players.
- Each round contains one shot per player.
- Circle **F** always awards **0** points.
- Bonus of **2** points is awarded when both players on the same team hit the same circle (excluding F).
- The tournament ends immediately after the first round in which one or more teams reach at least 60 points. If multiple teams cross 60 in the same round, the team with the highest score wins.