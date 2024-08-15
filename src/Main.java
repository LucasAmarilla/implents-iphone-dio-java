public class Main implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String model;

    public Main(String model) {
        this.model = model;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving a call...");
    }

    @Override
    public void browse(String url) {
        System.out.println("Browsing to " + url + "...");
    }

    @Override
    public void search(String query) {
        System.out.println("Searching for " + query + "...");
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
}
