package fr.enssat.BoulderDash.server;

import java.util.ArrayList;

public class BoulderDashDB {

    protected ArrayList<User> users = new ArrayList();
    protected ArrayList<CurrentGames> games = new ArrayList();

    public BoulderDashDB() {
        //Ao instanciar a base de dados cria logo 2 utilizadores estaticos
        
        addUser("nelson", "almeida");
        addUser("daniel" , "mendes");
        
        //users.add(new User("daniel", "mendes"));
        //users.add(new User("nelson", "almeida"));
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
            if (usr.getUname().compareTo(user) == 0 && usr.getPword().compareTo(pass) == 0) {
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
    
     public CurrentGames getGame(String name){
        for(int i=0;i<games.size();i++){
            CurrentGames game = games.get(i);
            if(game.getName().equals(name)){
                return game;
            }
        }
        return null;
    }

}