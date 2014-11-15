/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specie.heuristic.singleton;

/**
 *
 * @author jroby
 */
public enum UtilEnum implements UtilInteface {

    RegionUtilEnum {
                @Override
                public double distance(Object o) {
                    System.out.println("Hit Enum");
                    return 0;
                }
            };

}
