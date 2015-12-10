/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.pvhn.draw;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author Edison
 */
public class Main {

    public String[][] getTeamList() {
        String[][] str = {
            {"France", "Spain", "Germany", "England", "Portugal", "Belgium"},
            {"Italy", "Russia", "Switzerland", "Austria", "Croatia", "Ukraine"},
            {"Czech Republic", "Sweden", "Poland", "Romania", "Slovakia", "Hungary"},
            {"Turkey", "Republic of Ireland", "Iceland", "Wales", "Albania", "Northern Ireland"}
        };
        return str;
    }
    
    public Vector<String> getTeamListByPot(String[][] str, int potNumber) {
        Vector<String> v = new Vector<>();
        for (int j = 0; j < 6; j++) {
            v.add(str[potNumber][j]);
        }
        return v;
    }
    
    public Vector<String> shuffleTeam(Vector<String> v) {
        Collections.shuffle(v);
        return v;
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        String[][] str = m.getTeamList();
        Vector<String> pot0 = m.getTeamListByPot(str, 0);
        Vector<String> pot1 = m.getTeamListByPot(str, 1);
        Vector<String> pot2 = m.getTeamListByPot(str, 2);
        Vector<String> pot3 = m.getTeamListByPot(str, 3);
        
        Vector<String> tmpPot0 = new Vector<>();
        for (int i = 1; i < pot0.size(); i++) {
            tmpPot0.add(pot0.get(i));
        }
        m.shuffleTeam(tmpPot0);
        pot0.clear();
        pot0.add(str[0][0]); // Thêm France
        pot0.addAll(tmpPot0);
        m.shuffleTeam(pot1);
        m.shuffleTeam(pot2);
        m.shuffleTeam(pot3);
        
        // Gán lại giá trị cho mảng
        for (int j = 0; j < 6; j++) {
            str[0][j] = pot0.get(j);
            str[1][j] = pot1.get(j);
            str[2][j] = pot2.get(j);
            str[3][j] = pot3.get(j);
        }
        
        // Sắp xếp thứ tự trong bảng
        Vector<String> tmp0 = new Vector<>();
        Vector<String> tmp1 = new Vector<>();
        Vector<String> tmp2 = new Vector<>();
        Vector<String> tmp3 = new Vector<>();
        Vector<String> tmp4 = new Vector<>();
        Vector<String> tmp5 = new Vector<>();
        
        for (int i = 1; i < 4; i++) {
            tmp0.add(str[i][0]);
            tmp1.add(str[i][1]);
            tmp2.add(str[i][2]);
            tmp3.add(str[i][3]);
            tmp4.add(str[i][4]);
            tmp5.add(str[i][5]);
        }
        
        m.shuffleTeam(tmp0);
        m.shuffleTeam(tmp1);
        m.shuffleTeam(tmp2);
        m.shuffleTeam(tmp3);
        m.shuffleTeam(tmp4);
        m.shuffleTeam(tmp5);
        
        // 6 groups
        Vector<String> group0 = new Vector<>();
        Vector<String> group1 = new Vector<>();
        Vector<String> group2 = new Vector<>();
        Vector<String> group3 = new Vector<>();
        Vector<String> group4 = new Vector<>();
        Vector<String> group5 = new Vector<>();
        
        group0.add(str[0][0]);
        group1.add(str[0][1]);
        group2.add(str[0][2]);
        group3.add(str[0][3]);
        group4.add(str[0][4]);
        group5.add(str[0][5]);
        
        group0.addAll(tmp0);
        group1.addAll(tmp1);
        group2.addAll(tmp2);
        group3.addAll(tmp3);
        group4.addAll(tmp4);
        group5.addAll(tmp5);
        
        // Lại gán lại giá trị cho mảng
        for (int i = 0; i < 4; i++) {
            str[i][0] = group0.get(i);
            str[i][1] = group1.get(i);
            str[i][2] = group2.get(i);
            str[i][3] = group3.get(i);
            str[i][4] = group4.get(i);
            str[i][5] = group5.get(i);
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
}
