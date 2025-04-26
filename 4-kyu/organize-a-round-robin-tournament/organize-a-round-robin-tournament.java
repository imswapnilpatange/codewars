import java.util.List;
import java.util.ArrayList;
​
public class RoundRobinScheduler {
    public static int[][][] buildMatchesTable(int numberOfTeams) {
      // There should be teams-1 rounds. Each round has teams/2 matches. Each match has 2 teams.
​
      int numRounds = numberOfTeams - 1; // 19 rounds for 20 teams
        int[][][] schedule = new int[numRounds][][];
​
        // Create a temporary list of teams
        int[] teams = new int[numberOfTeams];
        for (int i = 0; i < numberOfTeams; i++) {
            teams[i] = i + 1; // Team numbers from 1 to 20
        }
​
        // Round-robin schedule generation
        for (int round = 0; round < numRounds; round++) {
            int matchesCount = numberOfTeams / 2;
            schedule[round] = new int[matchesCount][2]; // Each match has two teams
​
            for (int match = 0; match < matchesCount; match++) {
                int team1 = teams[match];
                int team2 = teams[numberOfTeams - 1 - match];
                schedule[round][match][0] = team1;
                schedule[round][match][1] = team2;
            }
​
            // Rotate teams (except the first one)
            int lastTeam = teams[numberOfTeams - 1];
            System.arraycopy(teams, 1, teams, 2, numberOfTeams - 2);
            teams[1] = lastTeam;
        }
​
        return schedule;
    }
}