package Builder;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            SocialMediaPost post = SocialMediaPost.builder()
                .addTitle("The Builder Design Patterns")
                .addContent("Some interesting facts about the Builder...")
                .addAuthor("Sean Campbell")
                .setPostDate(LocalDateTime.now())
                .addTag("designPatterns")
                .addTag("#Java")
                .addLink(new URI("http://somelink.com"))
                .build();

            System.out.println(post);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
