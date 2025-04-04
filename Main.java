public class Main {
    public static void main(String[] args) {

        Image house = new ProxyImage("house_high_res.jpg");

        Agent agent = new Agent();
        UploadProxy upload = new UploadProxy(agent);


        house.displayThumbnail();


        house.displayFullImage();


        upload.uploadImage("new_house.jpg");


        agent.login();


        upload.uploadImage("new_house.jpg");
    }
}