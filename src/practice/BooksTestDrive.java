package practice;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        int x = 0;
        while (x < 3){
            System.out.println(myBooks[x].title + " by " + myBooks[x].author);
            x = x + 1;
        }
    }
}
