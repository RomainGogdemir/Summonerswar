package com.example.summonerswar.statUtils;

import java.util.ArrayList;
import java.util.HashMap;

public class StatUtils {

    /*
    INITIAL VALUES OF MAIN STAT
     */
    public HashMap<Stat, Integer> mapForRarityOneInitialMainProc = new HashMap();
    public HashMap<Stat, Integer> mapForRarityTwoInitialMainProc = new HashMap();
    public HashMap<Stat, Integer> mapForRarityThreeInitialMainProc = new HashMap();
    public HashMap<Stat, Integer> mapForRarityFourInitialMainProc = new HashMap();
    public HashMap<Stat, Integer> mapForRarityFiveInitialMainProc = new HashMap();
    public HashMap<Stat, Integer> mapForRaritySixInitialMainProc = new HashMap();

    /*
    UPGRADE MIN AND MAX VALUES OF SUBSTATS
     */
    public HashMap<Stat, Integer>  mapForRarityOneMinSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityTwoMinSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityThreeMinSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityFourMinSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityFiveMinSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRaritySixMinSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityOneMaxSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityTwoMaxSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityThreeMaxSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityFourMaxSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRarityFiveMaxSubstatUpgrade = new HashMap<>();
    public HashMap<Stat, Integer>  mapForRaritySixMaxSubstatUpgrade = new HashMap<>();

    /*
    POSSIBLE MAIN PROC STAT BY NUMBER
     */
    public HashMap<Integer, ArrayList<Stat>> mapForPossibleMainProcStatTwo = new HashMap();
    public HashMap<Integer, ArrayList<Stat>> mapForPossibleMainProcStatFour = new HashMap();
    public HashMap<Integer, ArrayList<Stat>> mapForPossibleMainProcStatSix = new HashMap();

    public StatUtils(){
        init();
    }

    public HashMap<Stat, Integer> getInitialMainProcMapByStarLevel(int numberOfStars){
        if (numberOfStars == 1) {
            return mapForRarityOneInitialMainProc;
        }
        if (numberOfStars == 2) {
            return mapForRarityTwoInitialMainProc;
        }
        if (numberOfStars == 3) {
            return mapForRarityThreeInitialMainProc;
        }
        if (numberOfStars == 4) {
            return mapForRarityFourInitialMainProc;
        }
        if (numberOfStars == 5) {
            return mapForRarityFiveInitialMainProc;
        }
        if (numberOfStars == 6) {
            return mapForRaritySixInitialMainProc;
        }
        return null;
    }

    public HashMap<Stat, Integer> getMapForRarityOneInitialMainProc() {
        return mapForRarityOneInitialMainProc;
    }

    public HashMap<Stat, Integer> getMapForRarityTwoInitialMainProc() {
        return mapForRarityTwoInitialMainProc;
    }

    public HashMap<Stat, Integer> getMapForRarityThreeInitialMainProc() {
        return mapForRarityThreeInitialMainProc;
    }

    public HashMap<Stat, Integer> getMapForRarityFourInitialMainProc() {
        return mapForRarityFourInitialMainProc;
    }

    public HashMap<Stat, Integer> getMapForRarityFiveInitialMainProc() {
        return mapForRarityFiveInitialMainProc;
    }

    public HashMap<Stat, Integer> getMapForRaritySixInitialMainProc() {
        return mapForRaritySixInitialMainProc;
    }

    public HashMap<Stat, Integer> getMapForRarityOneMinSubstatUpgrade() {
        return mapForRarityOneMinSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityTwoMinSubstatUpgrade() {
        return mapForRarityTwoMinSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityThreeMinSubstatUpgrade() {
        return mapForRarityThreeMinSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityFourMinSubstatUpgrade() {
        return mapForRarityFourMinSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityFiveMinSubstatUpgrade() {
        return mapForRarityFiveMinSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRaritySixMinSubstatUpgrade() {
        return mapForRaritySixMinSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityOneMaxSubstatUpgrade() {
        return mapForRarityOneMaxSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityTwoMaxSubstatUpgrade() {
        return mapForRarityTwoMaxSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityThreeMaxSubstatUpgrade() {
        return mapForRarityThreeMaxSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityFourMaxSubstatUpgrade() {
        return mapForRarityFourMaxSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRarityFiveMaxSubstatUpgrade() {
        return mapForRarityFiveMaxSubstatUpgrade;
    }

    public HashMap<Stat, Integer> getMapForRaritySixMaxSubstatUpgrade() {
        return mapForRaritySixMaxSubstatUpgrade;
    }

    public void init() {
        initInitialMainProcMaps();
        initSubstatUpgradeMaps();
        initMapForPossibleMainProcByNumber();
    }

    private void initMapForPossibleMainProcByNumber() {

    }

    public void initInitialMainProcMaps()
    {
        initMapForRarityOneMainProc();
        initMapForRarityTwoMainProc();
        initMapForRarityThreeMainProc();
        initMapForRarityFourMainProc();
        initMapForRarityFiveMainProc();
        initMapForRaritySixMainProc();
    }

    public void initMapForRarityOneMainProc(){
        mapForRarityOneInitialMainProc.put(Stat.HPFlat, 40);
        mapForRarityOneInitialMainProc.put(Stat.HPPercent, 1);
        mapForRarityOneInitialMainProc.put(Stat.AttaqueFlat, 3);
        mapForRarityOneInitialMainProc.put(Stat.AttaquePercent, 1);
        mapForRarityOneInitialMainProc.put(Stat.DefenseFlat, 3);
        mapForRarityOneInitialMainProc.put(Stat.DefensePercent, 1);
        mapForRarityOneInitialMainProc.put(Stat.Vitesse, 1);
        mapForRarityOneInitialMainProc.put(Stat.TauxCritique, 1);
        mapForRarityOneInitialMainProc.put(Stat.DefensePercent, 2);
        mapForRarityOneInitialMainProc.put(Stat.Resistance, 1);
        mapForRarityOneInitialMainProc.put(Stat.Precision, 1);
    }

    public void initMapForRarityTwoMainProc(){
        mapForRarityTwoInitialMainProc.put(Stat.HPFlat, 70);
        mapForRarityTwoInitialMainProc.put(Stat.HPPercent, 2);
        mapForRarityTwoInitialMainProc.put(Stat.AttaqueFlat, 5);
        mapForRarityTwoInitialMainProc.put(Stat.AttaquePercent, 2);
        mapForRarityTwoInitialMainProc.put(Stat.DefenseFlat, 5);
        mapForRarityTwoInitialMainProc.put(Stat.DefensePercent, 2);
        mapForRarityTwoInitialMainProc.put(Stat.Vitesse, 2);
        mapForRarityTwoInitialMainProc.put(Stat.TauxCritique, 2);
        mapForRarityTwoInitialMainProc.put(Stat.DefensePercent, 3);
        mapForRarityTwoInitialMainProc.put(Stat.Resistance, 2);
        mapForRarityTwoInitialMainProc.put(Stat.Precision, 2);
    }

    public void initMapForRarityThreeMainProc(){
        mapForRarityThreeInitialMainProc.put(Stat.HPFlat, 100);
        mapForRarityThreeInitialMainProc.put(Stat.HPPercent, 4);
        mapForRarityThreeInitialMainProc.put(Stat.AttaqueFlat, 7);
        mapForRarityThreeInitialMainProc.put(Stat.AttaquePercent, 4);
        mapForRarityThreeInitialMainProc.put(Stat.DefenseFlat, 7);
        mapForRarityThreeInitialMainProc.put(Stat.DefensePercent, 4);
        mapForRarityThreeInitialMainProc.put(Stat.Vitesse, 3);
        mapForRarityThreeInitialMainProc.put(Stat.TauxCritique, 3);
        mapForRarityThreeInitialMainProc.put(Stat.DefensePercent, 4);
        mapForRarityThreeInitialMainProc.put(Stat.Resistance, 4);
        mapForRarityThreeInitialMainProc.put(Stat.Precision, 4);
    }

    public void initMapForRarityFourMainProc(){
        mapForRarityFourInitialMainProc.put(Stat.HPFlat, 160);
        mapForRarityFourInitialMainProc.put(Stat.HPPercent, 5);
        mapForRarityFourInitialMainProc.put(Stat.AttaqueFlat, 10);
        mapForRarityFourInitialMainProc.put(Stat.AttaquePercent, 5);
        mapForRarityFourInitialMainProc.put(Stat.DefenseFlat, 10);
        mapForRarityFourInitialMainProc.put(Stat.DefensePercent, 5);
        mapForRarityFourInitialMainProc.put(Stat.Vitesse, 4);
        mapForRarityFourInitialMainProc.put(Stat.TauxCritique, 4);
        mapForRarityFourInitialMainProc.put(Stat.DefensePercent, 6);
        mapForRarityFourInitialMainProc.put(Stat.Resistance, 6);
        mapForRarityFourInitialMainProc.put(Stat.Precision, 6);
    }

    public void initMapForRarityFiveMainProc(){
        mapForRarityFiveInitialMainProc.put(Stat.HPFlat, 270);
        mapForRarityFiveInitialMainProc.put(Stat.HPPercent, 8);
        mapForRarityFiveInitialMainProc.put(Stat.AttaqueFlat, 15);
        mapForRarityFiveInitialMainProc.put(Stat.AttaquePercent, 8);
        mapForRarityFiveInitialMainProc.put(Stat.DefenseFlat, 15);
        mapForRarityFiveInitialMainProc.put(Stat.DefensePercent, 8);
        mapForRarityFiveInitialMainProc.put(Stat.Vitesse, 5);
        mapForRarityFiveInitialMainProc.put(Stat.TauxCritique, 5);
        mapForRarityFiveInitialMainProc.put(Stat.DefensePercent, 8);
        mapForRarityFiveInitialMainProc.put(Stat.Resistance, 9);
        mapForRarityFiveInitialMainProc.put(Stat.Precision, 9);
    }

    public void initMapForRaritySixMainProc(){
        mapForRaritySixInitialMainProc.put(Stat.HPFlat, 360);
        mapForRaritySixInitialMainProc.put(Stat.HPPercent, 11);
        mapForRaritySixInitialMainProc.put(Stat.AttaqueFlat, 22);
        mapForRaritySixInitialMainProc.put(Stat.AttaquePercent, 11);
        mapForRaritySixInitialMainProc.put(Stat.DefenseFlat, 22);
        mapForRaritySixInitialMainProc.put(Stat.DefensePercent, 11);
        mapForRaritySixInitialMainProc.put(Stat.Vitesse, 7);
        mapForRaritySixInitialMainProc.put(Stat.TauxCritique, 7);
        mapForRaritySixInitialMainProc.put(Stat.DefensePercent, 11);
        mapForRaritySixInitialMainProc.put(Stat.Resistance, 12);
        mapForRaritySixInitialMainProc.put(Stat.Precision, 12);
    }

    public void initSubstatUpgradeMaps() {
        initMapForRarityOneMinSubstatUpgrade();
        initMapForRarityOneMaxSubstatUpgrade();
        initMapForRarityTwoMinSubstatUpgrade();
        initMapForRarityTwoMaxSubstatUpgrade();
        initMapForRarityThreeMinSubstatUpgrade();
        initMapForRarityThreeMaxSubstatUpgrade();
        initMapForRarityFourMinSubstatUpgrade();
        initMapForRarityFourMaxSubstatUpgrade();
        initMapForRarityFiveMinSubstatUpgrade();
        initMapForRarityFiveMaxSubstatUpgrade();
        initMapForRaritySixMinSubstatUpgrade();
        initMapForRaritySixMaxSubstatUpgrade();
    }

    public void initMapForRarityOneMinSubstatUpgrade() {
        mapForRarityOneMinSubstatUpgrade.put(Stat.HPFlat, 15);
        mapForRarityOneMinSubstatUpgrade.put(Stat.HPPercent, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.AttaqueFlat, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.AttaquePercent, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.DefenseFlat, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.DefensePercent, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.Vitesse, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.TauxCritique, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.DégatsCritiques, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.Resistance, 1);
        mapForRarityOneMinSubstatUpgrade.put(Stat.Precision, 1);
    }

    public void initMapForRarityOneMaxSubstatUpgrade() {
        mapForRarityOneMaxSubstatUpgrade.put(Stat.HPFlat, 60);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.HPPercent, 2);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.AttaqueFlat, 4);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.AttaquePercent, 2);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.DefenseFlat, 4);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.DefensePercent, 2);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.Vitesse, 1);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.TauxCritique, 2);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.DégatsCritiques, 2);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.Resistance, 2);
        mapForRarityOneMaxSubstatUpgrade.put(Stat.Precision, 2);
    }

    public void initMapForRarityTwoMinSubstatUpgrade() {
        mapForRarityTwoMinSubstatUpgrade.put(Stat.HPFlat, 30);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.HPPercent, 1);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.AttaqueFlat, 2);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.AttaquePercent, 1);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.DefenseFlat, 2);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.DefensePercent, 1);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.Vitesse, 1);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.TauxCritique, 1);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.DégatsCritiques, 1);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.Resistance, 1);
        mapForRarityTwoMinSubstatUpgrade.put(Stat.Precision, 1);
    }

    public void initMapForRarityTwoMaxSubstatUpgrade() {
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.HPFlat, 105);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.HPPercent, 3);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.AttaqueFlat, 5);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.AttaquePercent, 3);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.DefenseFlat, 5);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.DefensePercent, 3);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.Vitesse, 2);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.TauxCritique, 3);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.DégatsCritiques, 3);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.Resistance, 3);
        mapForRarityTwoMaxSubstatUpgrade.put(Stat.Precision, 3);
    }

    public void initMapForRarityThreeMinSubstatUpgrade() {
        mapForRarityThreeMinSubstatUpgrade.put(Stat.HPFlat, 45);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.HPPercent, 2);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.AttaqueFlat, 3);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.AttaquePercent, 2);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.DefenseFlat, 3);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.DefensePercent, 2);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.Vitesse, 1);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.TauxCritique, 1);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.DégatsCritiques, 2);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.Resistance, 2);
        mapForRarityThreeMinSubstatUpgrade.put(Stat.Precision, 2);
    }

    public void initMapForRarityThreeMaxSubstatUpgrade() {
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.HPFlat, 165);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.HPPercent, 5);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.AttaqueFlat, 8);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.AttaquePercent,5);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.DefenseFlat, 8);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.DefensePercent, 5);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.Vitesse, 3);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.TauxCritique, 3);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.DégatsCritiques, 4);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.Resistance, 4);
        mapForRarityThreeMaxSubstatUpgrade.put(Stat.Precision, 4);
    }

    public void initMapForRarityFourMinSubstatUpgrade() {
        mapForRarityFourMinSubstatUpgrade.put(Stat.HPFlat, 60);
        mapForRarityFourMinSubstatUpgrade.put(Stat.HPPercent, 3);
        mapForRarityFourMinSubstatUpgrade.put(Stat.AttaqueFlat, 4);
        mapForRarityFourMinSubstatUpgrade.put(Stat.AttaquePercent, 3);
        mapForRarityFourMinSubstatUpgrade.put(Stat.DefenseFlat, 4);
        mapForRarityFourMinSubstatUpgrade.put(Stat.DefensePercent, 3);
        mapForRarityFourMinSubstatUpgrade.put(Stat.Vitesse, 2);
        mapForRarityFourMinSubstatUpgrade.put(Stat.TauxCritique, 2);
        mapForRarityFourMinSubstatUpgrade.put(Stat.DégatsCritiques, 2);
        mapForRarityFourMinSubstatUpgrade.put(Stat.Resistance, 2);
        mapForRarityFourMinSubstatUpgrade.put(Stat.Precision, 2);
    }

    public void initMapForRarityFourMaxSubstatUpgrade() {
        mapForRarityFourMaxSubstatUpgrade.put(Stat.HPFlat, 225);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.HPPercent, 6);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.AttaqueFlat, 10);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.AttaquePercent, 6);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.DefenseFlat, 10);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.DefensePercent, 6);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.Vitesse, 4);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.TauxCritique, 4);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.DégatsCritiques, 5);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.Resistance, 5);
        mapForRarityFourMaxSubstatUpgrade.put(Stat.Precision, 5);
    }

    public void initMapForRarityFiveMinSubstatUpgrade() {
        mapForRarityFiveMinSubstatUpgrade.put(Stat.HPFlat, 90);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.HPPercent, 4);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.AttaqueFlat, 8);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.AttaquePercent, 4);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.DefenseFlat, 8);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.DefensePercent, 4);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.Vitesse, 3);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.TauxCritique, 3);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.DégatsCritiques, 3);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.Resistance, 3);
        mapForRarityFiveMinSubstatUpgrade.put(Stat.Precision, 3);
    }

    public void initMapForRarityFiveMaxSubstatUpgrade() {
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.HPFlat, 300);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.HPPercent, 7);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.AttaqueFlat, 15);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.AttaquePercent, 7);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.DefenseFlat, 15);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.DefensePercent, 7);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.Vitesse, 5);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.TauxCritique, 5);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.DégatsCritiques, 5);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.Resistance, 7);
        mapForRarityFiveMaxSubstatUpgrade.put(Stat.Precision, 7);
    }

    public void initMapForRaritySixMinSubstatUpgrade() {
        mapForRaritySixMinSubstatUpgrade.put(Stat.HPFlat, 135);
        mapForRaritySixMinSubstatUpgrade.put(Stat.HPPercent, 5);
        mapForRaritySixMinSubstatUpgrade.put(Stat.AttaqueFlat, 10);
        mapForRaritySixMinSubstatUpgrade.put(Stat.AttaquePercent, 5);
        mapForRaritySixMinSubstatUpgrade.put(Stat.DefenseFlat, 10);
        mapForRaritySixMinSubstatUpgrade.put(Stat.DefensePercent, 5);
        mapForRaritySixMinSubstatUpgrade.put(Stat.Vitesse, 4);
        mapForRaritySixMinSubstatUpgrade.put(Stat.TauxCritique, 4);
        mapForRaritySixMinSubstatUpgrade.put(Stat.DégatsCritiques, 4);
        mapForRaritySixMinSubstatUpgrade.put(Stat.Resistance, 4);
        mapForRaritySixMinSubstatUpgrade.put(Stat.Precision, 4);
    }

    public void initMapForRaritySixMaxSubstatUpgrade() {
        mapForRaritySixMaxSubstatUpgrade.put(Stat.HPFlat, 375);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.HPPercent, 8);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.AttaqueFlat, 20);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.AttaquePercent, 8);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.DefenseFlat, 20);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.DefensePercent, 8);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.Vitesse, 6);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.TauxCritique, 6);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.DégatsCritiques, 7);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.Resistance, 8);
        mapForRaritySixMaxSubstatUpgrade.put(Stat.Precision, 8);
    }
}
