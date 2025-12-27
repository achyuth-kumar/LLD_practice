import Pair.Pair;

public class PawnServiceImpl implements ProcessTurn{
    @Override
    public void execute(Piece[][] board,Piece piece) {
        Pair<Integer,Integer> CurrentPosition=piece.getPosition();
        //Move
        if(Colour.BLACK==piece.getColour()) {
            // left kill
            if(board[CurrentPosition.first-1][CurrentPosition.second-1]!=null) {
                board[CurrentPosition.first-1][CurrentPosition.second-1]=piece;
                return ;
            }
            //right kill
            if(board[CurrentPosition.first+1][CurrentPosition.second+1]!=null) {
                board[CurrentPosition.first+1][CurrentPosition.second+1]=piece;
                return ;
            }
            CurrentPosition.first+=1;
            piece.setPosition(CurrentPosition);
            //next row kill * same column
            if(board[CurrentPosition.first][CurrentPosition.second]!=null) {
                board[CurrentPosition.first][CurrentPosition.second]=piece;
            }
        }

        if(Colour.WHITE==piece.getColour()) {
            // left kill
            if(board[CurrentPosition.first-1][CurrentPosition.second-1]!=null) {
                board[CurrentPosition.first-1][CurrentPosition.second-1]=piece;
                CurrentPosition.first-=1;
                CurrentPosition.second-=1;
                piece.setPosition(CurrentPosition);
                return ;
            }
            //right kill
            if(board[CurrentPosition.first+1][CurrentPosition.second+1]!=null) {
                board[CurrentPosition.first+1][CurrentPosition.second+1]=piece;
                CurrentPosition.first+=1;
                CurrentPosition.second+=1;
                piece.setPosition(CurrentPosition);
                return ;
            }
            //next row kill * same column
            CurrentPosition.first+=1;
            if(board[CurrentPosition.first][CurrentPosition.second]!=null) {
                board[CurrentPosition.first][CurrentPosition.second]=piece;
                piece.setPosition(CurrentPosition);
            }
        }

    }
}
