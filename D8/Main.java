public class Main {
  public static void main(String[] args) {
    calculateScore(true, 1, 3, 0);

    boolean gameOver = true;
    if (gameOver) {
      System.out.println("Game over")
    }
  }

// Defining new methods on the class:
  public static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelComplete * bonus);
      System.out.println("Your final score was " + finalScore);
      return finalScore;
    }
  }
}
