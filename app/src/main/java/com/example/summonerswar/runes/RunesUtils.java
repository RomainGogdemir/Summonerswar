package com.example.summonerswar.runes;

import com.example.summonerswar.statUtils.Stat;

import java.util.ArrayList;
import java.util.Random;

public class RunesUtils {

    SummonRunes sr = new SummonRunes();

    public Stat getRuneNextStat(Runes rune){
        ArrayList<Stat> runeStats = getStatList(rune);
        int runeNumber = rune.getNumber();

        // TO BE CREATED
        // ArrayList<Stat> possibleStats = RunesRules.getListStatForNumber(runeNumber);
        ArrayList<Stat> possibleStats = new ArrayList<>();
        Stat toReturn;
        Random r = new Random();
        toReturn = possibleStats.get(r.nextInt(possibleStats.size()));
        while (runeStats.contains(toReturn)){
            toReturn = possibleStats.get(r.nextInt(possibleStats.size()));
        }
        return toReturn;
    }

    public ArrayList<Stat> getStatList(Runes rune){
        ArrayList<Stat> runesStat = new ArrayList<>();
        runesStat.add(rune.getMainStat());
        if (rune.getInnateStat() != null) {
            runesStat.add(rune.getInnateStat());
        }
        if (rune.getFirstProc() != null) {
            runesStat.add(rune.getFirstProc());
        }
        if (rune.getSecondProc() != null) {
            runesStat.add(rune.getSecondProc());
        }
        if (rune.getThirdProc() != null) {
            runesStat.add(rune.getThirdProc());
        }
        return  runesStat;
    }

}
