package main.java.org.luby;

/**
 * Created with IntelliJ IDEA.
 * User: Lucy
 * Date: 5/28/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
  static final int GROWTH_RATE = 1; // For now lets grow capacity at a nominal rate
  static final double DECAY_RATE = 0.01; // Stored goo decays at this rate
  private String full_name;
  private double capacity;
  private double capacity_used;

  public Person (String full_name, double capacity) {
    this.full_name = full_name;
    this.capacity = capacity;
    this.capacity_used = 0;
  }

  public Person (String full_name, double capacity, double capacity_used) {
    this.full_name = full_name;
    this.capacity = capacity;
    this.capacity_used = capacity_used;
  }

  public double getCapacity() {
    return this.capacity;
  }

  public double getCapacityUsed() {
    return this.capacity_used;
  }

  public double getCapacityRatio() {
    return this.capacity_used/this.capacity;
  }

  public void addGoo(int goo) {
    if (goo + this.capacity_used <= this.capacity_used && goo + this.capacity_used >= 0) {
      this.capacity_used += goo;
    } // do nothing if trying to add more than can be received or take more than there is
  }

  public String getName() {
    return this.full_name;
  }
  public void addCapacity(int growth) {
    double capacity_ratio = this.getCapacityRatio();

    if (capacity_ratio > 0.75) {
      this.capacity += GROWTH_RATE;
    } else if (capacity_ratio > 0.5) {
      this.capacity += GROWTH_RATE/2;
    } else if (capacity_ratio > 0) {
      this.capacity += GROWTH_RATE/4;
    }
  }
}
