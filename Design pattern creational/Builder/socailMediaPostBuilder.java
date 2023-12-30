package Builder;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class socailMediaPostBuilder {
    private final SocialMediaPost post = new SocialMediaPost();

    public socailMediaPostBuilder addTitle(String title) {
        post.setTitle(title);
        return this;
    }

    public socailMediaPostBuilder addContent(String content) {
        post.setContent(content);
        return this;
    }

    public socailMediaPostBuilder addAuthor(String author) {
        post.setAuthor(author);
        return this;
    }

    public socailMediaPostBuilder setPostDate(LocalDateTime postDate) {
        post.setDatePosted(postDate);
        return this;
    }

    public socailMediaPostBuilder addTag(String tag) {
        if (post.getTags() == null) {
            post.setTags(new ArrayList<>());
        }
        post.getTags().add(tag);
        return this;
    }

    public socailMediaPostBuilder addImage(URI imageUri) {
        post.setImageUri(imageUri);
        return this;
    }

    public socailMediaPostBuilder addLink(URI link) {
        if (post.getLinks() == null) {
            post.setLinks(new ArrayList<>());
        }
        post.getLinks().add(link);
        return this;
    }

    public SocialMediaPost build() {
        return post;
    }
}
