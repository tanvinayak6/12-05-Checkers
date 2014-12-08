import java.lang.Math;
class CheckersMove
{
  // Position of piece to be moved
  private int fromRow;
  private int fromCol;
  
  // Square it is to move to
  private int toRow;
  private int toCol;
  
  // Constructor. Just set the values of the instance variables
  public CheckersMove(int r1, int c1, int r2, int c2)
  {
    fromRow=r1;
    fromCol=c1;
    toRow=r2;
    toCol=c2;
  } 
  // Accessors: 
    public int getFromRow()
    {
      return fromRow;
    }
    public int getFromCol()
    {
      return fromCol;
    }
    public int getToRow()
    {
      return toRow;
    }
    public int getToCol()
    {
      return toCol;
    }
    public boolean isJump()
    {
      return Math.abs(fromRow-toRow)==2;
    }      
        
}
   
