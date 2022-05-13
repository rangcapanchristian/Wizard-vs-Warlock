public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 100 HP and 200 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Harith = new Wizard("Harith");
        Warlock Aldus = new Warlock("Aldus");

        Harith.CalamityReaper(Aldus);
        Harith.LightningTruncheon(Aldus);
        Aldus.Explosion(Harith);
        Harith.DivineGlaive(Harith);
        Aldus.SoulSteal(Harith);
        Aldus.EarthHeal(Aldus);
        Harith.MagicHeal(Harith);
        Harith.IceWand(Aldus);
        Aldus.EarthWildStrike(Harith);
        Harith.FussionMagicPower(Aldus);
    }
}