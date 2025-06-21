package oop.Composition.Exmples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Simple Player class
class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void increaseScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Player{name='" + name + "', score=" + score + "}";
    }
}

// BAD DESIGN: exposes mutable list directly
class GameSessionBad {
    private final List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    // ❌ Exposes internal mutable list directly
    public List<Player> getPlayers() {
        return players;
    }
}

// GOOD DESIGN 1: Defensive Copy
class GameSessionDefensiveCopy {
    private final List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    // ✅ Defensive copy
    public List<Player> getPlayers() {
        return new ArrayList<>(players);
    }
}

// GOOD DESIGN 2: Unmodifiable View
class GameSessionUnmodifiable {
    private final List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    // ✅ Read-only view
    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }
}

// GOOD DESIGN 3: Immutable DTO snapshot
class PlayerDTO {
    private final String name;
    private final int score;

    public PlayerDTO(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static PlayerDTO from(Player p) {
        return new PlayerDTO(p.getName(), p.getScore());
    }

    public String toString() {
        return "PlayerDTO{name='" + name + "', score=" + score + "}";
    }
}

class GameSessionImmutableDTO {
    private final List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    // ✅ Returns snapshot of DTOs: fully decoupled
    public List<PlayerDTO> getPlayers() {
        return players.stream()
                .map(PlayerDTO::from)
                .toList();
    }
}

class main {
    public static void main(String[] args) {
        System.out.println("=== BAD DESIGN ===");
        GameSessionBad badSession = new GameSessionBad();
        badSession.addPlayer(new Player("Alice"));
        badSession.addPlayer(new Player("Bob"));
        System.out.println("Players before external modification: " + badSession.getPlayers());

        // External code clears the internal list 🤯
        badSession.getPlayers().clear();
        System.out.println("Players after external clear(): " + badSession.getPlayers());

        // ------------------------------------------------------------

        System.out.println("\n=== GOOD DESIGN: Defensive Copy ===");
        GameSessionDefensiveCopy safeSession1 = new GameSessionDefensiveCopy();
        safeSession1.addPlayer(new Player("Charlie"));
        safeSession1.addPlayer(new Player("Diana"));
        System.out.println("Players before modification: " + safeSession1.getPlayers());

        List<Player> copy = safeSession1.getPlayers();
        copy.clear();  // only clears the copy!
        System.out.println("Players after clearing returned copy: " + safeSession1.getPlayers());

        // ------------------------------------------------------------

        System.out.println("\n=== GOOD DESIGN: Unmodifiable View ===");
        GameSessionUnmodifiable safeSession2 = new GameSessionUnmodifiable();
        safeSession2.addPlayer(new Player("Eve"));
        safeSession2.addPlayer(new Player("Frank"));
        System.out.println("Players before attempt: " + safeSession2.getPlayers());
        try {
            safeSession2.getPlayers().add(new Player("Hacker")); // Should throw
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught exception when modifying unmodifiable list: " + e);
        }
        System.out.println("Players after failed attempt: " + safeSession2.getPlayers());

        // ------------------------------------------------------------

        System.out.println("\n=== GOOD DESIGN: Immutable DTO Snapshot ===");
        GameSessionImmutableDTO safeSession3 = new GameSessionImmutableDTO();
        safeSession3.addPlayer(new Player("Grace"));
        safeSession3.addPlayer(new Player("Hank"));
        System.out.println("Player DTO snapshot: " + safeSession3.getPlayers());
    }
}
