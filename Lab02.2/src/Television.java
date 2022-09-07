public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0; //instance counter

  private String brand; //Fields
  private int volume; // Fields

  public Television() { // 3 constructors, 1 with no code, 1 with brand only, 1 with brand and volume
    instanceCount++; //implement our instance counter
  }

  public Television(String brand) {
    this(); //this invokes the constructor above.
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);
  }

  public void turnOn() { //business methods
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() {
    System.out.println("The " + brand + " television is off");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() { // Getters and setters (getters for retrieving a value.
    return brand;
  }

  public void setBrand(String brand) {
    if (brand.equals("Samsung") || brand.equals("Sony") || brand.equals("LG") || brand.equals(
        "TOSHIBA")) {
      this.brand = brand;
    } else {
      System.out.printf(
          "%s is not a valid brand; only Samsung, LG, Sony, and Toshiba are allowed. %n", brand);
    }
  }

  public int getVolume() { //getters don't have anything in ()
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume,
          MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }

  private boolean verifyInternetConnection() {
    return true;  // helper methods
  }

  public String toString() {
    return "Television: brand=" + brand + ", volume=" + volume;
  }
}
