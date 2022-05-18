package ua.com.foxminded.motomanager;

public interface Serviceable {
    public boolean isReadyToService();
    public int getDistanceOnService();
    public void adDistance(int additionalDistance);
}
