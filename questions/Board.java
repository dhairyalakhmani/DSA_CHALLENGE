class Players{
    char symbol;

    public Players(char symbol){
        this.symbol=symbol;
    }
}

class GameOn{
    Board TTT;
    Players Player1;
    Players Player2;

    public GameOn(int size){
        TTT = new Board(size);
        Player1 = new Players('X');
        Player2 = new Players('O');
    }

    public void start(){
        
    }
}




public class Board {
    char grid[][];
    int size;

    public Board(int size){
        this.size=size;
        grid[][] = new char[size][size];
    }



}
