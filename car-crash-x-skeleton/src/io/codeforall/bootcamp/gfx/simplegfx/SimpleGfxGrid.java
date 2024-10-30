package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.Grid;
import io.codeforall.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    public int cols;
    public int rows;
    public static final int CELL_SIZE = 20;
    private Rectangle newRectangle;
    GridPosition newGridPosition;
    SimpleGfxGrid myGrid;


    public SimpleGfxGrid(int cols, int rows) {
        super();
        this.cols = cols;
        this.rows = rows;
        //Rectangle newRectangle = new Rectangle();
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {
        //throw new UnsupportedOperationException();

        //public Rectangle(double x, double y,double width,double height)
        this.newRectangle = new Rectangle(PADDING,PADDING, cols* CELL_SIZE, rows* CELL_SIZE);
        //System.out.println("newRectangle width:" + newRectangle.getWidth());
        newRectangle.setColor(Color.BLUE);
        newRectangle.fill();
        newRectangle.draw();

    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        //throw new UnsupportedOperationException();
        return this.cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        //throw new UnsupportedOperationException();
        return this.rows;
    }

    /**
     * Obtains the width of the grid in pixels
     *
     * @return the width of the grid
     */
    public int getWidth() {
        //throw new UnsupportedOperationException();
        // GridType grid = new GridType();

        //Grid grid1 = new Grid();


        //grid1.getCols();
        //Grid grid2 = (int) grid1.getCols();
        // int x = getcol() * cs + PADDING;


        //   return int ;

       // System.out.println("aa " + newGridPosition.getCol());
       // System.out.println("bb " + newGridPosition.getRow());
        // mSystem.out.println("cc " + newRectangle.getWidth());
        return newRectangle.getWidth();

    }

    /**
     * Obtains the height of the grid in pixels
     *
     * @return the height of the grid
     */
    public int getHeight() {
        //throw new UnsupportedOperationException();
        return newRectangle.getHeight();
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     *
     * @return the x position of the grid
     */
    public int getX() {
        //throw new UnsupportedOperationException();
        return newRectangle.getX();
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     *
     * @return the y position of the grid
     */
    public int getY() {
        //throw new UnsupportedOperationException();
        return newRectangle.getY();
    }

    /**
     * Obtains the pixel width and height of a grid position
     *
     * @return
     */
    public int getCellSize() {
        //throw new UnsupportedOperationException();
        return CELL_SIZE;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        //throw new UnsupportedOperationException();

        //int myNumber = (int) (Math.random() * 4);
        //int myNewNumber = (int) (Math.random() * 4);
        //newGridPosition.setPos(myNumber, myNewNumber);
        //return newGridPosition;

        return new SimpleGfxGridPosition(1000, 1000 , this);

    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        //throw new UnsupportedOperationException();
        //this.newGridPosition.setPos(col, row);
        //newGridPosition.setPos(1,1);


        return new SimpleGfxGridPosition(col, row , this);
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     *
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        //throw new UnsupportedOperationException();
        int myNewY;

        myNewY = row * CELL_SIZE + PADDING;

        return myNewY;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     *
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        //throw new UnsupportedOperationException();
        int myNewX;
        myNewX = column * CELL_SIZE + PADDING;
        return myNewX;
    }
}
