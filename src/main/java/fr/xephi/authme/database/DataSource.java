package fr.xephi.authme.database;

public interface DataSource {

    boolean isAuthAvailable(String user);

    void close();

    void reload();

    boolean isLogged(String user);

}
