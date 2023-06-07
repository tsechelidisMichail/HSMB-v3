package domain;

public interface Account {

	boolean depositt(int data);

	boolean withdraw(int data);

	Integer getBalance();

	Integer getId();

}
