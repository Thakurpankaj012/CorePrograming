import java.util.*;

public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock") && computer.equals("scissors") ||
            user.equals("scissors") && computer.equals("paper") ||
            user.equals("paper") && computer.equals("rock")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, computerWins = 0;
        String[][] results = new String[games][3];

        for (int i = 0; i < games; i++) {
            System.out.print("Choose rock/paper/scissors: ");
            String userChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        System.out.println("Game	User	Computer	Winner");
        for (int i = 0; i < games; i++) {
            System.out.println((i+1) + "	" + results[i][0] + "	" + results[i][1] + "		" + results[i][2]);
        }

        int draws = games - userWins - computerWins;
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);
        System.out.println("User Win %: " + ((userWins * 100.0) / games));
        System.out.println("Computer Win %: " + ((computerWins * 100.0) / games));
    }
}
