package test7.sub04;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Article> articles;
	private List<User> users;
	
	public Board() {
		this.articles = new ArrayList<>();
		this.users = new ArrayList<>();
	}
	
	public void addArticle(Article article) {
		this.articles.add(article);
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}
	
	public List<Article> getArticles() {
		return articles;
	}
	
	public List<User> getUsers() {
		return users;
	}
}
