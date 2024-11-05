package pkg03_one_dimension.ex;

import java.util.Arrays;

public class Ex04 {

  public static void main(String[] args) {
 
    // 10진수를 2진수로 변환한 결과를 배열에 저장하기

    // 10진수
    int number = 35;
    
    // 2진수
    int[] binary = new int[10];
    
    
    int i = 0;
    while(number > 0) {
      binary[i++] = number % 2;
      number /= 2;  // number = number / 2;
    }
    for(int j = i - 1; j >= 0; j--) {
      System.out.print(binary[j]);
    }
    
  }

}
