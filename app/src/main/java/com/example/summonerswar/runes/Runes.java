package com.example.summonerswar.runes;

import android.util.Log;

import com.example.summonerswar.statUtils.Rarity;
import com.example.summonerswar.statUtils.Set;
import com.example.summonerswar.statUtils.Stat;
import com.example.summonerswar.statUtils.StatUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Runes {

    private int number;
    private Set set;

    private Stat mainStat;
    private Stat innateStat;
    private Stat firstProc;
    private Stat secondProc;
    private Stat thirdProc;
    private Stat fourthProc;

    private int amountMain;
    private int amountInnate;
    private int amountFirst;
    private int amountSecond;
    private int amountThird;
    private int amountFourth;

    private Integer numberOfAddedStats;
    private Rarity rarityName;

    private ArrayList<Stat> existingStat;

    private int upgradeNumber;
    private int numberOfStar;

    private StatUtils statUtils = new StatUtils();

    private Random r;

    public HashMap<Rarity, Integer> rarityToNumberOfStat = new HashMap();

    public Runes(){
        r = new Random();
        init();
        initSetNumber();
        initRarityStarNumber();
        initStats(r.nextBoolean());
    }

    public int getNumberOfStar() {
        return numberOfStar;
    }

    public String prettyPrint(){
        StringBuilder sb = new StringBuilder();
        sb.append("Set = " + getSet() + "\n");
        sb.append("N° = " + getNumber() + "\n");
        sb.append("Number of Stars = " + getNumberOfStar() + "\n");
        sb.append("Rarity = " + getRarityName() + "\n");
        sb.append("AmountMain = " + getAmountMain() + " MainStat = " + getMainStat() + "\n");
        if (innateStat != null) {
            sb.append("AmountInnate = " + getAmountInnate() +
                    " InnateStat = " + getInnateStat() + "\n");
        }
        sb.append("\n");
        if (firstProc != null) {
            sb.append("amountFirst = " + getAmountFirst() +
                    " firstProc = " + getFirstProc()+ "\n");
        }
        if (secondProc != null) {
            sb.append("amountSecond = " + getAmountSecond() +
                    " secondProc = " + getSecondProc()+ "\n");
        }
        if (thirdProc != null) {
            sb.append("amountThird = " + getAmountThird() +
                    " thirdProc = " + getThirdProc()+ "\n");
        }
        if (fourthProc != null) {
            sb.append("fourthFirst = " + getAmountFourth() +
                    " fourthProc = " + getFourthProc()+ "\n");
        }
        return sb.toString();
    }

    public void init(){
        rarityToNumberOfStat.put(Rarity.Commune, 0);
        rarityToNumberOfStat.put(Rarity.PeuCommune, 1);
        rarityToNumberOfStat.put(Rarity.Rare, 2);
        rarityToNumberOfStat.put(Rarity.Héroique, 3);
        rarityToNumberOfStat.put(Rarity.Légendaire, 4);

        existingStat = new ArrayList<>();
    }

    private void initSetNumber() {
        Set set = Set.values()[r.nextInt(Set.values().length)];
        setSet(set);
        setNumber(r.nextInt(6)+1);
    }

    private void initRarityStarNumber() {
        Rarity rarity = Rarity.values()[r.nextInt(Rarity.values().length)];
        setRarityName(rarity);
        numberOfAddedStats = rarityToNumberOfStat.get(rarity);
        numberOfStar = r.nextInt(5) + 1;
    }

    public void initStats(boolean hasInnate){
        initMainStat();
        initInnateStat(hasInnate);
        initOtherStats();
    }

    private void initOtherStats(){
        for (int rarityMeter = 0; rarityMeter < numberOfAddedStats; rarityMeter++) {
            if (rarityMeter == 0) {
                setFirstProc(produceNewStat());
                existingStat.add(firstProc);
                setAmountFirst(r.nextInt(10));
            }
            if (rarityMeter == 1) {
                setSecondProc(produceNewStat());
                existingStat.add(secondProc);
                setAmountSecond(r.nextInt(10));
            }
            if (rarityMeter == 2) {
                setThirdProc(produceNewStat());
                existingStat.add(thirdProc);
                setAmountThird(r.nextInt(10));
            }
            if (rarityMeter == 3) {
                setFourthProc(produceNewStat());
                existingStat.add(fourthProc);
                setAmountFourth(r.nextInt(10));
            }
        }
    }

    private void initMainStat() {
        if (number == 1){
            setInitialMainProcNumberOne();
        }
        if (number == 2)
        {
            setInitialMainProcNumberTwo();

        }
        if (number == 3)
        {
            setInitialMainProcNumberThree();

        }
        if (number == 4)
        {
            setInitialMainProcNumberFour();

        }
        if (number == 5)
        {
            setInitialMainProcNumberFive();
        }
        if (number == 6)
        {
            setInitialMainProcNumberSix();
        }
        existingStat.add(mainStat);
    }

    private void setInitialMainProcNumberOne() {
        setMainStat(Stat.AttaqueFlat);
        setAmountMain(r.nextInt(statUtils.getInitialMainProcMapByStarLevel(numberOfStar).get(mainStat)));
    }

    private void setInitialMainProcNumberTwo() {
        setMainStat(statUtils.getArrayListForPossibleMainProcStatTwo().get(r.nextInt(statUtils.getArrayListForPossibleMainProcStatTwo().size())));
        setAmountMain(statUtils.getInitialMainProcMapByStarLevel(numberOfStar).get(mainStat));
    }

    private void setInitialMainProcNumberThree() {
        setMainStat(Stat.DefenseFlat);
        setAmountMain(r.nextInt(statUtils.getInitialMainProcMapByStarLevel(numberOfStar).get(mainStat)));
    }

    private void setInitialMainProcNumberFour() {
        setMainStat(statUtils.getArrayListForPossibleMainProcStatTwo().get(r.nextInt(statUtils.getArrayListForPossibleMainProcStatTwo().size())));
        setAmountMain(statUtils.getInitialMainProcMapByStarLevel(numberOfStar).get(mainStat));
    }

    private void setInitialMainProcNumberFive() {
        setMainStat(Stat.HPFlat);
        setAmountMain(r.nextInt(statUtils.getInitialMainProcMapByStarLevel(numberOfStar).get(mainStat)));
    }

    private void setInitialMainProcNumberSix() {
        setMainStat(statUtils.getArrayListForPossibleMainProcStatTwo().get(r.nextInt(statUtils.getArrayListForPossibleMainProcStatTwo().size())));
        setAmountMain(statUtils.getInitialMainProcMapByStarLevel(numberOfStar).get(mainStat));
    }

    private void initInnateStat(boolean hasInnate) {
        if (hasInnate){
            setAmountInnate(r.nextInt(10)+10);
            setInnateStat(produceNewStat());
        }
    }

    public Stat produceNewStat() {
        Stat newStat = Stat.values()[r.nextInt(Stat.values().length)];
        while (existingStat.contains(newStat)) {
            newStat = Stat.values()[r.nextInt(Stat.values().length)];
        }
        return newStat;
    }

    public void initPrimalStats(){

    }

    public void initRarity(Rarity rarity){
        setRarityName(rarity);
    }

    public void initSetNumber(Set set, int number){
        setSet(set);
        setNumber(number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setMainStat(Stat mainStat) {
        this.mainStat = mainStat;
    }

    public void setInnateStat(Stat innateStat) {
        this.innateStat = innateStat;
    }

    public void setFirstProc(Stat firstProc) {
        this.firstProc = firstProc;
    }

    public void setSecondProc(Stat secondProc) {
        this.secondProc = secondProc;
    }

    public void setThirdProc(Stat thirdProc) {
        this.thirdProc = thirdProc;
    }

    public void setFourthProc(Stat fourthProc) {
        this.fourthProc = fourthProc;
    }

    public void setAmountMain(int amountMain) {
        this.amountMain = amountMain;
    }

    public void setAmountInnate(int amountInnate) {
        this.amountInnate = amountInnate;
    }

    public void setAmountFirst(int amountFirst) {
        this.amountFirst = amountFirst;
    }

    public void setAmountSecond(int amountSecond) {
        this.amountSecond = amountSecond;
    }

    public void setAmountThird(int amountThird) {
        this.amountThird = amountThird;
    }

    public void setAmountFourth(int amountFourth) {
        this.amountFourth = amountFourth;
    }

    public void setNumberOfAddedStats(Integer numberOfAddedStats) {
        this.numberOfAddedStats = numberOfAddedStats;
    }

    public void setRarityName(Rarity rarityName) {
        this.rarityName = rarityName;
    }

    public void setUpgradeNumber(int upgradeNumber) {
        this.upgradeNumber = upgradeNumber;
    }

    public int getNumber() {
        return number;
    }

    public Set getSet() {
        return set;
    }

    public Stat getMainStat() {
        return mainStat;
    }

    public Stat getInnateStat() {
        return innateStat;
    }

    public Stat getFirstProc() {
        return firstProc;
    }

    public Stat getSecondProc() {
        return secondProc;
    }

    public Stat getThirdProc() {
        return thirdProc;
    }

    public Stat getFourthProc() {
        return fourthProc;
    }

    public int getAmountMain() {
        return amountMain;
    }

    public int getAmountInnate() {
        return amountInnate;
    }

    public int getAmountFirst() {
        return amountFirst;
    }

    public int getAmountSecond() {
        return amountSecond;
    }

    public int getAmountThird() {
        return amountThird;
    }

    public int getAmountFourth() {
        return amountFourth;
    }

    public Integer getNumberOfAddedStats() {
        return numberOfAddedStats;
    }

    public Rarity getRarityName() {
        return rarityName;
    }

    public int getUpgradeNumber() {
        return upgradeNumber;
    }

}
