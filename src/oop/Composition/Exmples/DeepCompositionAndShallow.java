package oop.Composition.Exmples;

import java.util.ArrayList;
import java.util.List;

public class DeepCompositionAndShallow
{
    public class Player {

        public Player(Player p) {
        }
    }



    // Shallow Composition - shares references
    public class Team {
        private List<Player> players;

        public Team(List<Player> players) {
            this.players = players; // Shallow - shares reference
        }
    }

    // Deep Composition - owns objects completely
    public class Team2 {
        private List<Player> players;

        public Team2(List<Player> originalPlayers) {
            this.players = new ArrayList<>();
            for(Player p : originalPlayers) {
                this.players.add(new Player(p)); // Deep copy
            }
        }
    }

}
