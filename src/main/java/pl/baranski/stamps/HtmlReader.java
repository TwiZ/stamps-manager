package pl.baranski.stamps;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HtmlReader {

    public HtmlReader() throws Exception{

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost("https://www.kzp.pl/index.php?artykul=kat-index");
//
// here you can do things like add parameters used when connecting to the remote site
//
        HttpResponse response = client.execute(post);

//        System.out.println(IOUtils.toString(response.getEntity().getContent(), "UTF-8"));

        Document doc = Jsoup.parse(response.getEntity().getContent(), "", "");
//        Element link = doc.select("a").select()first();
//
//        String text = doc.body().text(); // "An example link"
//        String linkHref = link.attr("href"); // "http://example.com/"
//        String linkText = link.text(); // "example""
//
//        String linkOuterH = link.outerHtml();
//        // "<a href="http://example.com"><b>example</b></a>"
//        String linkInnerH = link.html(); // "<b>example</b>"


    }

    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        try {
            new HtmlReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}