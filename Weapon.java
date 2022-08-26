public class Weapon {
  // Weapon attributes
  String object;
  String name;
  int damage;
  double Weight;
  String Rarity;
  String Description;

  // Weapon methods
  public void Weaponlore() {
    System.out.println("Weapon: " + name);
    System.out.println("Damage:" + damage);
    System.out.println("Weight: " + Weight);
    System.out.println("Rarity: " + Rarity);
    System.out.println("Description: " + Description);
  }
}
