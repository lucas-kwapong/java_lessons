package HumanBeings;

public class Actor extends Human {
    private int YearsOfExperience;
    private String actingSchool;
    private Boolean Director;
    private String Films;

    public Actor(String name, int age, int height, String colorEyes, int yearsOfExperience, String actingSchool, Boolean director, String films) {
        super(name, age, height, colorEyes);
        YearsOfExperience = yearsOfExperience;
        this.actingSchool = actingSchool;
        Director = director;
        Films = films;
    }


    @Override
    public int YearLeftTOLive() {
        return (LifeSpan-getAge());
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        YearsOfExperience = yearsOfExperience;
    }

    public String getActingSchool() {
        return actingSchool;
    }

    public void setActingSchool(String actingSchool) {
        this.actingSchool = actingSchool;
    }

    public Boolean getDirector() {
        return Director;
    }

    public void setDirector(Boolean director) {
        Director = director;
    }

    public String getFilms() {
        return Films;
    }

    public void setFilms(String films) {
        Films = films;
    }
}
