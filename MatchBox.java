package boxproject;
/**
* Matchbox.java
*/
public class MatchBox extends Box {
        double  weight;
 
        public MatchBox( double w, double h, double d ) {
            height = h;
            depth = d;
            width = w;
            weight = (w*h*d)*.03611;
        }
 
        public void getVolume() {
        System.out.println("width of matchbox is: "+width);
        System.out.println("height of matchbox is: "+height);
        System.out.println("depth of matchbox is: "+depth);
        System.out.println("Volume is: " + width * height * depth);
 
        }
 
        public void getWeight() {
        System.out.println("weight of matchbox is: "+weight);
        }
 
}
