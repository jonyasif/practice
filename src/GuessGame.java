
public class GuessGame{

    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I am guessing a number between 1 to 10");

        while (true) {
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player 1 guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player 2 guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player 3 guessed " + guessp3);

            if(guessp1 == targetNumber){
                p1IsRight = true;
            }

            if (guessp2 == targetNumber){
                p2IsRight = true;
            }

            if (guessp3 == targetNumber){
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight){

                System.out.println("We have a winner");
                System.out.println("Player 1 is right " + p1IsRight);
                System.out.println("Player 2 is right " + p2IsRight);
                System.out.println("Player 3 is right " + p3IsRight);
                break;
            } else{
                System.out.println("Players have to try again");
            }
        }

    }

}