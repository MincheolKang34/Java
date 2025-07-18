package p207;

/*
 * 날짜 : 2025.07.18.
 * 이름 : 강민철
 * 내용 : 교재 p207 예제 4-7 실습
 */
import java.util.Scanner;

class Book {
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book(title, author);
		}
		
		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		
		scanner.close();
	}
}
