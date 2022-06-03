import java.util.*;
public class A_All_Pairs_Short_Path_Floyds {

  static int n, i, j, k;
  public void floyd(int n, int[][] cost) {
    for (k = 1; k <= n; k++) {
      for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
          cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j]);
        }
      }
    }
    System.out.println("\nAll Pair shortest paths matrix \n");
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= n; j++) {
        System.out.print(cost[i][j] + " ");
      }
      System.out.println();
    }
  }
  public int min(int i, int j) {
    if (i < j)
      return i;
    else
      return j;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Eneter the no of vertices: ");
    n = sc.nextInt();
    int cost[][] = new int[n + 1][n + 1];
    System.out.println("Enter the cost matrix:");
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= n; j++) {
        cost[i][j] = sc.nextInt();
      }
    }
    A_All_Pairs_Short_Path_Floyds f = new A_All_Pairs_Short_Path_Floyds();
    f.floyd(n, cost);
  }
}
