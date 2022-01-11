package com.test;

public class Account {

   private String name;
   private int ID = 0;
   private Double balance;
   private String city;
   private String username;
   private String password;
   private Double lastDeposit = 0.0;
   private Double lastWithdraw = 0.0;
   public Account(String name, Double balance, String city, String username, String password) {
       super();
       this.name = name;
       this.ID++; ////6. when bank is adding a new account, account ID will automatically be generated incrementally
       this.balance = balance;
       this.city = city;
       this.username = username;
       this.password = password;
   }
   public String getName() {
       return name;
   }
   public int getID() {
       return ID;
   }
   public Double getBalance() {
       return balance;
   }
   public String getCity() {
       return city;
   }
   public String getUsername() {
       return username;
   }
   public String getPassword() {
       return password;
   }
   public void setName(String name) {
       this.name = name;
   }

   public void setBalance(Double balance) {
       this.balance = balance;
   }
   public void setCity(String city) {
       this.city = city;
   }
   public void setUsername(String username) {
       this.username = username;
   }
   public void setPassword(String password) {
       this.password = password;
   }
  
   //1. withdraw
   public void withdraw(double amount){
       if(amount < this.balance)
           this.balance -= amount;
       lastWithdraw = amount;
   }
  
   //2. redo last withdraw
   public void reDoWithdraw(){
       this.balance += lastWithdraw;
   }

   //3. deposit
   public void deposit(double amount){
       this.balance += amount;
       lastDeposit =amount;
   }
   //4. redo last deposit
   public void reDoDeposit(){
       this.balance -= lastDeposit;
   }
   //5. login validation
   public Boolean loginValidation(String username, String pass){
       if(this.username == username && this.password == pass)
           return true;
       return false;
   }
   @Override
   public String toString() {
       return "Account [name=" + name + ", ID=" + ID + ", balance=" + balance + ", city=" + city + ", username="
               + username + ", password=" + password + ", lastDeposit=" + lastDeposit + ", lastWithdraw="
               + lastWithdraw + "]";
   }
  
}

//Bank.java

package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {

   private String username;
   private String password;
   private ArrayList<Account> accounts;
   public Bank(String username, String password, ArrayList<Account> accounts) {
       super();
       this.username = username;
       this.password = password;
       this.accounts = accounts;
   }
   public String getUsername() {
       return username;
   }
   public String getPassword() {
       return password;
   }
   public ArrayList<Account> getAccounts() {
       return accounts;
   }
   public void setUsername(String username) {
       this.username = username;
   }
   public void setPassword(String password) {
       this.password = password;
   }
   public void setAccounts(ArrayList<Account> accounts) {
       this.accounts = accounts;
   }
  
   //1. login validation
   public Boolean loginValidation(String bankUser, String pass){
       if(this.username == bankUser && this.password == pass)
           return true;
       return false;
   }
   //2. addAccount // when creating an account, the username and password will be written in the code
   public void addAccount(Account acc) {
       this.accounts.add(acc);
   }

   //3. removeAccount (by using account ID)
   public Boolean removeAccount(int ID) {
       for(Account acc:this.accounts) {
           if(acc.getID() == ID) {
               return this.accounts.remove(acc);
           }
       }
       return false;
   }

   //4. calculate all total balance
   public Double totalBalance() {
       Double balanceSum = 0.0;
       for(Account acc:this.accounts) {
           balanceSum += acc.getBalance();
       }
       return balanceSum;
   }

   //5. generateReport (all total balance per city) (have a list of the city in the field)
   public void generateReport(ArrayList<String> cities) {
       Map<String,Double> report = new HashMap<>();
      
       for(Account acc:this.accounts) {
           if(cities.contains(acc.getCity())) {
               if(report.containsKey(acc.getCity())) {
                   double bal = report.get(acc.getCity());
                   report.replace(acc.getCity(), bal + acc.getBalance());
               }else {
                   report.put(acc.getCity(), acc.getBalance());
               }
           }
       }
   }
}

//Main.java

package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  
   public static void main(String[] args) {
      
       ArrayList<Account> acc = new ArrayList<>();
      
       Bank bankName = new Bank("USBI", "123456", acc);
      
       while(true)
       {
           System.out.println("Main Menu:\n1. Admin Login\n" +
                   "2. User Login\n" +
                   "3. Exit\n");
           Integer choice1, choice2;
           String name,city,username,password;
           Double bal;
          
           Scanner sc = new Scanner(System.in);
           choice1 = Integer.parseInt(sc.nextLine());
          
           if(choice1.equals(1)) {
               System.out.println("Admin Menu:\r\n" +
                       "1. Add an Account\r\n" +
                       "2. Remove an Account\r\n" +
                       "3. Print total balance\r\n" +
                       "4. Print total balance per city\r\n" +
                       "5. Go back to main menu\n");
               choice2 = Integer.parseInt(sc.nextLine());
               switch (choice2) {
               case 1:
                   System.out.print("\nEnter account name:");
                   name = sc.nextLine();
                   System.out.print("\nEnter account initial Ballance:");
                   bal = Double.parseDouble(sc.nextLine());
                   System.out.print("\nEnter City name:");
                   city = sc.nextLine();
                   System.out.print("\nEnter account username:");
                   username = sc.nextLine();
                   System.out.print("\nEnter account password:");
                   password = sc.nextLine();
                  
                   Account account = new Account(name, bal, city, username, password);
                   bankName.addAccount(account);
                   break;
               case 2:
                   System.out.println("\nEnter account id to remove: ");
                   int id = sc.nextInt();
                   acc.remove(id);
                   break;
               case 3:
                   System.out.println("\nTotal Account Balance: " + bankName.totalBalance());
                   break;
               case 4:
                   System.out.println("\nTotal Account Balance as per cities: " );
                   ArrayList<String> cities = new ArrayList<>();
                   cities.add("Pune");
                   bankName.generateReport(cities);
                   break;
               case 5:
                   break;

               default:
                   break;
               }
              
              
           }else if(choice1 == 2) {
               System.out.println("User Login\r\n" +
                       "1. Withdraw //also redo last withdraw\r\n" +
                       "2. Deposit //also redo last deposit\r\n" +
                       "3. print account\r\n" +
                       "4. Go back to main menu\n");
               choice2 = sc.nextInt();
               int id;
               double amount;
               switch (choice2) {
               case 1:
                   System.out.println("Enter account ID:");
                   id = sc.nextInt();
                   System.out.println("Enter amount to withdraw:");
                   amount = sc.nextDouble();
                  
                   for(Account ac : bankName.getAccounts()) {
                       if(ac.getID() == id) {
                           ac.withdraw(amount);
                           break;
                       }
                   }
                   break;
               case 2:
                   System.out.println("Enter account ID:");
                   id = sc.nextInt();
                   System.out.println("Enter amount to Deposit:");
                   amount = sc.nextDouble();
                  
                   for(Account ac : bankName.getAccounts()) {
                       if(ac.getID() == id) {
                           ac.deposit(amount);
                           break;
                       }
                   }
                   break;
               case 3:
                   System.out.println("Enter account ID:");
                   id = sc.nextInt();
                   for(Account ac : bankName.getAccounts()) {
                       if(ac.getID() == id) {
                           System.out.println(ac);
                           break;
                       }
                   }
                   break;
               case 4:

                   break;
               default:
                   break;
               }
           }else if(choice1 == 3) {
               break;
           }else {
               System.out.println("Please enter valid input.");
           }
       }
   }
}