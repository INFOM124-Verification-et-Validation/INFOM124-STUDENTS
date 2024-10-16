package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        // TODO
        assertThat(unit.hasSquare()).isEqualTo(false);
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     * verifie que quand je passe à un nouveau Square, c'est bien ma target
     */
    @Test
    void testOccupy() {
        // TODO
        BasicSquare squareNext = new BasicSquare();
        unit.occupy(squareNext);
        assertThat(unit.getSquare()).isEqualTo(squareNext);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        // TODO
        BasicSquare squareNext1 = new BasicSquare();
        BasicSquare squareNext2 = new BasicSquare();
        unit.occupy(squareNext1);
        unit.occupy(squareNext2);
        unit.occupy(squareNext1);
        assertThat(unit.getSquare()).isEqualTo(squareNext1);
    }
}
