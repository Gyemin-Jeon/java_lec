package pkg01_branch;

public class SwitchEx {

  public static void main(String[] args) {

    // 짝수/홀수
    int a = 4;
    switch(a % 2) {
    case 0:
      System.out.println(a + "는 짝수");
    case 1:
      System.out.println(a + "는 홀수");
    }
    
    String state = "대기";  // 대기/승인/거부
    switch(state) {
    case "대기":
      System.out.println("대기중");
      break;
    case "승인":
      System.out.println("승인 완료");
      break;
    case "거부":
      System.out.println("거부 완료");
      break;
    }
    
  }

}
