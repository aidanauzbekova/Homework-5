class UploadProxy {
    private Agent agent;

    public UploadProxy(Agent agent) {
        this.agent = agent;
    }

    public void uploadImage(String filename) {
        if (agent.isLoggedIn()) {
            System.out.println("Uploading image: " + filename);
        } else {
            System.out.println("Access denied. Please log in.");
        }
    }
}