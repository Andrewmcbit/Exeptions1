import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Information {
    protected String info;

    protected String secondName;
    protected String firstName;
    protected String surName;
    protected Date birth_date;
    protected Long phone_number;
    protected char gender;
    protected SimpleDateFormat format;

    public Information(){
        format = new SimpleDateFormat("dd.MM.yyyy");
    }

    public abstract void setInfo(String string);

    @Override
    public String toString() {
        return info;
    }

    protected abstract void splitInfo();
}