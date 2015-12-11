/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.pvhn.main;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author Edison
 */
public class Draw {

    // 24 teams, include host France and current champion Spain
    public String[][] getTeamList() {
        String[][] teamList = {
            {"France", "Spain", "Germany", "England", "Portugal", "Belgium"},
            {"Italy", "Russia", "Switzerland", "Austria", "Croatia", "Ukraine"},
            {"Czech Republic", "Sweden", "Poland", "Romania", "Slovakia", "Hungary"},
            {"Turkey", "Republic of Ireland", "Iceland", "Wales", "Albania", "Northern Ireland"}
        };
        return teamList;
    }

    // 4 pots
    public Vector<String> getTeamListByPot(String[][] teamList, int potNumber) {
        Vector<String> pot = new Vector<>();
        if (teamList.length != 0 && potNumber >= 0 && potNumber <= 3) {
            for (int j = 0; j < 6; j++) {
                pot.add(teamList[potNumber][j]);
            }
        }
        return pot;
    }

    // Shuffle
    public Vector<String> shuffleTeam(Vector<String> teamList) {
        if (!teamList.isEmpty()) {
            Collections.shuffle(teamList);
        }
        return teamList;
    }
}
