package HumanBeings;

public abstract class Human {
    public final static int LifeSpan =100;
    private String name;
    private int Age ;
    private  int Height ;
    private String ColorEyes;

    public Human(String name, int age, int height) {
        this.name = name;
        this.Age = age;
        this.Height = height;
    }

    public Human(String name, int age, int height, String colorEyes) {
        this.name = name;
        Age = age;
        Height = height;
        ColorEyes = colorEyes;
    }

    public abstract int YearLeftTOLive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public String getColorEyes() {
        return ColorEyes;
    }

    public void setColorEyes(String colorEyes) {
        ColorEyes = colorEyes;
    }
}
