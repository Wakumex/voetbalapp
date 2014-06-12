/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voetbal;

/**
 *
 * @author kevin
 */
public class Speler {
    String naam, team, positie, land;

    public Speler(String[] speler) {
        this.naam = speler[0];
        this.team = speler[1];
        this.positie = speler[2];
        this.land = speler[3];
    }

    public String getNaam() {
        return naam;
    }

    public String getTeam() {
        return team;
    }

    public String getPositie() {
        return positie;
    }

    public String getLand() {
        return land;
    }
    
}
