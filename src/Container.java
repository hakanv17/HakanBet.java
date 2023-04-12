class Container {


    public String name, surname, username;


    private static Container instance = null;

    private void Container() {

    }

    public static Container getInstance() {
        if (instance == null) {
            instance = new Container();
        }
        return instance;
    }
}