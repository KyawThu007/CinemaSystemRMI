package Controller;

import Model.BuySeat;
import java.util.List;

public class SharedData {

    private int cinema_id,port;
    private List<BuySeat> buySeatlist;
    private String control,date;
    private String[] genreList= {"Action","Adventure","Supernatural","Comedy","Drama","Fantasy","Historical","Horror","Musical","Mystery","Romance","Sci-Fi","Thriller","Western","Documentary","Biography","Crime","Animation"};
    private String[] monthList={"January","February","March","April","May","June","July","August","September","October","November","December"};
    private static SharedData instance;

    private SharedData() {
    }

    public static SharedData getInstance() {
        if (instance == null) {
            instance = new SharedData();
        }
        return instance;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(int cinema_id) {
        this.cinema_id = cinema_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<BuySeat> getBuySeatlist() {
        return buySeatlist;
    }

    public void setBuySeatlist(List<BuySeat> buySeatlist) {
        this.buySeatlist = buySeatlist;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String[] getGenreList() {
        return genreList;
    }

    public String[] getMonthList() {
        return monthList;
    }

}
