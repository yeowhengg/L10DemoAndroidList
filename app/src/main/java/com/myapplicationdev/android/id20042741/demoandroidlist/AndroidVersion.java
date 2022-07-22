package com.myapplicationdev.android.id20042741.demoandroidlist;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion (String name, String version){
        this.name = name;
        this.version = version;
    }

    public String getName(){
        return this.name;
    }

    public String getVersion(){
        return this.version;
    }

    public void setName (String newName){
        this.name = newName;
    }

    public void setVersion (String newVersion){
        this.version = newVersion;
    }

    public String toString(){
        return name + ": " + version;
    }
}
