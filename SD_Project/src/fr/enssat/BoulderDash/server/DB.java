package fr.enssat.BoulderDash.server;

import java.io.Serializable;
import java.util.ArrayList;

public class DB implements Serializable {

    protected ArrayList<User> users;
    protected ArrayList<CurrentGames> games;

    public DB() {
        //Ao instanciar a base de dados cria logo 2 utilizadores estaticos
        users.add(new User("daniel", "mendes"));
        users.add(new User("nelson", "almeida"));

    }

    public boolean addUser(String user, String pass) {
        if (!exists(user, pass)) {
            users.add(new User(user, pass));
            return true;
        }
        return false;
    }

    public boolean exists(String user, String pass) {
        for (User usr : this.users) {
            if (usr.getUsername().compareTo(user) == 0 && usr.getPassword().compareTo(pass) == 0) {
                return true;
            }
        }
        return false;
    }
    
    public void insertGame(CurrentGames newGame) {
        games.add(newGame);
    }

    public CurrentGames[] selectGames() {
        CurrentGames[] currentGames = new CurrentGames[games.size()];
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).getNplayers() < 2) {
                currentGames[i] = games.get(i);
            }
        }
        return currentGames;
    }

}
