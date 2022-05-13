public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void CalamityReaper(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with CalamityReaper (Damage - 50 , Mana Cost - 10)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void LightningTruncheon(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with LightningTruncheon (Damage - 50 , Mana Cost - 15)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void DivineGlaive(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with BlazingWater (Damage - 50 , Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void MagicHeal(Character characterName) {
        System.out.println(super.characterName + " Use MagicHeal (Heal - 50)");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void IceWand(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with IceWand (Damage - 50 , Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTargett(enemyCharacter, manaPoints);

    }

    public void FussionMagicPower(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with FussionMagicPower (Damage - 50 , Mana Cost - 30)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }

}