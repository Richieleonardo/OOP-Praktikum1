import java.lang.System;
import java.util.Scanner;

public class GameSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(System.getProperty("line.separator"));
        int player = sc.nextInt();
        String seeker = sc.next();
        System.out.println("Game dimulai dengan "+player+" pemain, seeker adalah "+seeker+"");
        HideNSeek baru = new HideNSeek(seeker, player);
        int HNSFound;
        while(baru.getPlayerFound() != (player-1)){
            HNSFound = sc.nextInt();
            if((HNSFound - baru.getPlayerFound()) == 1){
                System.out.println(HNSFound + " Pemain ditemukan");
                baru.foundPlayer();
            }
        }
        System.out.println("Semua pemain telah ditemukan, permainan selesai.");
        sc.close();
    }
}
