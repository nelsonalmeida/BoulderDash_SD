package fr.enssat.BoulderDash.server;

import fr.enssat.BoulderDash.Game;
import java.util.ArrayList;
import java.util.Vector;

public class BoulderDashDB {
    
    private Vector<User> users = new Vector();
    private Vector<GameW> games = new Vector();

    
    
    public BoulderDashDB() {
        
        users.add(new User("daniel", "mendes"));
        users.add(new User("nelson", "almeida"));
    
    }

     /**
     * Registers a new user.
     * 
     * @param u username
     * @param p passwd
     * @return 
     */
    public boolean register(String u, String p) {
        if (!exists(u, p)) {
            users.add(new User(u, p));
            return true;
        }
        return false;
    }

    /**
     * Checks the credentials of an user.
     * 
     * @param u username
     * @param p passwd
     * @return
     */
    public boolean exists(String u, String p) {
        for(User usr : this.users) {
            if (usr.getUname().compareTo(u) == 0 && usr.getPword().compareTo(p) == 0) {
                return true;
            }
        }
        return false;
        //return ((u.equalsIgnoreCase("guest") && p.equalsIgnoreCase("ufp")) ? true : false);
    }
    
    
   
     /* Start Game */
     
    public void insertGame(GameW g) {
        games.add(g);
    }
    
    public GameW[] selectGames() {
        GameW[] agames = new GameW[games.size()];
        for (int i = 0; i < games.size(); i++) {
            if(games.elementAt(i).getNplayers()<2){
                 agames[i] = games.elementAt(i);
            }
        }
        return agames;
    }
    
    
}
