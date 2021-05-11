package Algorithms;

public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) { //x: cat1, y: cat2, z: mouse
        int cat1Dist = Math.abs(z - x);
        int cat2Dist = Math.abs(z - y);
        return cat1Dist < cat2Dist ? "Cat A" : (cat1Dist > cat2Dist) ? "Cat B" : "Mouse C";
    }
}
