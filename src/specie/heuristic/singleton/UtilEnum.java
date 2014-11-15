/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specie.heuristic.singleton;

import specie.main.Region;

/**
 *
 * @author jroby
 */
public enum UtilEnum implements UtilInteface {

    RegionUtilEnum(Region.class) {

                @Override
                public double distance(Object o) {
                    filter(o);
                    System.out.println("Hit Enum nice and good");
                    return 0;
                }
            };

    private static void filter(Object o) {
        if (!o.getClass().equals(c)) {
            throw new Error("Class mismatch, expected type " + c.getSimpleName());
        }
    }

    private static Class c;

    private static void setClass(Class cl) {
        c = cl;

    }

    UtilEnum(Class cl) {
        setClass(cl);

    }

}
