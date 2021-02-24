package edu.bsu.cs222;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class WikiConnection {
    public InputStream Connection(String title) throws IOException {
        URL WikipediaURL = new URL("https://en.wikipedia.org/w/api.php?action=query&format=json&prop=revisions&titles=" + URLEncoder.encode(title, StandardCharsets.UTF_8) +
                "&rvprop=timestamp|user&rvlimit=30&redirects");
        URLConnection urlconnection = WikipediaURL.openConnection();

        urlconnection.setRequestProperty("User-Agent",
                "WikipediaRevisionReader/0.1 (http://www.cs.bsu.edu/~pvg/courses/cs222Sp21; Pettro0713@bsu.edu)");
        return urlconnection.getInputStream();
    }
}

