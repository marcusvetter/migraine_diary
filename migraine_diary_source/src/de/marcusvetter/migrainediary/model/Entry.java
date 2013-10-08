package de.marcusvetter.migrainediary.model;

/**
 * Created by Marcus on 01.09.13.
 */
public class Entry {

    private String date;
    private String getUp;
    private String bedtime;
    private String activity;
    private int stressLevel;
    private String headpain;
    private boolean painkiller;
    private boolean surplusCarb;
    private boolean surplusFat;
    private boolean surplusProtein;
    private boolean lackWater;
    private boolean lackMeat;
    private boolean drinksCoffee;
    private boolean drinksAlc;
    private String weather;
    private String temp;
    private boolean sportsEndurance;
    private boolean sportsPower;
    private String comments;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGetUp() {
        return getUp;
    }

    public void setGetUp(String get_up) {
        this.getUp = get_up;
    }

    public String getBedtime() {
        return bedtime;
    }

    public void setBedtime(String bedtime) {
        this.bedtime = bedtime;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(int stressLevel) {
        this.stressLevel = stressLevel;
    }

    public String getHeadpain() {
        return headpain;
    }

    public void setHeadpain(String headpain) {
        this.headpain = headpain;
    }

    public boolean isPainkiller() {
        return painkiller;
    }

    public void setPainkiller(boolean painkiller) {
        this.painkiller = painkiller;
    }

    public boolean isSurplusCarb() {
        return surplusCarb;
    }

    public void setSurplusCarb(boolean surplusCarb) {
        this.surplusCarb = surplusCarb;
    }

    public boolean isSurplusFat() {
        return surplusFat;
    }

    public void setSurplusFat(boolean surplusFat) {
        this.surplusFat = surplusFat;
    }

    public boolean isSurplusProtein() {
        return surplusProtein;
    }

    public void setSurplusProtein(boolean surplusProtein) {
        this.surplusProtein = surplusProtein;
    }

    public boolean isLackWater() {
        return lackWater;
    }

    public void setLackWater(boolean lackWater) {
        this.lackWater = lackWater;
    }

    public boolean isLackMeat() {
        return lackMeat;
    }

    public void setLackMeat(boolean lackMeat) {
        this.lackMeat = lackMeat;
    }

    public boolean isDrinksCoffee() {
        return drinksCoffee;
    }

    public void setDrinksCoffee(boolean drinksCoffee) {
        this.drinksCoffee = drinksCoffee;
    }

    public boolean isDrinksAlc() {
        return drinksAlc;
    }

    public void setDrinksAlc(boolean drinksAlc) {
        this.drinksAlc = drinksAlc;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public boolean isSportsEndurance() {
        return sportsEndurance;
    }

    public void setSportsEndurance(boolean sportsEndurance) {
        this.sportsEndurance = sportsEndurance;
    }

    public boolean isSportsPower() {
        return sportsPower;
    }

    public void setSportsPower(boolean sportsPower) {
        this.sportsPower = sportsPower;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
