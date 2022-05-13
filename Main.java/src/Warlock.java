public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void Explosion(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Explosion (Damage - 40 , Mana Cost - 20)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void SoulSteal(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with ChasmTrample (Damage - 50 , Mana Cost - 30)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void EarthHeal(Character characterName) {
        System.out.println("Both use Heal");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(super.characterName + " Use EarthHeal (Heal - 50)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void EarthWildStrike(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with EarthWildStrike (Damage - 50 , Mana Cost - 15)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);
    }
}