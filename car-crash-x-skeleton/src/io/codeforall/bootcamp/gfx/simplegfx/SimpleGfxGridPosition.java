package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import io.codeforall.bootcamp.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid){
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);

        throw new UnsupportedOperationException();
    }

    /**
     * Simple graphics position constructor
     * @param col position column
     * @param row position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid){
        super(col, row, grid);
        this.simpleGfxGrid = grid;
        this.rectangle = new Rectangle(grid.columnToX(col), grid.rowToY(row), SimpleGfxGrid.CELL_SIZE, SimpleGfxGrid.CELL_SIZE);
        this.show();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        this.rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        this.rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {
        //store initial pos before logic movement
        int beforePosX = simpleGfxGrid.columnToX(super.getCol());
        int beforePosY = simpleGfxGrid.rowToY(super.getRow());

        //move logic pos
        super.moveInDirection(direction,distance);

        //store pos after logic movement
        int afterPosX = simpleGfxGrid.columnToX(super.getCol());
        int afterPosY = simpleGfxGrid.rowToY(super.getRow());

        rectangle.translate(afterPosX-beforePosX, afterPosY-beforePosY);
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));
    }
}
