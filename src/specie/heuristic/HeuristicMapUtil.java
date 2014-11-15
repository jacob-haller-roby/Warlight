/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specie.heuristic;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import specie.main.Region;
import specie.main.SuperRegion;

/**
 *
 * @author jroby
 */
public abstract class HeuristicMapUtil<T> implements HeuristicMapInterface<T> {
    
    public abstract HeuristicMapUtil getInstance();

    public static double distance(Collection a, Collection b) {
        List<Region> aMal = new ArrayList<>(a);
        List<Region> bMal = new ArrayList<>(b);

        while (aMal.size() > bMal.size()) {
            bMal.add(null);
        }

        while (aMal.size() < bMal.size()) {
            aMal.add(null);
        }

        Double distanceRecords[][] = new Double[aMal.size()][bMal.size()];

        for (int ai = 0; ai < aMal.size(); ai++) {
            for (int bi = 0; bi < bMal.size(); bi++) {
                distanceRecords[ai][bi] = shortDistance(aMal.get(ai), bMal.get(bi));
            }
        }

        List<Integer> ai = new ArrayList<>();
        List<Integer> bi = new ArrayList<>();

        for (int i = 0; i < aMal.size(); i++) {
            ai.add(i);
            bi.add(i);
        }

        return 0;
    }

    public static double shortDistance(Region a, Region b) {
        return 0;
    }

    public static double distance(SuperRegion a, SuperRegion b) {
        double distance = 0;
        distance += pow(a.getArmiesReward() - b.getArmiesReward(), 2);
        distance += distance(a.getSubRegions(), b.getSubRegions());
        return distance;
    }

}
