package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;



public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Select choucair university").locatedBy("//img[@alt='Cursos y Certificaciones']");
    public static final Target INPUT_COURSE = Target.the("Search the course").locatedBy("//input[@id='coursesearchbox']");
    public static final Target BUTTON_GO = Target.the("click to search the course").locatedBy("//button[@class='btn btn-secondary']");
    public static final Target SELECT_INPUT_COURSE = Target.the("click to search the course ").locatedBy("//input[@name='submitbutton']");
    public static final Target NAME_COURSE = Target.the("Extract course name").locatedBy("//h1[contains(text(),'Recursos automatización  Bancolombia']");

}
