package matrix;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        /*
        https://www.acmicpc.net/problem/2738
        문제
N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

問題
N*Mサイズの2つの行列AとBが与えられた時、2つの行列を加えるプログラムを作成しなさい。

入力
1行目に行列の大きさNとMが与えられる。 2列目からN個の列に行列Aの元素M個が順に与えられる。 続いてN個の列に行列Bの元素M個が順に与えられる。 N と M は 100 より小さかったり同じで、行列の元素は絶対値が 100 より小さかったり、同じ整数である。

出力
最初の行からN個の行に行列AとBを加えた行列を出力する。 行列の各元素は空白で区切る。
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sizeOfMatrix1 = Integer.parseInt(input.split(" ")[0]);
        int sizeOfMatrix2 = Integer.parseInt(input.split(" ")[1]);
        System.out.println(sizeOfMatrix1);
        System.out.println(sizeOfMatrix2);


        int[][] matrix1;
        int[][] matrix2;


        int count1 = 0;
        while (count1 < sizeOfMatrix1){

            count1++;
        }



    }
}
