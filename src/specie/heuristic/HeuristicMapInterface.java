/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specie.heuristic;

/**
 *
 * @author jroby
 */
public interface HeuristicMapInterface<T> {
    
    public abstract double distance(T a, T b);
    
    
}
