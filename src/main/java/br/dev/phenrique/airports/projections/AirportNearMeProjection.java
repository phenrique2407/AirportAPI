/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.dev.phenrique.airports.projections;

/**
 *
 * @author sesidevb
*/
/**
 * Interface para mapear os atributos da Query personalizada
 * criada em AirportRepositories.
 */

public interface AirportNearMeProjection {

    long getId();
    String getName();
    String getCity();
    String getIataCode();
    double getLatitude();
    double getLongitude();
    double getAltitude();
    double getDistanciaKM(); 
    
}