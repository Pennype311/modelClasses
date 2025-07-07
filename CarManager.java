package com.mycompany.carprj;



import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell G5
 */
public class CarManager {
    public static void main(String[] args) {
      
        
      
     // Líst tuy chon menu
     
        ArrayList<String> ops =new ArrayList<>();
        ops.add("List all brands");
        ops.add("Add a new brand");
        ops.add("Search a brand based on its ID");
        ops.add("Update a brand");
        ops.add("Save brands to the file, named brands.txt");
        ops.add("List all cars in ascending order of brand names");
        ops.add("List cars based on a part of an input brand name");
        ops.add("Add a car");
        ops.add("Remove a car based on its ID");
        ops.add("Update a car based on its ID");
        ops.add("Save cars to file");
        ops.add("Exit");
        
       //empty brandList
        BrandList brandList = new BrandList();
       //load brand.txt
       if(brandList.loadFromFile("brand.txt")){
           System.out.println("Brand list loaded successfully.");
       }
       else {
            System.out.println("Failed to load brand list.");
       }
       //empty carList
         CarList carList = new CarList(brandList);
       //load cars.txt
        if (carList.loadFromFile("cars.txt")) {
            System.out.println("Failed to load car list.");
        } else {
            System.out.println("Car list loaded successfully.");
        }  
        Menu menu =new Menu();
    int choice;
do {
    System.out.println("\n====== Car Management Program ======");
    choice=menu.int_getChoice(ops);
    
    switch (choice) {
                case 1: // List all brands
                    brandList.listBrands();
                    break;
                case 2: // Add a new brand
                    brandList.addBrand();
                    break;
                case 3:// Search a brand based on its ID
                    brandList.searchID();
                    break;
                case 4: //Update a brand
                    brandList.updateBrand();
                    break;
                case 5: //Save brands to the file, named brands.txt
                    brandList.saveToFile("brand.txt");
                    break;  
                case 6: //List all cars in ascending order of brand names
                    carList.listCars();
                    break;  
                case 7://List cars based on a part of an input brand name
                    carList.listCarsByBrandName();
                    break;  
                case 8://Add a car
                    carList.addCar();
                    break;   
                case 9://Remove a car based on its ID
                    carList.removeCar();
                    break;  
                case 10:// Update a car based on its ID
                    carList.updateCar();
                    break;  
                case 11://Save cars to file, named cars.txt
                    carList.saveToFile("cars.txt");
                    break;    
                case 12:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
                   // choice=menu.int_getChoice(ops);
            }
        } while ( choice !=12);
    }
}
