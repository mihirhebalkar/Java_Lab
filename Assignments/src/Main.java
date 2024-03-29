public class Post {
    public void publish() {
        System.out.println("Publishing a generic post");
    }
}

public class TextPost extends Post {
    @Override
    public void publish() {
        System.out.println("Publishing a text post");
    }
}

public class ImagePost extends Post {
    @Override
    public void publish() {
        System.out.println("Publishing an image post");
    }
}

public class VideoPost extends Post {
    @Override
    public void publish() {
        System.out.println("Publishing a video post");
    }
