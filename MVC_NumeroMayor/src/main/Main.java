/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewNumeroMayor;
import models.ModelNumeroMayor;
import controllers.ControllerNumeroMayor;

/**
 *
 * @author PC9
 */
public class Main {
    private static ViewNumeroMayor view_numeromayor;
    private static ModelNumeroMayor model_numeromayor;
    private static ControllerNumeroMayor controller_numeromayor;
      public static void main(String jvt[]){
        model_numeromayor= new ModelNumeroMayor();
        view_numeromayor= new ViewNumeroMayor();
        controller_numeromayor= new ControllerNumeroMayor(view_numeromayor, model_numeromayor);
}
}