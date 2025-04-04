class Agent {
    private boolean loggedIn;

    public void login() {
        loggedIn = true;
        System.out.println("Agent logged in");
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}