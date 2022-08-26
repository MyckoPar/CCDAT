public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();
        
        
       // Weapon Class

    Weapon LightningTruncheon = new Weapon();

    LightningTruncheon.object = "Truncheon";
    LightningTruncheon.name = "Lightning Truncheon";
    LightningTruncheon.damage = 150;
    LightningTruncheon.Weight = 2.5;
    LightningTruncheon.Rarity = "Very Rare";
    LightningTruncheon.Description = "A truncheon made by poseidon";
    LightningTruncheon.Weaponlore();

    Weapon CurseSword = new Weapon();

    CurseSword.object = "Sword";
    CurseSword.name = "Curse Sword";
    CurseSword.damage = 155;
    CurseSword.Weight = 3.5;
    CurseSword.Rarity = "Extremely Rare";
    CurseSword.Description = "A Curse Sword that only choose its own user";
    CurseSword.Weaponlore();

    Weapon CommonBow = new Weapon();

    CommonBow.object = "Bow";
    CommonBow.name = "Common Bow";
    CommonBow.damage = 120;
    CommonBow.Weight = 5;
    CommonBow.Rarity = "Common";
    CommonBow.Description = "Bow that can be bought by everybody";
    CommonBow.Weaponlore();

  }
}
