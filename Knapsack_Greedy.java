import java.util.Scanner;

class GKnapsack {
  int n;
  double c;
  double p[];
  double w[];

  public GKnapsack(int n, double c, double[] p, double[] w) {
    super();
    this.n = n;
    this.c = c;
    this.p = p;
    this.w = w;
  }

  void compute() {
    int i;
    double[] x = new double[n + 1];
    for (i = 0; i < n; i++) {
      x[i] = 0.0;
    }
    double rc = c;
    for (i = 0; i < n; i++) {
      if (w[i] > rc)
        break;
      x[i] = 1;
      rc = rc - w[i];
    }
    if (i <= n) {
      x[i] = rc / w[i];
    }
    double netProfit = 0.0;
    for (i = 0; i < n; ++i) {
      if (x[i] > 0.0) {
        netProfit = netProfit + x[i] * p[i];
      }
    }
    System.out.println("Net Profit: " + netProfit);
    System.out.println("The objects picked up into knapsack are:");
    for (i = 0; i < n; ++i) {
      System.out.println(x[i] + " ");
    }
  }
}
/**
 * Knapsack_Greedy
 */
public class Knapsack_Greedy {
  public static void main(String[] args) {
    int n;
    double c;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of objects: ");
    n = sc.nextInt();
    double[] p = new double[n + 1];
    double[] w = new double[n + 1];
    int i;
    System.out.print("Enter capacity of Knapsack: ");
    c = sc.nextDouble();
    System.out.println("Enter profit for each " + n + " objects: ");
    for (i = 0; i < n; i++)
      p[i] = sc.nextDouble();
    System.out.println("Enter weight for each " + n + " objects: ");
    for (i = 0; i < n; i++)
      w[i] = sc.nextDouble();
    GKnapsack gk = new GKnapsack(n, c, p, w);
    gk.compute();
  }
}
