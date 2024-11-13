package pkg10_BankAccount;

public class WithdrawalException extends BankAccountException {
  
  /**
   * 
   */
  private static final long serialVersionUID = 3175286253340937392L;

  public WithdrawalException(String message, int code) {
    super(message, code);
  }
  
}
