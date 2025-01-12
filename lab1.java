public class lab1 {
    public static void main(String[] args) {
        Vector3D vector = new Vector3D(1.0, 2.0, 3.0);
        System.out.println(vector.toString());
        System.out.println(vector.multiplyVec(2.0));
    }
}
class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double getZ(){return z;}
    
    public String toString() {
        return "Vector3D/(" + x + ", " + y + ", " + z + "/)";
    }

    public String multiplyVec(double cons) {
        return "Vector X Constant(" + (x * cons) + ", " + (y * cons) + ", " + (z * cons) + ")";
    }
}