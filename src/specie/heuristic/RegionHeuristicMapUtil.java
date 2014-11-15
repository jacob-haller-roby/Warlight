/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specie.heuristic;

import static java.lang.Math.pow;
import static specie.heuristic.HeuristicMapUtil.distance;
import specie.main.Region;

/**
 *
 * @author jroby
 */
public class RegionHeuristicMapUtil{


    public double distance(Region a, Region b) {
        System.out.println("Hit RegionUtil");

        //Euclidean distance of armies
        double distance = 0;
        if (a.getPlayerName().equals(b.getPlayerName())) {
            distance += pow(a.getArmies() - b.getArmies(), 2);
        } else {
            distance += pow(a.getArmies(), 2) + pow(b.getArmies(), 2);
        }

        //Distance of neighbors and superRegion
        //distance += distance(a.getNeighbors(), b.getNeighbors());
        //distance += distance(a.getSuperRegion(), b.getSuperRegion());

        return distance;
    }

}
