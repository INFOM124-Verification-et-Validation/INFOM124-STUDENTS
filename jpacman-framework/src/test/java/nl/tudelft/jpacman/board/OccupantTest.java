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
    private Square target;

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

        assertThat(unit.hasSquare()).isFalse();
        // ou assertFalse(unit.hasSquare())
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        // TODO
        target = new BasicSquare();
        assertThat(target.isAccessibleTo(unit)).isTrue();
        unit.occupy(target);
        assertThat(unit.getSquare()).isEqualTo(target);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() { //on quitte et on revient sur le carré
        target = new BasicSquare();
        unit.occupy(target);

        unit.leaveSquare();
        unit.occupy(target);
        assertThat(unit.getSquare()).isEqualTo(target);
    }
}
