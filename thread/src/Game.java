public class Game implements Runnable{
    char [][] map;
    char WALL = '#';
    Person gamer;
    KeyboardObserver obs;

    public Game(int a, int b) {
        this.map = new char[a][b];
        obs = new KeyboardObserver();
        for(int i = 0; i < a; i++){
            gamer = new Person(a-2,b/2);
            for(int j = 0; j < b; j++){
                if((i == 0)){
                    map[i][j] = WALL;
                }
                if((j == 0)){
                    map[i][j] = WALL;
                }
                if((i == a-1)){
                    map[i][j] = WALL;
                }
                if((j == b-1)){
                    map[i][j] = WALL;
                }
                if ((i == gamer.x)&(j == gamer.y)){
                    map[i][j] = gamer.look;
                }
            }

        }
    }

    public void run(){
        int g = 5;
        while(true) {
            this.screenUpdate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            if(g == 0)
                return;
            g--;
        }
    }

    public void screenUpdate(){
        System.out.print("\033[H\033[2J");
        //System.out.flush();
        for(char[] line : map){
            for(char tile : line){
                if(tile != ' ')
                    System.out.print(tile);
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }



}

