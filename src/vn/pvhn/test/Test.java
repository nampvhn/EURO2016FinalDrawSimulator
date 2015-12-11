/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.pvhn.test;

import java.util.Vector;
import vn.pvhn.main.Draw;

/**
 *
 * @author Edison
 */
public class Test {

    public static void main(String[] args) {
        Draw draw = new Draw();

        // Get all 24 teams
        String[][] teamList = draw.getTeamList();
        
        // Divide into 4 pots
        Vector<String> pot0 = draw.getTeamListByPot(teamList, 0);
        Vector<String> pot1 = draw.getTeamListByPot(teamList, 1);
        Vector<String> pot2 = draw.getTeamListByPot(teamList, 2);
        Vector<String> pot3 = draw.getTeamListByPot(teamList, 3);

        // Not include France
        Vector<String> tmpPot0 = new Vector<>();
        for (int i = 1; i < pot0.size(); i++) {
            tmpPot0.add(pot0.get(i));
        }
        
        draw.shuffleTeam(tmpPot0);
        pot0.clear();
        pot0.add(teamList[0][0]); // Add France
        pot0.addAll(tmpPot0);
        
        draw.shuffleTeam(pot1);
        draw.shuffleTeam(pot2);
        draw.shuffleTeam(pot3);

        // Array teamList with new values
        for (int j = 0; j < 6; j++) {
            teamList[0][j] = pot0.get(j);
            teamList[1][j] = pot1.get(j);
            teamList[2][j] = pot2.get(j);
            teamList[3][j] = pot3.get(j);
        }

        // Reorder every groups
        Vector<String> tmp0 = new Vector<>();
        Vector<String> tmp1 = new Vector<>();
        Vector<String> tmp2 = new Vector<>();
        Vector<String> tmp3 = new Vector<>();
        Vector<String> tmp4 = new Vector<>();
        Vector<String> tmp5 = new Vector<>();

        // Add teams to each group, not include "Seed"
        for (int i = 1; i < 4; i++) {
            tmp0.add(teamList[i][0]);
            tmp1.add(teamList[i][1]);
            tmp2.add(teamList[i][2]);
            tmp3.add(teamList[i][3]);
            tmp4.add(teamList[i][4]);
            tmp5.add(teamList[i][5]);
        }

        draw.shuffleTeam(tmp0);
        draw.shuffleTeam(tmp1);
        draw.shuffleTeam(tmp2);
        draw.shuffleTeam(tmp3);
        draw.shuffleTeam(tmp4);
        draw.shuffleTeam(tmp5);

        // 6 groups
        Vector<String> group0 = new Vector<>();
        Vector<String> group1 = new Vector<>();
        Vector<String> group2 = new Vector<>();
        Vector<String> group3 = new Vector<>();
        Vector<String> group4 = new Vector<>();
        Vector<String> group5 = new Vector<>();

        // Add "Seed" to each group
        group0.add(teamList[0][0]);
        group1.add(teamList[0][1]);
        group2.add(teamList[0][2]);
        group3.add(teamList[0][3]);
        group4.add(teamList[0][4]);
        group5.add(teamList[0][5]);

        // Add 3 others to each group
        group0.addAll(tmp0);
        group1.addAll(tmp1);
        group2.addAll(tmp2);
        group3.addAll(tmp3);
        group4.addAll(tmp4);
        group5.addAll(tmp5);

        // Array teamList with new values
        for (int i = 0; i < 4; i++) {
            teamList[i][0] = group0.get(i);
            teamList[i][1] = group1.get(i);
            teamList[i][2] = group2.get(i);
            teamList[i][3] = group3.get(i);
            teamList[i][4] = group4.get(i);
            teamList[i][5] = group5.get(i);
        }

        // Show
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 5) {
                    System.out.print(teamList[i][j]);
                } else {
                    System.out.print(teamList[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }
}
