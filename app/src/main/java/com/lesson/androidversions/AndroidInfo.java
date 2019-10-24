package com.lesson.androidversions;

public class AndroidInfo
{
    int logo;
    String name, version, level, date;

        public AndroidInfo(int logo, String name, String version, String level, String date)
        {
            this.logo = logo;
            this.name = name;
            this.version = version;
            this.level = level;
            this.date = date;
        }

    public int getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getLevel() {
        return level;
    }

    public String getDate() {
        return date;
    }
}
