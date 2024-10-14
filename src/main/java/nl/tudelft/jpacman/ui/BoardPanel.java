package nl.tudelft.jpacman.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.game.Game;

/**
 * Panel displaying a game.
 *
 * @author Jeroen Roosen 
 *
 */
class BoardPanel extends JPanel {

    /**
     * Default serialisation ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The background colour of the board.
     */
    private static final Color BACKGROUND_COLOR = Color.BLACK;

    /**
     * The size (in pixels) of a square on the board. The initial size of this
     * panel will scale to fit a board with square of this size.
     */
    private static final int SQUARE_SIZE = 16;

    /**
     * The game to display.
     */
    private final Game game;

    /**
     * Creates a new board panel that will display the provided game.
     *
     * @param game
     *            The game to display.
     */
    BoardPanel(Game game) {
        super();
        assert game != null;
        this.game = game;

        Board board = game.getLevel().getBoard();

        int w = board.getWidth() * SQUARE_SIZE;
        int h = board.getHeight() * SQUARE_SIZE;

        Dimension size = new Dimension(w, h);
        setMinimumSize(size);
        setPreferredSize(size);
    }

    @Override
    public void paint(Graphics graphics) {
        assert graphics != null;
        Board board = game.getLevel().getBoard();
        Dimension window = getSize();

        // Renders the board on the given graphics context to the given dimensions
        int cellW = window.width / board.getWidth();
        int cellH = window.height / board.getHeight();

        graphics.setColor(BACKGROUND_COLOR);
        graphics.fillRect(0, 0, window.width, window.height);

        for (int y = 0; y < board.getHeight(); y++) {
            for (int x = 0; x < board.getWidth(); x++) {
                int cellX = x * cellW;
                int cellY = y * cellH;
                Square square = board.squareAt(x, y);
                // Renders a single square on the given graphics context on the specified rectangle
                square.getSprite().draw(graphics, cellX, cellY, cellW, cellH);
                for (Unit unit : square.getOccupants()) {
                    unit.getSprite().draw(graphics, cellX, cellY, cellW, cellH);
                }
            }
        }
    }
}
