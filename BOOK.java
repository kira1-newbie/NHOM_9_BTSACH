public class BOOK {

 private String book_ID;

 private String title;

 private String author;

 private int publication_year;

 private int quantity;

 public BOOK(String book_ID, String title, String author, int publication_year, int quantity) {

  this.book_ID = book_ID;

  this.title = title;

  this.author = author;

  this.publication_year = publication_year;

  this.quantity = quantity;

 }

 public String getBook_ID() {

  return book_ID;

 }

 public void setBook_ID(String book_ID) {

  this.book_ID = book_ID;

 }

 public String getTitle() {

  return title;

 }

 public void setTitle(String title) {

  this.title = title;

 }

 public String getAuthor() {

  return author;

 }

 public void setAuthor(String author) {

  this.author = author;

 }

 public int getPublication_year() {

  return publication_year;

 }

 public void setPublication_year(int publication_year) {

  this.publication_year = publication_year;

 }

 public int getQuantity() {

  return quantity;

 }

 public void setQuantity(int quantity) {

  this.quantity = quantity;

 }

 public void displayInfo()

 {

  System.out.println("BOOK_ID: "+book_ID);

  System.out.println("TITLE: "+title);

  System.out.println("AUTHOR: "+author);

  System.out.println("publication year: "+publication_year);

  System.out.println("Quantity: "+quantity);

 }

}
