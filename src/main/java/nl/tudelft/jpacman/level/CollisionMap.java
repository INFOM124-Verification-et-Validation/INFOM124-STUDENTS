package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Unit;

/**
 * Una tabella contenente tutte le collisioni (rilevanti) tra diversi tipi di unità.
 *
 * @author Jeroen Roosen 
 */
public interface CollisionMap {

    /**
     * Mette in collisione le due unità e gestisce il risultato della collisione, che può essere essere nulla.
     *
     * @param <C1>
     *            Il tipo di collisore.
     *
     * @param <C2>
     *            Il tipo di collidee (unità in cui è stata spostata).
     *
     * @param collider
     *            L'unità che causa la collisione occupando una casella con un'altra unità già presente.
     *
     * @param collidee
     *            L'unità che si trova già nella casella che viene invasa.
     */
    <C1 extends Unit, C2 extends Unit> void collide(C1 collider, C2 collidee);

}
