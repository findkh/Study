package Baekjoon.If;
/* BAEKJOON 2480
문제
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  

예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

입력
첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 

출력
첫째 줄에 게임의 상금을 출력 한다.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Dice {

  public static void main(String[] args) throws Exception {
    /*
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    in.close();

    if(a == b && b == c) {
      System.out.println(10000 + (a * 1000));
    } else if ((a == b) || (c == a)) {
      System.out.println(1000 + a * 100);
    } else if (b == c) {
      System.out.println(1000 + b * 100);
    } else {
      System.out.println(Math.max(Math.max(a, b), c)*100);
    }
     */

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(in.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    in.close();

    if(a == b && b == c) {
      out.write(10000 + (a * 1000) + "\n");
    } else if ((a == b) || (c == a)) {
      out.write(1000 + a * 100 + "\n");
    } else if (b == c) {
      out.write(1000 + b * 100 + "\n");
    } else {
      out.write(Math.max(Math.max(a, b), c)*100 + "\n");
    }
    out.flush();
    out.close();
  }
}


