//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game = new Game(8, 16);
        //game.screenUpdate();
        Thread scrn = new Thread(game);
        Thread key = new Thread(game.obs);
        scrn.start();
        key.start();
    }
}