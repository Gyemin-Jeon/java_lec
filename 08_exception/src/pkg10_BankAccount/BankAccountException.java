package pkg10_BankAccount;

public class BankAccountException extends RuntimeException {
  
  private static final long serialVersionUID = -4369692170415815807L;
  
  private int code;
  
  public BankAccountException(String message, int code) {
    super(message);
    this.code = code;
  }

  public int getCode() {
    return code;
  }
  
  public void setCode(int code) {
    this.code = code;
  }
  
  
}
