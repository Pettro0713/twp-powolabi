package edu.bsu.cs22;

import java.util.Scanner;

public class getWikiTitle {
    public String getArticleTitle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Wikipedia page title ");
        String title = scan.nextLine();
        //Not sure if this actually exits with error code 1.
        if (title == null) {
            System.err.println("Article name required");
            System.exit(0);
        }
        return title;
    }
}
