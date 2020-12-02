import java.util.*;

class KPoints {
  public static void main(String[] args) {
    KPoints points = new KPoints();

    int[][] coords = { { 1, 1 }, { 1, 2 }, { -1,-1}, { 1, 3 } };
    int k = 2;

    int[] vertex = { 1, 1 };

    double[] distance = new double[3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 1; j++) {
        distance[i] = points.dist(coords[i][j], coords[i][j + 1], vertex[0], vertex[1]);
      }
    }

    Arrays.sort(distance);
    for (int i = 0; i < k; i++) {
      for (int x = 0; x < 3; x++) {
        for (int y = 0; y < 1; y++) {
          if (distance[i] == points.dist(coords[x][y], coords[x][y + 1], vertex[0], vertex[1]))
            System.out.println(coords[x][y] + " , " + coords[x][y + 1]);
        }
      }
    }
  }
//
  double dist(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }
}