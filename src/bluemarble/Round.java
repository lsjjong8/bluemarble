package bluemarble;

import bluemarble.entity.Dice;
import bluemarble.entity.Player;
import bluemarble.entity.tile.City;
import bluemarble.ifs.Tile;
import bluemarble.factory.TileFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Round {
    int numOfPlayer = 2;
    int turn = 1;
    final protected static List<Tile> TILES = TileFactory.getTiles();
    final protected List<Player> PLAYERS = new ArrayList<Player>();

    public abstract void showMapByConsole();

    protected Round() {}

    public Round(int numOfPlayer) {
        this.numOfPlayer = numOfPlayer;
        for (int i = 0; i < numOfPlayer; i++) {
            PLAYERS.add(new Player("플레이어" + (i+1)));
        }
    }

    public void start() {

        Scanner scan = new Scanner(System.in);

        while(true) {
            for (Player player : PLAYERS) {

                String flag = "Y";

                int location = player.getLocation();
                System.out.println(turn+"번째 턴입니다. "+player.getName()+"님 주사위를 굴리시겠습니까? (Y/n)");

                String input = scan.nextLine();
                scan.reset();

                int roll = 0;

                if ("y".equals(input) || "Y".equals(input) || "".equals(input)) {
                    roll = Dice.rollDice();
                    location += roll;
                }

                if(location >39) {
                    location = location - 40;
                }

                player.setLocation(location);

                showMapByConsole();

                System.out.println(player.getName() + "님의 주사위 값 : " + roll);

                if (player.getBudget() < 0) {
                    System.out.println(player.getName() + "님이 패배하셨습니다.");
                    PLAYERS.remove(player);
                }

                turn++;
            }

            if(PLAYERS.size() == 1) break;
        }
        System.out.println(PLAYERS.get(0).getName() + "님이 승리하셨습니다. 게임을 종료합니다.");

        PLAYERS.get(0).setWinCount(PLAYERS.get(0).getWinCount()+1);

    }
}
