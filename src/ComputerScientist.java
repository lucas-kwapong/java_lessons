package HumanBeings;

import java.util.List;

public class ComputerScientist extends Human {

    private String Profession;
    private int yearOfexperience;
    private List<String> LanguagesKnown;
    private Boolean RemoteWorkingExperience;

    public ComputerScientist(String name, int age, int height, String colorEyes, String profession, int yearOfexperience, List<String> languagesKnown, boolean remoteWorkingExperience) {
        super(name, age, height, colorEyes);
        Profession = profession;
        this.yearOfexperience = yearOfexperience;
        LanguagesKnown = languagesKnown;
        RemoteWorkingExperience = remoteWorkingExperience;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public int getYearOfexperience() {
        return yearOfexperience;
    }

    public void setYearOfexperience(int yearOfexperience) {
        this.yearOfexperience = yearOfexperience;
    }

    public List<String> getLanguagesKnown() {
        return LanguagesKnown;
    }

    public void setLanguagesKnown(List<String> languagesKnown) {
        LanguagesKnown = languagesKnown;
    }

    public Boolean getRemoteWorkingExperience() {
        return RemoteWorkingExperience;
    }

    public void setRemoteWorkingExperience(Boolean remoteWorkingExperience) {
        RemoteWorkingExperience = remoteWorkingExperience;
    }

    @Override
    public int YearLeftTOLive() {
        return (LifeSpan -getAge());
    }
}
