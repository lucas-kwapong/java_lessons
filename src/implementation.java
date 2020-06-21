package HumanBeings;

import java.util.Arrays;
import java.util.List;

public class implementation  {
    public static void main(String[] args) {
        Musician Lucas = new Musician("Lucas kwapong Amengor", 22, 180, "Fatheringo", "JEtPlay", Arrays.asList(new String[]{"Links over time", "Pull the Horns"}));
       Lucas.setColorEyes("Blue");
        System.out.println(Lucas.getColorEyes());
        System.out.println(Lucas.getGenre());
        System.out.println(Lucas.getMusicSchool());
        System.out.println(Lucas.YearLeftTOLive());
        System.out.println( Lucas.getColorEyes());
        List<String> Songs= Lucas.getSongs();
        System.out.println(Songs);
        ComputerScientist Fatheringo = new ComputerScientist("Lucas Kwapong Amengor", 22, 190, "Brown", "Mobile Developer", 2,Arrays.asList(new String[]{"Java","Python","C++","JS"}),true );

        System.out.println(Fatheringo.getColorEyes());
        System.out.println(Fatheringo.getRemoteWorkingExperience());
        System.out.println(Fatheringo.YearLeftTOLive());
        System.out.println(Fatheringo.getLanguagesKnown());
        System.out.println( Fatheringo.getYearOfexperience());
        List<String> Languages = Fatheringo.getLanguagesKnown();
        System.out.println(Languages);


    }
}
