package mousumi;

/**
	 * Assignment - 6 : 16th November 24
	 * 
	 * Create a class called BankDetail which should have 4 methods - initBalance,
	 * creditAmount, debitAmount, displayBalance. Set your initial balance by
	 * calling initBalance method.
	 * 
	 * From main method, calling sequence should be, initBalance(5000);
	 * creditAmt(2000); debitAmt(6500); creditAmt(1500); creditAmt(2000); display();
	 * 
	 * Output : Your current balance is 2000.
	 */

  public class UpdateBankDetailsAssignment6 {
		int balance;

		void initialBalance(int balance) {
			this.balance = balance;
			System.out.println("Your initial account balance is Rs." + balance);
		}

		void debitAmount(int debitAmount) {
			balance -= debitAmount;
			System.out.println(
					"Rs." + debitAmount + " has been debited from your account. Available balance is Rs." + balance);
		}

		void creditAmount(int creditAmount) {
			balance += creditAmount;
			System.out.println(
					"Rs." + creditAmount + " has been credited to your account. Available balance is Rs." + balance);
		}

		void displayBalance() {
			System.out.println("Your account balance is Rs." + balance);
		}

		public static void main(String[] args) {
			UpdateBankDetailsAssignment6 bankdtls = new UpdateBankDetailsAssignment6();
			bankdtls.initialBalance(5000);
			bankdtls.creditAmount(2000);
			bankdtls.debitAmount(6500);
			bankdtls.creditAmount(1500);
			bankdtls.creditAmount(2000);
			bankdtls.displayBalance();
		}
	}
