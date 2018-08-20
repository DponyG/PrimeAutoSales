/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darkpony.primeautosales;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.event.ResizeEvent;

/**
 *
 * @author dpony
 */
@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {

    private List<Car> automobile = new ArrayList();
    private String selectionType;
    /**
     * @return the automobile
     */
    public List<Car> getAutomobile() {
        
        Car car1 = new Car();
        car1.setMake("Juneau");
        car1.setModel("Turbo");
        Car car2 = new Car();
        car2.setMake("Acme");
        car2.setModel("Jet");
        Car car3 = new Car();
        car3.setMake("Dell");
        car3.setModel("Rocket");
        automobile.add(car1);
        automobile.add(car2);
        automobile.add(car3);
       
        return automobile;
    }

    /**
     * @param automobile the automobile to set
     */
    public void setAutomobile(List<Car> automobile) {
        this.automobile = automobile;
    }
    
    /**
     * Creates a new instance of MainViewController
     */
    public MainViewController() {
    }
    
    public void layoutResizeEvent(ResizeEvent event) {
        System.out.println("The Layout has been resized " + event.getComponent());
    }

    /**
     * @return the selectionType
     */
    public String getSelectionType() {
        return selectionType;
    }
    
    public String navigateToCar(){
        selectionType = "CAR";
        return "automobile";
    }
    
    public String navigateToTruck(){
        selectionType = "TRUCK";
        return "automobile";
    }
    
     public String navigateToSUV(){
        selectionType = "SUV";
        return "automobile";
    }

    /**
     * @param selectionType the selectionType to set
     */
    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }
    
}
