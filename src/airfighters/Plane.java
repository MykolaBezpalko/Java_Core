package airfighters;

abstract class Plane extends Controller{
    public abstract void engineLaunch();

    public abstract void planeRise();

    public void planeLanding() {
        System.out.println("Йду на посадку. ");
    }

    int planeLength;
    int planeWidth;
    int planeWeight;
}
