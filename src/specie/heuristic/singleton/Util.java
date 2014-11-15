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
public class Util<T> implements UtilInteface<T> {

    protected UtilEnum util;

    public double distance(T o) {
        return util.distance(o);
    }

}
