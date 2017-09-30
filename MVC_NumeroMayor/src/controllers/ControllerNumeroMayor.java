/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewNumeroMayor;
import models.ModelNumeroMayor;
/**
 *
 * @author Emma
 */
public class ControllerNumeroMayor {
    ViewNumeroMayor view_numeromayor;
    ModelNumeroMayor model_numeromayor;
    public ControllerNumeroMayor(ViewNumeroMayor view_mayor, ModelNumeroMayor model_mayor){
        this.view_numeromayor = view_mayor;
        this.model_numeromayor = model_mayor;
        view_mayor.jbtn_mayor.addActionListener(e -> jbtn_mayor_click());
        initView();
    }

    public void initView(){
    view_numeromayor.jtf_n1.setText(String.valueOf(model_numeromayor.getN1()));
    view_numeromayor.jtf_n2.setText(String.valueOf(model_numeromayor.getN2()));
    view_numeromayor.jtf_n3.setText(String.valueOf(model_numeromayor.getN3()));
    view_numeromayor.jtf_m.setText(String.valueOf(model_numeromayor.getM()));
    view_numeromayor.setVisible(true);
    }
    public void jbtn_mayor_click(){
        model_numeromayor.setN1(Integer.parseInt(view_numeromayor.jtf_n1.getText()));   
        model_numeromayor.setN2(Integer.parseInt(view_numeromayor.jtf_n2.getText()));
        model_numeromayor.setN3(Integer.parseInt(view_numeromayor.jtf_n3.getText()));   
        model_numeromayor.mayor();
        view_numeromayor.jtf_m.setText(String.valueOf(model_numeromayor.getM()));
    
    }
}


