package com.team29.westernmap;

public class POI {
    private int roomNumber;
    private String name;
    private String cat;
    private int position;
    private String desc;
    private boolean hl;

    public POI(int rm, String name, String desc, String cat, int pos){
        this.roomNumber = rm;
        this.name = name;
        this.desc = desc;
        this.cat = cat;
        this.position = pos;
        this.hl = false;
    }

    public void setHighlight(boolean hl){
        if(hl){
            this.hl = true;
        }else{
            this.hl = false;
        }
    }

    public int getRm(){
        return this.roomNumber;
    }
    public void setRm(int newrm){
        this.roomNumber = newrm;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newname){
        this.name = newname;
    }

    public String getDesc(){
        return this.desc;
    }

    public void setDesc(String newdesc){
        this.desc = newdesc;
    }

    public String getCat(){
        return this.cat;
    }

    public void setCat(String newcat){
        this.cat = newcat;
    }

    public void getInfo() {
        System.out.println(this.roomNumber);
        System.out.println(this.name);
        System.out.println(this.cat);
        System.out.println(this.position);
        System.out.println(this.desc);
    }
}
