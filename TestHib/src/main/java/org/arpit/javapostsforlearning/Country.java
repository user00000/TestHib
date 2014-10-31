package org.arpit.javapostsforlearning;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.JoinColumn;  
import javax.persistence.OneToOne;  
import javax.persistence.Table;  
  
@Entity  
@Table(name="COUNTRY")  
public class Country {  
   
    @Id  
    @Column(name="Country_Name")  
    String countryName ;  
      
    @OneToOne  
    @JoinColumn(name="Capital_Name")  
    Capital capital;  
       
    @Column(name="Country_Population")  
    long countryPopulation;  
      
    public Country()  
    {  
       
    }  
          
    public Country(String countryName, long countryPopulation) {  
  this.countryName = countryName;  
  this.countryPopulation = countryPopulation;  
 }  
  
    public long getCountryPopulation() {  
  return countryPopulation;  
 }  
  
    public void setCountryPopulation(long countryPopulation) {  
  this.countryPopulation = countryPopulation;  
 }  
  
    public String getCountryName() {  
        return countryName;  
    }  
            
    public void setCountryName(String countryName) {  
        this.countryName = countryName;  
    }  
  
    public Capital getCapital() {  
  return capital;  
 }  
  
    public void setCapital(Capital capital) {  
  this.capital = capital;  
 }  
}  

