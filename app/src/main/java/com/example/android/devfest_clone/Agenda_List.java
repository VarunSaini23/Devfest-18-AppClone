package com.example.android.devfest_clone;

public class Agenda_List {

    public int ag_image;
    public String ag_heading;
    public String ag_time;
    public String ag_date;

    public Agenda_List(int ag_imag,String ag_heading,String ag_time){
        this.ag_image = ag_imag;
        this.ag_heading = ag_heading;
        this.ag_time = ag_time;
    }

    public Agenda_List(int ag_imag,String ag_heading,String ag_time,String ag_date){
        this.ag_image = ag_imag;
        this.ag_heading = ag_heading;
        this.ag_time = ag_time;
        this.ag_date = ag_date;

    }

}
