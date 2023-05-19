package com.battlesnake.starter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TurnData {

  // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
  // import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
  /*
   * ObjectMapper om = new ObjectMapper();
   * Root root = om.readValue(myJsonString, Root.class);
   */

  @JsonProperty("game")
  public Game game;
  @JsonProperty("turn")
  public int turn;
  @JsonProperty("board")
  public Board board;
  @JsonProperty("you")
  public Snake you;

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Board {

    @JsonProperty("height")
    public int height;
    @JsonProperty("width")
    public int width;
    @JsonProperty("snakes")
    public List<Snake> snakes;
    @JsonProperty("food")
    public List<Food> food;
    @JsonProperty("hazards")
    public List<Hazard> hazards;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Body {

    @JsonProperty("x")
    public int x;
    @JsonProperty("y")
    public int y;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Customizations {

    @JsonProperty("color")
    public String color;
    @JsonProperty("head")
    public String head;
    @JsonProperty("tail")
    public String tail;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Food {

    @JsonProperty("x")
    public int x;
    @JsonProperty("y")
    public int y;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Hazard {
    @JsonProperty("x")
    public int x;
    @JsonProperty("y")
    public int y;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Game {

    @JsonProperty("id")
    public String id;
    @JsonProperty("ruleset")
    public Ruleset ruleset;
    @JsonProperty("map")
    public String map;
    @JsonProperty("timeout")
    public int timeout;
    @JsonProperty("source")
    public String source;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Head {

    @JsonProperty("x")
    public int x;
    @JsonProperty("y")
    public int y;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Royale {

    @JsonProperty("shrinkEveryNTurns")
    public int shrinkEveryNTurns;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Ruleset {
    @JsonProperty("name")
    public String name;
    @JsonProperty("version")
    public String version;
    @JsonProperty("settings")
    public Settings settings;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Settings {

    @JsonProperty("foodSpawnChance")
    public int foodSpawnChance;
    @JsonProperty("minimumFood")
    public int minimumFood;
    @JsonProperty("hazardDamagePerTurn")
    public int hazardDamagePerTurn;
    @JsonProperty("hazardMap")
    public String hazardMap;
    @JsonProperty("hazardMapAuthor")
    public String hazardMapAuthor;
    @JsonProperty("royale")
    public Royale royale;
    @JsonProperty("squad")
    public Squad squad;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Snake {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("latency")
    public String latency;
    @JsonProperty("health")
    public int health;
    @JsonProperty("body")
    public List<Body> body;
    @JsonProperty("head")
    public Head head;
    @JsonProperty("length")
    public int length;
    @JsonProperty("shout")
    public String shout;
    @JsonProperty("squad")
    public String squad;
    @JsonProperty("customizations")
    public Customizations customizations;
  }

  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Squad {

    @JsonProperty("allowBodyCollisions")
    public boolean allowBodyCollisions;
    @JsonProperty("sharedElimination")
    public boolean sharedElimination;
    @JsonProperty("sharedHealth")
    public boolean sharedHealth;
    @JsonProperty("sharedLength")
    public boolean sharedLength;
  }

}