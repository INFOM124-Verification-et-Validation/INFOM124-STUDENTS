# TP 2 - Structural testing and mocking

*Don't forget to commit frequently on branches and to make pull requests when you want to merge your changes to your main branch !*

## Exercise 1

Analyze the requirements found in `docs/scenarios.md` and derive a decision table for the JPacman collisions from it. In this decision table you should encode the outcomes of collisions between two pairs of entities. You are free to filter out collisions that do not occur, such as two `Pellet` colliding. Make your decision table based on the table below. Note that this table is incomplete and may have too many or too few columns.

|                 |        |       |        |    |
|-----------------|--------|-------|--------|----|
| **Collider**    | Ghost  | ??    | ??     | ?? |
| **Collidee**    | Pellet | Ghost | Pellet | ?? |
| **Consequence** | ??     | ??    | ??     | ?? |


Based on the decision table above, derive a JUnit test suite for the `level.PlayerCollisions` class using the **specification-based testing** (see the `analysis-template.md` file) and **structural testing** frameworks. You should be as rigorous as possible here. Think not only of collisions that result in something, but also on collisions where "nothing happens".

## Exercise 2

The `PlayerCollisions` class is far from ideal, as it does not scale well to more realistic collision maps. An alternative is the `DefaultPlayerInteractionMap`, which makes use of the (more complicated) `CollisionInteractionMap` class. Restructure your test suite from exercise 1 so that you can execute the same test suite on both `PlayerCollisions` and `DefaultPlayerInteractionMap` objects.

## BONUS exercise

Write a test suite for the `nl.tudelft.jpacman.level.MapParser` class. Start out with the nice weather behavior, in which the board contains expected characters. Extend then the suite to bad weather situations. These bad weather cases will force the class to raise the proper exceptions.

**Bonus**: try to make this exercise by using Mockito to mock the factories, and use Mockity `verify` method to verify that a map leads to the proper interactions with those factories.