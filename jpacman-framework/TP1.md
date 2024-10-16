# TP 1 - Specification-based testing

## Acquaintance with the project

### Exercise 1
Open `board.DirectionTest` and create additional test methods for e.g., the south, east, and west directions.

### Exercise 2
Open the `board.OccupantTest` class and implement the 3 empty tests:
1. `noStartSquare()` test asserts that a unit has no square to start with, i.e., a unit "has no square" at the beginning.
2. `testOccupy()` test verifies that the unit indeed has the target square as its base after occupation. In other words, if a unit is occupied by a(ny) basic square, one should contain the other.
3. `testReoccupy()` test verifies that the unit indeed has the target square as its base after double occupation.


## Units tests and boundary tests

Let's focus on the movements of the ghosts. For both exercises 3 and 4, use the `GhostMapParser` class to support your JUnit tests. Feel free to explore how the `Ghost` parent class work.

### Exercise 3
Open `npc.ghost.Clyde` class and implement at least 4 JUnit tests for the method `Optional<Direction> nextAiMove()` in a `ClydeTest` class. The specification-based testing framework will help you to devise test cases without understanding the implementation in depth (see `analysis-template.md` file).

> Instantiating the `Clyde` class and adding to a map requires some understanding of JPacman. Let's have a head start. See the `GhostMapParser` class.
> - In the tests, we need to build a level, based on a map. This map should be designed based on what we want to exercise in that test. For example, if the map is a list of strings as the following: `{"############", "#P________C#", "############"}` (the `_` characters should be replaced by empty spaces in the code), the PacMan and the Clyde are on the same row, 8 columns apart.
> - The provided `GhostMapParser#parseMap()` method receives the map, and returns a `Level` that uses the provided map.
> - If your test involves a player on the map, do not forget to create it (`PlayerFactory#createPacMan`), to register it in the level (`Level#registerPlayer`) as well as to set its direction (`Player#setDirection`).
> - You should assert the direction that the ghost takes based on its current position in the level. To do that, you need the ghost that exists in the created level. For that, we provide the `Navigation#findUnitInBoard` method.

### Exercise 4
Open `npc.ghost.Inky` class and see how this ghost works, and especially its `nextAiMove` method. Think about partitions/cases. What tests should you design to make sure this ghost works? Read its documentation and its source code. Use all the information you have in hands and use the specification-based testing framework!

Implement at least 5 JUnit tests (2 good weather and 3 bad weather) for the method `Optional<Direction> nextAiMove()` in a `InkyTest` class.

### BONUS exercise
The method `squaresAheadOf` in the class `Unit` is not tested. Write at least 3 tests for this method.