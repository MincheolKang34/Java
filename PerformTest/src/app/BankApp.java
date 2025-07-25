package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {

	private List<Account> accounts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		
		System.out.println("프로그램 종료");
	}
	
	public void start() {
		
		boolean running = true;
		
		while (running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.next());
			
			switch (choice) {
				case 1 -> createAccount();
				case 2 -> listAccounts();
				case 3 -> depositAccount();
				case 4 -> withdrawAccount();
				case 5 -> {
					running = false;
				}
				default -> System.out.println("올바른 번호를 선택하세요.");
			}
		}
	}
	
	public void printMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("----------------------------------------------");
	}
	
	public void createAccount() {
		System.out.println("------------------- 계좌생성 -------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String name = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account account = new Account(ano, name, balance);
		accounts.add(account);
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	public void listAccounts() {
		System.out.println("------------------- 계좌목록 -------------------");
		for(Account account : accounts)
			System.out.printf("%s %s %d\n", account.getAno(), account.getOwner(), 
					account.getBalanace());
	}
	
	public void depositAccount() {
		System.out.println("-------------------- 예금 ---------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		
		if(account != null) {
			account.setBalanace(account.getBalanace() + balance);
			System.out.println("결과: 예금이 성공되었습니다.");
		}else
			System.out.println("결과: 계좌가 없습니다.");
	}
	
	public void withdrawAccount() {
		System.out.println("-------------------- 출금 ---------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		
		if(account != null) {
			account.setBalanace(account.getBalanace() - balance);
			System.out.println("결과: 출금이 성공되었습니다.");
		}else
			System.out.println("결과: 계좌가 존재하지 않습니다.");
	}
	
	public Account findAccount(String ano) {
		for(Account account : accounts) {
			// 고객 소유의 계좌가 존재할 경우 계좌 객체 반환
			if(account.getAno().equals(ano)) {
				return account;
			}
		}
		// 고객 소유의 계좌가 존재하지 않을 경우 null 값 반환
		return null;
	}
}
